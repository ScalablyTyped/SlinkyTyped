package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.AbstractMesh
import typingsSlinky.babylonjs.BABYLON.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMesh extends js.Object {
  var controller: WebVRController = js.native
  var mesh: AbstractMesh = js.native
}

object AnonMesh {
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): AnonMesh = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMesh]
  }
  @scala.inline
  implicit class AnonMeshOps[Self <: AnonMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: WebVRController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMesh(value: AbstractMesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

