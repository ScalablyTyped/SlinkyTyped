package typingsSlinky.formatjsIntlListformat.anon

import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-listformat.@formatjs/intl-listformat/lib/core.IntlListFormatOptions, 'localeMatcher'> */
@js.native
trait PickIntlListFormatOptions extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}

object PickIntlListFormatOptions {
  @scala.inline
  def apply(): PickIntlListFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIntlListFormatOptions]
  }
  @scala.inline
  implicit class PickIntlListFormatOptionsOps[Self <: PickIntlListFormatOptions] (val x: Self) extends AnyVal {
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

