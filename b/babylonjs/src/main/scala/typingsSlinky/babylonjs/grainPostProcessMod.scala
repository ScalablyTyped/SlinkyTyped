package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grainPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/grainPostProcess", "GrainPostProcess")
  @js.native
  class GrainPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance of @see GrainPostProcess
      * @param name The name of the effect.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * If the grain should be randomized on every frame
      */
    var animated: Boolean = js.native
    
    /**
      * The intensity of the grain added (default: 30)
      */
    var intensity: Double = js.native
  }
  /* static members */
  object GrainPostProcess {
    
    /** @hidden */
    @JSImport("babylonjs/PostProcesses/grainPostProcess", "GrainPostProcess._Parse")
    @js.native
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): GrainPostProcess = js.native
  }
}
