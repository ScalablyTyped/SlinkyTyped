package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeatherForecastResult extends js.Object {
  var adcode: String = js.native
  var city: String = js.native
  var forecasts: js.Array[Forecast] = js.native
  var info: String = js.native
  var province: String = js.native
  var reportTime: String = js.native
}

object WeatherForecastResult {
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    forecasts: js.Array[Forecast],
    info: String,
    province: String,
    reportTime: String
  ): WeatherForecastResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherForecastResult]
  }
  @scala.inline
  implicit class WeatherForecastResultOps[Self <: WeatherForecastResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecasts(value: js.Array[Forecast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

