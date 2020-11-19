package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typingsSlinky.babylonjs.legacyMod.FxaaPostProcess {
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
