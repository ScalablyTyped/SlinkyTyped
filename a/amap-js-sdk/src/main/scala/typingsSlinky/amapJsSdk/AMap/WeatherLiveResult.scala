package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 天气插件
@js.native
trait WeatherLiveResult extends js.Object {
  var adcode: String = js.native
  var city: String = js.native
  var humidity: String = js.native
  var info: String = js.native
  var province: String = js.native
  var reportTime: String = js.native
  var temperature: Double = js.native
  var weather: String = js.native
  var windDirection: String = js.native
  var windPower: Double = js.native
}

object WeatherLiveResult {
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    humidity: String,
    info: String,
    province: String,
    reportTime: String,
    temperature: Double,
    weather: String,
    windDirection: String,
    windPower: Double
  ): WeatherLiveResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], humidity = humidity.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any], weather = weather.asInstanceOf[js.Any], windDirection = windDirection.asInstanceOf[js.Any], windPower = windPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherLiveResult]
  }
  @scala.inline
  implicit class WeatherLiveResultOps[Self <: WeatherLiveResult] (val x: Self) extends AnyVal {
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
    def withHumidity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humidity")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTemperature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeather(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weather")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windPower")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

