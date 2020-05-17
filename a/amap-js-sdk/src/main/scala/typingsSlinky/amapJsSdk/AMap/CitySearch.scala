package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CitySearch extends EventBindable {
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
  ): Unit = js.native
  def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit = js.native
}

object CitySearch {
  @scala.inline
  def apply(
    getCityByIp: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Unit,
    getLocalCity: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit
  ): CitySearch = {
    val __obj = js.Dynamic.literal(getCityByIp = js.Any.fromFunction2(getCityByIp), getLocalCity = js.Any.fromFunction1(getLocalCity), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[CitySearch]
  }
  @scala.inline
  implicit class CitySearchOps[Self <: CitySearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCityByIp(
      value: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCityByIp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetLocalCity(value: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalCity")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

