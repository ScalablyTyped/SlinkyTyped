package typingsSlinky.dateFns.mod

import typingsSlinky.dateFns.AnonRoundingMethod
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "formatDistanceStrict")
@js.native
object formatDistanceStrict extends js.Object {
  def apply(date: Double, baseDate: Double): String = js.native
  def apply(date: Double, baseDate: Double, options: AnonRoundingMethod): String = js.native
  def apply(date: Double, baseDate: Date): String = js.native
  def apply(date: Double, baseDate: Date, options: AnonRoundingMethod): String = js.native
  def apply(date: Date, baseDate: Double): String = js.native
  def apply(date: Date, baseDate: Double, options: AnonRoundingMethod): String = js.native
  def apply(date: Date, baseDate: Date): String = js.native
  def apply(date: Date, baseDate: Date, options: AnonRoundingMethod): String = js.native
}

