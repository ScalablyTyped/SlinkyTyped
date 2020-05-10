package typingsSlinky.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _boundingBoxRenderer: BoundingBoxRenderer = js.native
  /** @hidden (Backing field) */
  var _forceShowBoundingBoxes: Boolean = js.native
  /**
    * Gets or sets a boolean indicating if all bounding boxes must be rendered
    */
  var forceShowBoundingBoxes: Boolean = js.native
  /**
    * Gets the bounding box renderer associated with the scene
    * @returns a BoundingBoxRenderer
    */
  def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
}

object Scene {
  @scala.inline
  def apply(
    _boundingBoxRenderer: BoundingBoxRenderer,
    _forceShowBoundingBoxes: Boolean,
    forceShowBoundingBoxes: Boolean,
    getBoundingBoxRenderer: () => BoundingBoxRenderer
  ): Scene = {
    val __obj = js.Dynamic.literal(_boundingBoxRenderer = _boundingBoxRenderer.asInstanceOf[js.Any], _forceShowBoundingBoxes = _forceShowBoundingBoxes.asInstanceOf[js.Any], forceShowBoundingBoxes = forceShowBoundingBoxes.asInstanceOf[js.Any], getBoundingBoxRenderer = js.Any.fromFunction0(getBoundingBoxRenderer))
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_boundingBoxRenderer(value: BoundingBoxRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_boundingBoxRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_forceShowBoundingBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_forceShowBoundingBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceShowBoundingBoxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShowBoundingBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBoundingBoxRenderer(value: () => BoundingBoxRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingBoxRenderer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

