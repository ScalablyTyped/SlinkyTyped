package typingsSlinky.popmotion.staggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.popmotion.staggerMod.IntervalCalc
*/
trait Interval extends js.Object

object Interval {
  @scala.inline
  implicit def apply(value: Double): Interval = value.asInstanceOf[Interval]
  @scala.inline
  implicit def apply(value: IntervalCalc): Interval = value.asInstanceOf[Interval]
}

