package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PassCubePostProcess")
@js.native
class PassCubePostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.PassCubePostProcess {
  /**
    * Creates the PassCubePostProcess
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object PassCubePostProcess {
  
  /** @hidden */
  @JSGlobal("BABYLON.PassCubePostProcess._Parse")
  @js.native
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typingsSlinky.babylonjs.BABYLON.Camera,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typingsSlinky.babylonjs.BABYLON.PassCubePostProcess = js.native
}
