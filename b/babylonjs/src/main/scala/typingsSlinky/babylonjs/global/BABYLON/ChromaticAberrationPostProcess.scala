package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ChromaticAberrationPostProcess")
@js.native
class ChromaticAberrationPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.ChromaticAberrationPostProcess {
  /**
    * Creates a new instance ChromaticAberrationPostProcess
    * @param name The name of the effect.
    * @param screenWidth The width of the screen to apply the effect on.
    * @param screenHeight The height of the screen to apply the effect on.
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
    screenWidth: Double,
    screenHeight: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object ChromaticAberrationPostProcess {
  
  /** @hidden */
  @JSGlobal("BABYLON.ChromaticAberrationPostProcess._Parse")
  @js.native
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typingsSlinky.babylonjs.BABYLON.Camera,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Nullable[typingsSlinky.babylonjs.BABYLON.ChromaticAberrationPostProcess] = js.native
}
