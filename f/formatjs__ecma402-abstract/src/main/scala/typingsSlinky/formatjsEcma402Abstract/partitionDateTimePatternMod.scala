package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatPart
import typingsSlinky.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typingsSlinky.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typingsSlinky.std.Intl.DateTimeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/PartitionDateTimePattern", JSImport.Namespace)
@js.native
object partitionDateTimePatternMod extends js.Object {
  
  def PartitionDateTimePattern(
    dtf: DateTimeFormat,
    x: Double,
    implDetails: ToLocalTimeImplDetails with FormatDateTimePatternImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
