package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Weather extends js.Object {
  /**
    * 查询四天预报天气，包括查询当天天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getForecast(
    district: String,
    callback: js.Function2[/* errorStatus */ js.Any, /* result */ WeatherForecastResult, Unit]
  ): Unit = js.native
  /**
    * 查询实时天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getLive(
    district: String,
    callback: js.Function2[/* errorStatus */ js.Any, /* result */ WeatherLiveResult, Unit]
  ): Unit = js.native
}

object Weather {
  @scala.inline
  def apply(
    getForecast: (String, js.Function2[/* errorStatus */ js.Any, /* result */ WeatherForecastResult, Unit]) => Unit,
    getLive: (String, js.Function2[/* errorStatus */ js.Any, /* result */ WeatherLiveResult, Unit]) => Unit
  ): Weather = {
    val __obj = js.Dynamic.literal(getForecast = js.Any.fromFunction2(getForecast), getLive = js.Any.fromFunction2(getLive))
    __obj.asInstanceOf[Weather]
  }
  @scala.inline
  implicit class WeatherOps[Self <: Weather] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetForecast(
      value: (String, js.Function2[/* errorStatus */ js.Any, /* result */ WeatherForecastResult, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForecast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLive(
      value: (String, js.Function2[/* errorStatus */ js.Any, /* result */ WeatherLiveResult, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLive")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

