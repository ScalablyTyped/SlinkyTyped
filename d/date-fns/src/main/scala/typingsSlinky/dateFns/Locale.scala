package typingsSlinky.dateFns

import typingsSlinky.dateFns.anon.DateTime
import typingsSlinky.dateFns.anon.Day
import typingsSlinky.dateFns.anon.FirstWeekContainsDateWeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var code: js.UndefOr[String] = js.native
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var formatLong: js.UndefOr[DateTime] = js.native
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var localize: js.UndefOr[Day] = js.native
  var `match`: js.UndefOr[Day] = js.native
  var options: js.UndefOr[FirstWeekContainsDateWeekStartsOn] = js.native
}

object Locale {
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def withFormatLong(value: DateTime): Self = {
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
    def withLocalize(value: Day): Self = {
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
    def withMatch(value: Day): Self = {
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
    def withOptions(value: FirstWeekContainsDateWeekStartsOn): Self = {
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

