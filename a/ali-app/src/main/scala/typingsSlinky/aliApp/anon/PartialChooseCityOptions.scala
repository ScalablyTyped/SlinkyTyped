package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.City
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ChooseCityOptions> */
@js.native
trait PartialChooseCityOptions extends js.Object {
  var cities: js.UndefOr[js.Array[City]] = js.native
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var hotCities: js.UndefOr[js.Array[City]] = js.native
  var showHotCities: js.UndefOr[Boolean] = js.native
  var showLocatedCity: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function1[/* result */ AdCode, Unit]] = js.native
}

object PartialChooseCityOptions {
  @scala.inline
  def apply(): PartialChooseCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseCityOptions]
  }
  @scala.inline
  implicit class PartialChooseCityOptionsOps[Self <: PartialChooseCityOptions] (val x: Self) extends AnyVal {
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
    def withoutCities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withHotCities(value: js.Array[City]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotCities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotCities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotCities")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHotCities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHotCities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHotCities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHotCities")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLocatedCity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocatedCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLocatedCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocatedCity")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* result */ AdCode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

