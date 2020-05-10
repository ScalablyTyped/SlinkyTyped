package typingsSlinky.formatjsIntlDisplaynames.mod

import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayNamesOptions extends js.Object {
  var fallback: js.UndefOr[code | none] = js.native
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
  var style: js.UndefOr[narrow | short | long] = js.native
  var `type`: js.UndefOr[language | region | script | currency] = js.native
}

object DisplayNamesOptions {
  @scala.inline
  def apply(): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayNamesOptions]
  }
  @scala.inline
  implicit class DisplayNamesOptionsOps[Self <: DisplayNamesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallback(value: code | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: lookup | (`best fit`)): Self = {
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
    def withStyle(value: narrow | short | long): Self = {
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
    @scala.inline
    def withType(value: language | region | script | currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

