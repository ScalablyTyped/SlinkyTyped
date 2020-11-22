package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/sharpenPostProcess", JSImport.Namespace)
@js.native
object sharpenPostProcessMod extends js.Object {
  
  @js.native
  class SharpenPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance ConvolutionPostProcess
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
      * How much of the original color should be applied. Setting this to 0 will display edge detection. (default: 1)
      */
    var colorAmount: Double = js.native
    
    /**
      * How much sharpness should be applied (default: 0.3)
      */
    var edgeAmount: Double = js.native
  }
  /* static members */
  @js.native
  object SharpenPostProcess extends js.Object {
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): SharpenPostProcess = js.native
  }
}
