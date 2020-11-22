package typingsSlinky.formatjsEcma402Abstract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dateTimeMod {
  
  type IntervalFormatsData = typingsSlinky.formatjsEcma402Abstract.anon.IntervalFormatFallback with (typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.Record[java.lang.String, java.lang.String]])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Intl.DateTimeFormatPartTypes
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ampm
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.relatedYear
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.yearName
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.unknown
  */
  type IntlDateTimeFormatPartType = typingsSlinky.formatjsEcma402Abstract.dateTimeMod._IntlDateTimeFormatPartType | typingsSlinky.std.Intl.DateTimeFormatPartTypes
  
  type TimeZoneNameData = typingsSlinky.std.Record[java.lang.String, typingsSlinky.formatjsEcma402Abstract.anon.Long]
  
  type UnpackedZoneData = js.Tuple4[scala.Double, java.lang.String, scala.Double, scala.Boolean]
}
