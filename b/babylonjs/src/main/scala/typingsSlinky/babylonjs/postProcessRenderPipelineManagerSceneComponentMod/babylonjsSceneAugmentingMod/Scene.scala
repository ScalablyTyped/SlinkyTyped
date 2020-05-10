package typingsSlinky.babylonjs.postProcessRenderPipelineManagerSceneComponentMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
  /**
    * Gets the postprocess render pipeline manager
    * @see http://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
    * @see http://doc.babylonjs.com/how_to/using_default_rendering_pipeline
    */
  val postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
}

object Scene {
  @scala.inline
  def apply(
    _postProcessRenderPipelineManager: PostProcessRenderPipelineManager,
    postProcessRenderPipelineManager: PostProcessRenderPipelineManager
  ): Scene = {
    val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_postProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_postProcessRenderPipelineManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostProcessRenderPipelineManager(value: PostProcessRenderPipelineManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessRenderPipelineManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

