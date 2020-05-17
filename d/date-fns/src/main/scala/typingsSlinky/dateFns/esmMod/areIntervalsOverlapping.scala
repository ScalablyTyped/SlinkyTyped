package typingsSlinky.dateFns.esmMod

import typingsSlinky.dateFns.Interval
import typingsSlinky.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "areIntervalsOverlapping")
@js.native
object areIntervalsOverlapping extends js.Object {
  def apply(intervalLeft: Interval, intervalRight: Interval): Boolean = js.native
  def apply(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = js.native
}

