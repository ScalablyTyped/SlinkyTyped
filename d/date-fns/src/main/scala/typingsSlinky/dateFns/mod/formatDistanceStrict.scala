package typingsSlinky.dateFns.mod

import typingsSlinky.dateFns.anon.RoundingMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "formatDistanceStrict")
@js.native
object formatDistanceStrict extends js.Object {
  def apply(date: Double, baseDate: Double): String = js.native
  def apply(date: Double, baseDate: Double, options: RoundingMethod): String = js.native
  def apply(date: Double, baseDate: js.Date): String = js.native
  def apply(date: Double, baseDate: js.Date, options: RoundingMethod): String = js.native
  def apply(date: js.Date, baseDate: Double): String = js.native
  def apply(date: js.Date, baseDate: Double, options: RoundingMethod): String = js.native
  def apply(date: js.Date, baseDate: js.Date): String = js.native
  def apply(date: js.Date, baseDate: js.Date, options: RoundingMethod): String = js.native
}

