package typingsSlinky.reactIntl

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
trait DisplayNamesOptionsvalues extends js.Object {
  var fallback: js.UndefOr[code | none] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var style: js.UndefOr[narrow | short | long] = js.undefined
  var `type`: js.UndefOr[language | region | script | currency] = js.undefined
  var value: String | Double | js.Object
}

object DisplayNamesOptionsvalues {
  @scala.inline
  def apply(
    value: String | Double | js.Object,
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null
  ): DisplayNamesOptionsvalues = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptionsvalues]
  }
}

