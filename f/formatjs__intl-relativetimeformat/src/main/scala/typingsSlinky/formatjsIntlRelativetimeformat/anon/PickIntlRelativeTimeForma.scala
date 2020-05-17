package typingsSlinky.formatjsIntlRelativetimeformat.anon

import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.`best fit`
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat/lib/core.IntlRelativeTimeFormatOptions, 'localeMatcher'> */
@js.native
trait PickIntlRelativeTimeForma extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}

object PickIntlRelativeTimeForma {
  @scala.inline
  def apply(): PickIntlRelativeTimeForma = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIntlRelativeTimeForma]
  }
  @scala.inline
  implicit class PickIntlRelativeTimeFormaOps[Self <: PickIntlRelativeTimeForma] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaleMatcher(value: (`best fit`) | lookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
  }
  
}

