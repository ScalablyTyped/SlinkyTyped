package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthOfFieldMergePostProcess")
@js.native
class DepthOfFieldMergePostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.DepthOfFieldMergePostProcess {
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
    originalFromInput: typingsSlinky.babylonjs.BABYLON.PostProcess,
    circleOfConfusion: typingsSlinky.babylonjs.BABYLON.PostProcess,
    blurSteps: js.Array[typingsSlinky.babylonjs.BABYLON.PostProcess],
    options: Double | PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
