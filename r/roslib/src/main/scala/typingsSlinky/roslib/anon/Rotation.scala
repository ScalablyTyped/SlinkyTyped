package typingsSlinky.roslib.anon

import typingsSlinky.roslib.mod.Quaternion
import typingsSlinky.roslib.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rotation extends js.Object {
  var rotation: Quaternion
  var translation: Vector3
}

object Rotation {
  @scala.inline
  def apply(rotation: Quaternion, translation: Vector3): Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
}

