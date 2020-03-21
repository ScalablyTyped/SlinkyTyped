package typingsSlinky.formatjsIntlDisplaynames.libMod

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

trait DisplayNamesOptions extends js.Object {
  var fallback: js.UndefOr[code | none] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var style: js.UndefOr[narrow | short | long] = js.undefined
  var `type`: js.UndefOr[language | region | script | currency] = js.undefined
}

object DisplayNamesOptions {
  @scala.inline
  def apply(
    fallback: code | none = null,
    localeMatcher: lookup | (`best fit`) = null,
    style: narrow | short | long = null,
    `type`: language | region | script | currency = null
  ): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptions]
  }
}

