package typingsSlinky.babylonjs.renderingIndexMod.babylonjsMeshesAbstractMeshAugmentingMod

import typingsSlinky.babylonjs.edgesRendererMod.EdgesRenderer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractMesh extends js.Object {
  /** @hidden (Backing field) */
  var _renderOutline: Boolean = js.native
  /** @hidden (Backing field) */
  var _renderOverlay: Boolean = js.native
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean = js.native
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer] = js.native
  /**
    * Gets or sets a boolean indicating if the outline must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#3
    */
  var renderOutline: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the overlay must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#2
    */
  var renderOverlay: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean = js.native
}

object AbstractMesh {
  @scala.inline
  def apply(
    _renderOutline: Boolean,
    _renderOverlay: Boolean,
    _showBoundingBox: Boolean,
    renderOutline: Boolean,
    renderOverlay: Boolean,
    showBoundingBox: Boolean
  ): AbstractMesh = {
    val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], _showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_renderOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_renderOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_renderOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_renderOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_showBoundingBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBoundingBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
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

