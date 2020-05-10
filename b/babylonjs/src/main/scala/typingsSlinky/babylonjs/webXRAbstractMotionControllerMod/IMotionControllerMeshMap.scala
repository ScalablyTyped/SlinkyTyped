package typingsSlinky.babylonjs.webXRAbstractMotionControllerMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMotionControllerMeshMap extends js.Object {
  /**
    * the mesh that defines the maximum value mesh position.
    */
  var maxMesh: js.UndefOr[AbstractMesh] = js.native
  /**
    * the mesh that defines the minimum value mesh position.
    */
  var minMesh: js.UndefOr[AbstractMesh] = js.native
  /**
    * The mesh that will be changed when axis value changes
    */
  var valueMesh: AbstractMesh = js.native
}

object IMotionControllerMeshMap {
  @scala.inline
  def apply(valueMesh: AbstractMesh): IMotionControllerMeshMap = {
    val __obj = js.Dynamic.literal(valueMesh = valueMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerMeshMap]
  }
  @scala.inline
  implicit class IMotionControllerMeshMapOps[Self <: IMotionControllerMeshMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMesh")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMesh")(js.undefined)
        ret
    }
  }
  
}

