package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonAdCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseCityOptions
  extends BaseOptions[js.Any, js.Any] {
  		// 	是否显示热门城市，默认 true
  var cities: js.Array[City] = js.native
  				// 自定义城市列表，列表内对象字段见下表
  var hotCities: js.Array[City] = js.native
  	// 	是否显示当前定位城市，默认 false
  var showHotCities: Boolean = js.native
  var showLocatedCity: Boolean = js.native
  			// 自定义热门城市列表，列表内对象字段见下表
  @JSName("success")
  def success_MChooseCityOptions(result: AnonAdCode): Unit = js.native
}

object ChooseCityOptions {
  @scala.inline
  def apply(
    cities: js.Array[City],
    hotCities: js.Array[City],
    showHotCities: Boolean,
    showLocatedCity: Boolean,
    success: AnonAdCode => Unit
  ): ChooseCityOptions = {
    val __obj = js.Dynamic.literal(cities = cities.asInstanceOf[js.Any], hotCities = hotCities.asInstanceOf[js.Any], showHotCities = showHotCities.asInstanceOf[js.Any], showLocatedCity = showLocatedCity.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseCityOptions]
  }
  @scala.inline
  implicit class ChooseCityOptionsOps[Self <: ChooseCityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCities(value: js.Array[City]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotCities(value: js.Array[City]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotCities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHotCities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHotCities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowLocatedCity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocatedCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonAdCode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

