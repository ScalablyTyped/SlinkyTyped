package typingsSlinky.babylonjs.postProcessesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @hidden (Backing field) */
    var _postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
    
    /**
      * Gets the postprocess render pipeline manager
      * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
      * @see https://doc.babylonjs.com/how_to/using_default_rendering_pipeline
      */
    val postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager = js.native
  }
  object Scene {
    
    @scala.inline
    def apply(
      _postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager,
      postProcessRenderPipelineManager: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
    ): Scene = {
      val __obj = js.Dynamic.literal(_postProcessRenderPipelineManager = _postProcessRenderPipelineManager.asInstanceOf[js.Any], postProcessRenderPipelineManager = postProcessRenderPipelineManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostProcessRenderPipelineManager(
        value: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
      ): Self = StObject.set(x, "postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_postProcessRenderPipelineManager(
        value: typingsSlinky.babylonjs.postProcessRenderPipelineManagerMod.PostProcessRenderPipelineManager
      ): Self = StObject.set(x, "_postProcessRenderPipelineManager", value.asInstanceOf[js.Any])
    }
  }
}
