package typingsSlinky.rmcDashCalendar

import typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.Locale
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  def formatDate(date: js.Date, format: String): String = js.native
  def formatDate(date: js.Date, format: String, locale: Locale): String = js.native
  def mergeDateTime(): js.Date = js.native
  def mergeDateTime(date: js.UndefOr[scala.Nothing], time: js.Date): js.Date = js.native
  def mergeDateTime(date: Date): js.Date = js.native
  def mergeDateTime(date: Date, time: js.Date): js.Date = js.native
  def shallowEqual(objA: js.Any, objB: js.Any): Boolean = js.native
  def shallowEqual(objA: js.Any, objB: js.Any, exclude: js.Array[String]): Boolean = js.native
}

