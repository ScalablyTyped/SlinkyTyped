package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.dateTimeMod.IntlDateTimeFormatPart
import typingsSlinky.formatjsEcma402Abstract.formatDateTimePatternMod.FormatDateTimePatternImplDetails
import typingsSlinky.formatjsEcma402Abstract.toLocalTimeMod.ToLocalTimeImplDetails
import typingsSlinky.std.Intl.DateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionDateTimePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/PartitionDateTimePattern", "PartitionDateTimePattern")
  @js.native
  def PartitionDateTimePattern(
    dtf: DateTimeFormat,
    x: Double,
    implDetails: ToLocalTimeImplDetails with FormatDateTimePatternImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
}
