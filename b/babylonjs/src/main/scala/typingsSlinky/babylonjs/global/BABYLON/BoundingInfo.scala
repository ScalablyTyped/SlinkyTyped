package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typingsSlinky.babylonjs.BABYLON.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.BoundingInfo")
@js.native
object BoundingInfo extends js.Object {
  val TmpVector3: js.Any = js.native
}

