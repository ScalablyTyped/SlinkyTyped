package typingsSlinky.formatjsIntlDisplaynames.libMod

import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayNamesResolvedOptions extends js.Object {
  var fallback: NonNullable[js.UndefOr[code | none]]
  var locale: String
  var style: NonNullable[js.UndefOr[narrow | short | long]]
  var `type`: NonNullable[js.UndefOr[language | region | script | currency]]
}

object DisplayNamesResolvedOptions {
  @scala.inline
  def apply(
    locale: String,
    fallback: NonNullable[js.UndefOr[code | none]] = null,
    style: NonNullable[js.UndefOr[narrow | short | long]] = null,
    `type`: NonNullable[js.UndefOr[language | region | script | currency]] = null
  ): DisplayNamesResolvedOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesResolvedOptions]
  }
}

