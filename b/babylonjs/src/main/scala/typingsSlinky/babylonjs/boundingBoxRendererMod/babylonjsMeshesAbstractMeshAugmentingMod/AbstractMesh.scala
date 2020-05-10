package typingsSlinky.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractMesh extends js.Object {
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean = js.native
}

object AbstractMesh {
  @scala.inline
  def apply(_showBoundingBox: Boolean, showBoundingBox: Boolean): AbstractMesh = {
    val __obj = js.Dynamic.literal(_showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_showBoundingBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBoundingBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

