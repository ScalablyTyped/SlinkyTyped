package typingsSlinky.adhan.adhanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdhanDate extends js.Object {
  def dateByAddingDays(date: js.Date, days: Double): String = js.native
  def dateByAddingHours(date: js.Date, hours: Double): String = js.native
  def dateByAddingMinutes(date: js.Date, minutes: Double): String = js.native
  def dateByAddingSeconds(date: js.Date, seconds: Double): String = js.native
  def dayOfYear(date: js.Date): String = js.native
  def formattedTime(prayerTime: js.Date): String = js.native
  def formattedTime(prayerTime: js.Date, offset: Double): String = js.native
  def formattedTime(prayerTime: js.Date, offset: Double, style: TimeMode): String = js.native
  def julianDate(date: js.Date): String = js.native
  def roundedMinute(date: js.Date): String = js.native
}

