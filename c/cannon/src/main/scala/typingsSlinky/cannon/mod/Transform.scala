package typingsSlinky.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends typingsSlinky.cannon.CANNON.Transform
/* static members */
object Transform {
  
  @JSImport("cannon", "Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    worldPoint: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  @JSImport("cannon", "Transform.pointToLocalFrame")
  @js.native
  def pointToLocalFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    worldPoint: typingsSlinky.cannon.CANNON.Vec3,
    result: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  
  @JSImport("cannon", "Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    localPoint: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  @JSImport("cannon", "Transform.pointToWorldFrame")
  @js.native
  def pointToWorldFrame(
    position: typingsSlinky.cannon.CANNON.Vec3,
    quaternion: typingsSlinky.cannon.CANNON.Quaternion,
    localPoint: typingsSlinky.cannon.CANNON.Vec3,
    result: typingsSlinky.cannon.CANNON.Vec3
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
}
