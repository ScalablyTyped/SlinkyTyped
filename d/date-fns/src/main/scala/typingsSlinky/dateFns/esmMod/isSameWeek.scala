package typingsSlinky.dateFns.esmMod

import typingsSlinky.dateFns.anon.WeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "isSameWeek")
@js.native
object isSameWeek extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Boolean = js.native
  def apply(dateLeft: Double, dateRight: js.Date): Boolean = js.native
  def apply(dateLeft: Double, dateRight: js.Date, options: WeekStartsOn): Boolean = js.native
  def apply(dateLeft: js.Date, dateRight: Double): Boolean = js.native
  def apply(dateLeft: js.Date, dateRight: Double, options: WeekStartsOn): Boolean = js.native
  def apply(dateLeft: js.Date, dateRight: js.Date): Boolean = js.native
  def apply(dateLeft: js.Date, dateRight: js.Date, options: WeekStartsOn): Boolean = js.native
}

