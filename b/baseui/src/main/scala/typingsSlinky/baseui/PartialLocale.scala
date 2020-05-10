package typingsSlinky.baseui

import typingsSlinky.dateFns.AnonDateTime
import typingsSlinky.dateFns.AnonDay
import typingsSlinky.dateFns.AnonFirstWeekContainsDateWeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<date-fns.Locale> */
@js.native
trait PartialLocale extends js.Object {
  var code: js.UndefOr[String] = js.native
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var formatLong: js.UndefOr[AnonDateTime] = js.native
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var localize: js.UndefOr[AnonDay] = js.native
  var `match`: js.UndefOr[AnonDay] = js.native
  var options: js.UndefOr[AnonFirstWeekContainsDateWeekStartsOn] = js.native
}

object PartialLocale {
  @scala.inline
  def apply(): PartialLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocale]
  }
  @scala.inline
  implicit class PartialLocaleOps[Self <: PartialLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDistance(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDistance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatLong(value: AnonDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLong")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatRelative(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRelative")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalize(value: AnonDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localize")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: AnonDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonFirstWeekContainsDateWeekStartsOn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

