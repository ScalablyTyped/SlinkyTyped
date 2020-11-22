package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.BlurSteps
import typingsSlinky.babylonjs.anon.Blurred
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/depthOfFieldMergePostProcess", JSImport.Namespace)
@js.native
object depthOfFieldMergePostProcessMod extends js.Object {
  
  @js.native
  class DepthOfFieldMergePostProcess protected () extends PostProcess {
    /**
      * Creates a new instance of DepthOfFieldMergePostProcess
      * @param name The name of the effect.
      * @param originalFromInput Post process which's input will be used for the merge.
      * @param circleOfConfusion Circle of confusion post process which's output will be used to blur each pixel.
      * @param blurSteps Blur post processes from low to high which will be mixed with the original image.
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
      originalFromInput: PostProcess,
      circleOfConfusion: PostProcess,
      blurSteps: js.Array[PostProcess],
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    var blurSteps: js.Any = js.native
    
    /**
      * Updates the effect with the current post process compile time values and recompiles the shader.
      * @param defines Define statements that should be added at the beginning of the shader. (default: null)
      * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
      * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param onCompiled Called when the shader has been compiled.
      * @param onError Called if there is an error when compiling a shader.
      */
    def updateEffect(
      defines: js.UndefOr[Nullable[String]],
      uniforms: js.UndefOr[Nullable[js.Array[String]]],
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      indexParameters: js.UndefOr[js.Any],
      onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
      onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
    ): Unit = js.native
  }
  
  @js.native
  class DepthOfFieldMergePostProcessOptions () extends js.Object {
    
    /**
      * Parameters to perform the merge of bloom effect
      */
    var bloom: js.UndefOr[Blurred] = js.native
    
    /**
      * Parameters to perform the merge of the depth of field effect
      */
    var depthOfField: js.UndefOr[BlurSteps] = js.native
    
    /**
      * The original image to merge on top of
      */
    var originalFromInput: PostProcess = js.native
  }
}
