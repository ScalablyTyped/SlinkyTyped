package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forecast extends js.Object {
  var date: String = js.native
  var dayTemp: Double = js.native
  var dayWeather: String = js.native
  var dayWindDir: String = js.native
  var dayWindPower: String = js.native
  var nightTemp: Double = js.native
  var nightWeather: String = js.native
  var nightWindDir: String = js.native
  var nightWindPower: String = js.native
  var week: String = js.native
}

object Forecast {
  @scala.inline
  def apply(
    date: String,
    dayTemp: Double,
    dayWeather: String,
    dayWindDir: String,
    dayWindPower: String,
    nightTemp: Double,
    nightWeather: String,
    nightWindDir: String,
    nightWindPower: String,
    week: String
  ): Forecast = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dayTemp = dayTemp.asInstanceOf[js.Any], dayWeather = dayWeather.asInstanceOf[js.Any], dayWindDir = dayWindDir.asInstanceOf[js.Any], dayWindPower = dayWindPower.asInstanceOf[js.Any], nightTemp = nightTemp.asInstanceOf[js.Any], nightWeather = nightWeather.asInstanceOf[js.Any], nightWindDir = nightWindDir.asInstanceOf[js.Any], nightWindPower = nightWindPower.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forecast]
  }
  @scala.inline
  implicit class ForecastOps[Self <: Forecast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayWeather(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayWeather")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayWindDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayWindDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayWindPower(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayWindPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNightTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNightWeather(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightWeather")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNightWindDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightWindDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNightWindPower(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightWindPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

