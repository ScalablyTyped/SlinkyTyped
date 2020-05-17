package typingsSlinky.scheduler.tracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.scheduler.schedulerBooleans.`true`
  - typingsSlinky.scheduler.schedulerBooleans.`false`
*/
trait EnableSchedulerTracing extends js.Object

object EnableSchedulerTracing {
  @scala.inline
  def `true`: typingsSlinky.scheduler.schedulerBooleans.`true` = true.asInstanceOf[typingsSlinky.scheduler.schedulerBooleans.`true`]
  @scala.inline
  def `false`: typingsSlinky.scheduler.schedulerBooleans.`false` = false.asInstanceOf[typingsSlinky.scheduler.schedulerBooleans.`false`]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => EnableSchedulerTracing): EnableSchedulerTracing = value.asInstanceOf[EnableSchedulerTracing]
}

