package typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat
  extends typingsSlinky.std.Intl.DateTimeFormat {
  
  def formatRange(startDate: Double, endDate: Double): String = js.native
  def formatRange(startDate: Double, endDate: js.Date): String = js.native
  def formatRange(startDate: js.Date, endDate: Double): String = js.native
  def formatRange(startDate: js.Date, endDate: js.Date): String = js.native
  
  def formatRangeToParts(startDate: Double, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: js.Date): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: js.Date, endDate: Double): js.Array[IntlDateTimeFormatPart] = js.native
  def formatRangeToParts(startDate: js.Date, endDate: js.Date): js.Array[IntlDateTimeFormatPart] = js.native
}
