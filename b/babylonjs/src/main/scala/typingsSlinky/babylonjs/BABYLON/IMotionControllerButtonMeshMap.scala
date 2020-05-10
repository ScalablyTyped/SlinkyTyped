package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMotionControllerButtonMeshMap extends js.Object {
  /**
    * the mesh that defines the pressed value mesh position.
    * This is used to find the max-position of this button
    */
  var pressedMesh: AbstractMesh = js.native
  /**
    * the mesh that defines the unpressed value mesh position.
    * This is used to find the min (or initial) position of this button
    */
  var unpressedMesh: AbstractMesh = js.native
  /**
    * The mesh that will be changed when value changes
    */
  var valueMesh: AbstractMesh = js.native
}

object IMotionControllerButtonMeshMap {
  @scala.inline
  def apply(pressedMesh: AbstractMesh, unpressedMesh: AbstractMesh, valueMesh: AbstractMesh): IMotionControllerButtonMeshMap = {
    val __obj = js.Dynamic.literal(pressedMesh = pressedMesh.asInstanceOf[js.Any], unpressedMesh = unpressedMesh.asInstanceOf[js.Any], valueMesh = valueMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerButtonMeshMap]
  }
  @scala.inline
  implicit class IMotionControllerButtonMeshMapOps[Self <: IMotionControllerButtonMeshMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPressedMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpressedMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpressedMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMesh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

