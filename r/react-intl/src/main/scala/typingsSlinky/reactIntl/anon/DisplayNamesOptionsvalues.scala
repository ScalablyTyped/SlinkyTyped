package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.code
import typingsSlinky.reactIntl.reactIntlStrings.currency
import typingsSlinky.reactIntl.reactIntlStrings.language
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.none
import typingsSlinky.reactIntl.reactIntlStrings.region
import typingsSlinky.reactIntl.reactIntlStrings.script
import typingsSlinky.reactIntl.reactIntlStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-displaynames.@formatjs/intl-displaynames/lib.DisplayNamesOptions & {  value  :string | number | object} */
@js.native
trait DisplayNamesOptionsvalues extends js.Object {
  var fallback: js.UndefOr[code | none] = js.native
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
  var style: js.UndefOr[narrow | short | long] = js.native
  var `type`: js.UndefOr[language | region | script | currency] = js.native
  var value: String | Double | js.Object = js.native
}

object DisplayNamesOptionsvalues {
  @scala.inline
  def apply(value: String | Double | js.Object): DisplayNamesOptionsvalues = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptionsvalues]
  }
  @scala.inline
  implicit class DisplayNamesOptionsvaluesOps[Self <: DisplayNamesOptionsvalues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String | Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
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

