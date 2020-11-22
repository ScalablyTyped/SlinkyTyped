package typingsSlinky.babylonjs.postProcessesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typingsSlinky.babylonjs.fxaaPostProcessMod.FxaaPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs/PostProcesses/index", "FxaaPostProcess")
@js.native
object FxaaPostProcess extends js.Object {
  
  /** @hidden */
  def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.fxaaPostProcessMod.FxaaPostProcess = js.native
}
