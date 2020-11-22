package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.FxaaPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.FxaaPostProcess")
@js.native
object FxaaPostProcess extends js.Object {
  
  /** @hidden */
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typingsSlinky.babylonjs.BABYLON.Camera,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typingsSlinky.babylonjs.BABYLON.FxaaPostProcess = js.native
}
