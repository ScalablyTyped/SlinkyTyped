package typingsSlinky.rotDashJs.libSchedulerSpeedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Speed[T /* <: SpeedActor */]
  extends typingsSlinky.rotDashJs.libSchedulerSchedulerMod.default[T] {
  def add(item: T, repeat: Boolean, time: Double): this.type = js.native
}

