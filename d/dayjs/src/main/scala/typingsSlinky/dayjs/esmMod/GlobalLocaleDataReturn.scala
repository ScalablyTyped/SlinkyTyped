package typingsSlinky.dayjs.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalLocaleDataReturn extends js.Object {
  
  def firstDayOfWeek(): Double = js.native
  
  def longDateFormat(format: String): String = js.native
  
  def meridiem(): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double): String = js.native
  def meridiem(hour: js.UndefOr[scala.Nothing], minute: Double, isLower: Boolean): String = js.native
  def meridiem(hour: Double): String = js.native
  def meridiem(hour: Double, minute: js.UndefOr[scala.Nothing], isLower: Boolean): String = js.native
  def meridiem(hour: Double, minute: Double): String = js.native
  def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
  
  def months(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  def monthsShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
  
  def weekdays(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  def weekdaysMin(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  
  def weekdaysShort(): typingsSlinky.dayjs.localeDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
}
