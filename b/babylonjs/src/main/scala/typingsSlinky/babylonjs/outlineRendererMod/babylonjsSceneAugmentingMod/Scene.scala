package typingsSlinky.babylonjs.outlineRendererMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.outlineRendererMod.OutlineRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /** @hidden */
  var _outlineRenderer: OutlineRenderer = js.native
  /**
    * Gets the outline renderer associated with the scene
    * @returns a OutlineRenderer
    */
  def getOutlineRenderer(): OutlineRenderer = js.native
}

object Scene {
  @scala.inline
  def apply(_outlineRenderer: OutlineRenderer, getOutlineRenderer: () => OutlineRenderer): Scene = {
    val __obj = js.Dynamic.literal(_outlineRenderer = _outlineRenderer.asInstanceOf[js.Any], getOutlineRenderer = js.Any.fromFunction0(getOutlineRenderer))
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_outlineRenderer(value: OutlineRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outlineRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOutlineRenderer(value: () => OutlineRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutlineRenderer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

