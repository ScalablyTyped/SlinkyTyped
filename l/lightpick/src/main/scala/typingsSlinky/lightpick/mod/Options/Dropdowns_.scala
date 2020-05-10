package typingsSlinky.lightpick.mod.Options

import typingsSlinky.lightpick.mod.Options.Dropdowns.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdowns_ extends js.Object {
  /**
    * true/false for enable/disable dropdown of months.
    */
  var months: js.UndefOr[Boolean] = js.native
  /**
    * Can be false for disable dropdown of years.
    */
  var years: js.UndefOr[Boolean | Years] = js.native
}

object Dropdowns_ {
  @scala.inline
  def apply(): Dropdowns_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dropdowns_]
  }
  @scala.inline
  implicit class Dropdowns_Ops[Self <: Dropdowns_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withYears(value: Boolean | Years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.undefined)
        ret
    }
  }
  
}

