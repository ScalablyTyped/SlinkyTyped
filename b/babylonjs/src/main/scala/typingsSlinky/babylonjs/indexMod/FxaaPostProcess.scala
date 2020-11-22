package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typingsSlinky.babylonjs.postProcessesIndexMod.FxaaPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "FxaaPostProcess")
@js.native
object FxaaPostProcess extends js.Object {
  
  /** @hidden */
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typingsSlinky.babylonjs.cameraMod.Camera,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): typingsSlinky.babylonjs.fxaaPostProcessMod.FxaaPostProcess = js.native
}
