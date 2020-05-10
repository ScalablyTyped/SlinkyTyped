package typingsSlinky.formatjsIntlRelativetimeformat.coreMod

import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.`best fit`
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.always
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.auto
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.long
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.lookup
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.narrow
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlRelativeTimeFormatOptions extends js.Object {
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var numeric: js.UndefOr[always | auto] = js.native
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: js.UndefOr[long | short | narrow] = js.native
}

object IntlRelativeTimeFormatOptions {
  @scala.inline
  def apply(): IntlRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntlRelativeTimeFormatOptions]
  }
  @scala.inline
  implicit class IntlRelativeTimeFormatOptionsOps[Self <: IntlRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNumeric(value: always | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: long | short | narrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

