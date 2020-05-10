package typingsSlinky.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import typingsSlinky.babylonjs.edgesRendererMod.EdgesRenderer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractMesh extends js.Object {
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer] = js.native
}

object AbstractMesh {
  @scala.inline
  def apply(): AbstractMesh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractMesh]
  }
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdgesRenderer(value: Nullable[EdgesRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgesRendererNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesRenderer")(null)
        ret
    }
  }
  
}

