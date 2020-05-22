package typingsSlinky.babylonjs.webVRCameraMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePose extends js.Object {
  /**
    * The angularAcceleration of the device, values in array are [x,y,z].
    */
  val angularAcceleration: Nullable[js.typedarray.Float32Array]
  /**
    * The angularVelocity of the device, values in array are [x,y,z].
    */
  val angularVelocity: Nullable[js.typedarray.Float32Array]
  /**
    * The linearAcceleration of the device, values in array are [x,y,z].
    */
  val linearAcceleration: Nullable[js.typedarray.Float32Array]
  /**
    * The linearVelocity of the device, values in array are [x,y,z].
    */
  val linearVelocity: Nullable[js.typedarray.Float32Array]
  /**
    * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
    */
  val orientation: Nullable[js.typedarray.Float32Array]
  /**
    * The position of the device, values in array are [x,y,z].
    */
  val position: Nullable[js.typedarray.Float32Array]
}

object DevicePose {
  @scala.inline
  def apply(
    angularAcceleration: Nullable[js.typedarray.Float32Array] = null,
    angularVelocity: Nullable[js.typedarray.Float32Array] = null,
    linearAcceleration: Nullable[js.typedarray.Float32Array] = null,
    linearVelocity: Nullable[js.typedarray.Float32Array] = null,
    orientation: Nullable[js.typedarray.Float32Array] = null,
    position: Nullable[js.typedarray.Float32Array] = null
  ): DevicePose = {
    val __obj = js.Dynamic.literal(angularAcceleration = angularAcceleration.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], linearAcceleration = linearAcceleration.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePose]
  }
}

