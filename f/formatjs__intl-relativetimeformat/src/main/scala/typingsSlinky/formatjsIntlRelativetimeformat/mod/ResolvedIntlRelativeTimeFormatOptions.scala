package typingsSlinky.formatjsIntlRelativetimeformat.mod

import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.always
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.auto
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.long
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.narrow
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions, 'style' | 'numeric'> */
@js.native
trait ResolvedIntlRelativeTimeFormatOptions extends js.Object {
  /**
    * The BCP 47 language tag for the locale actually used.
    * If any Unicode extension values were requested in the
    * input BCP 47 language tag that led to this locale,
    * the key-value pairs that were requested and are
    * supported for this locale are included in locale.
    */
  var locale: String = js.native
  /**
    * The value requested using the Unicode
    * extension key "nu" or filled in as a default.
    */
  var numberingSystem: String = js.native
  var numeric: js.UndefOr[always | auto] = js.native
  var style: js.UndefOr[long | short | narrow] = js.native
}

object ResolvedIntlRelativeTimeFormatOptions {
  @scala.inline
  def apply(locale: String, numberingSystem: String): ResolvedIntlRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedIntlRelativeTimeFormatOptions]
  }
  @scala.inline
  implicit class ResolvedIntlRelativeTimeFormatOptionsOps[Self <: ResolvedIntlRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberingSystem")(value.asInstanceOf[js.Any])
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

