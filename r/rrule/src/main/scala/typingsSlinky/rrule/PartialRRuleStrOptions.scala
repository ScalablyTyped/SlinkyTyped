package typingsSlinky.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/rrulestr.RRuleStrOptions> */
@js.native
trait PartialRRuleStrOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var compatible: js.UndefOr[Boolean] = js.native
  var dtstart: js.UndefOr[js.Date] = js.native
  var forceset: js.UndefOr[Boolean] = js.native
  var tzid: js.UndefOr[String] = js.native
  var unfold: js.UndefOr[Boolean] = js.native
}

object PartialRRuleStrOptions {
  @scala.inline
  def apply(): PartialRRuleStrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRRuleStrOptions]
  }
  @scala.inline
  implicit class PartialRRuleStrOptionsOps[Self <: PartialRRuleStrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatible")(js.undefined)
        ret
    }
    @scala.inline
    def withDtstart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(js.undefined)
        ret
    }
    @scala.inline
    def withForceset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceset")(js.undefined)
        ret
    }
    @scala.inline
    def withTzid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTzid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfold")(js.undefined)
        ret
    }
  }
  
}

