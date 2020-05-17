package typingsSlinky.scheduler

import typingsSlinky.scheduler.tracingMod.EnableSchedulerTracing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object schedulerBooleans {
  @js.native
  sealed trait `false` extends EnableSchedulerTracing
  
  @js.native
  sealed trait `true` extends EnableSchedulerTracing
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

