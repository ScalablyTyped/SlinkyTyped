package typingsSlinky.rrule.rrulestrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RRuleStrOptions extends js.Object {
  var cache: Boolean = js.native
  var compatible: Boolean = js.native
  var dtstart: js.Date | Null = js.native
  var forceset: Boolean = js.native
  var tzid: String | Null = js.native
  var unfold: Boolean = js.native
}

object RRuleStrOptions {
  @scala.inline
  def apply(cache: Boolean, compatible: Boolean, forceset: Boolean, unfold: Boolean): RRuleStrOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], compatible = compatible.asInstanceOf[js.Any], forceset = forceset.asInstanceOf[js.Any], unfold = unfold.asInstanceOf[js.Any])
    __obj.asInstanceOf[RRuleStrOptions]
  }
  @scala.inline
  implicit class RRuleStrOptionsOps[Self <: RRuleStrOptions] (val x: Self) extends AnyVal {
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
    def withCompatible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtstart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtstart")(null)
        ret
    }
    @scala.inline
    def withTzid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTzidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tzid")(null)
        ret
    }
  }
  
}

