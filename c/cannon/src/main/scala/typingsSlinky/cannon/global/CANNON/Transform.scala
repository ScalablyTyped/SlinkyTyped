package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Transform")
@js.native
class Transform ()
  extends typingsSlinky.cannon.CANNON.Transform

/* static members */
@JSGlobal("CANNON.Transform")
@js.native
object Transform extends js.Object {
  def pointToLocalFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    worldPoint: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  def pointToLocalFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    worldPoint: typingsSlinky.cannon.CANNON.Vec3,
    result: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  def pointToWorldFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    localPoint: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  def pointToWorldFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    localPoint: typingsSlinky.cannon.CANNON.Vec3,
    result: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
}

