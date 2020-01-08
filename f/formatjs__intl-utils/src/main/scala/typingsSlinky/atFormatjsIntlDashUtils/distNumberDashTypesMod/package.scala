package typingsSlinky.atFormatjsIntlDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNumberDashTypesMod {
  import typingsSlinky.atFormatjsIntlDashUtils.Anon_Other
  import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.other
  import typingsSlinky.atFormatjsIntlDashUtils.distPluralDashRulesDashTypesMod.LDMLPluralRule
  import typingsSlinky.atFormatjsIntlDashUtils.distTypesMod.LocaleData
  import typingsSlinky.std.Omit
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type LDMLPluralRuleMap[T] = (Omit[Partial[Record[LDMLPluralRule, T]], other]) with Anon_Other[T]
  type NumberLocaleData = LocaleData[NumberInternalSlots]
  type NumberingSystem = String
  type RawNumberLocaleData = LocaleData[NumberLocaleInternalData]
}
