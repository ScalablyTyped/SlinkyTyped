package typingsSlinky.rotJs.speedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Speed[T /* <: SpeedActor */]
  extends typingsSlinky.rotJs.schedulerSchedulerMod.default[T] {
  def add(item: T, repeat: Boolean, time: Double): this.type = js.native
}

