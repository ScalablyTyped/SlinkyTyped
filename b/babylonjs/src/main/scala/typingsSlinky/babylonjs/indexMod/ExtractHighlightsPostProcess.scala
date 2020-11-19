package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ExtractHighlightsPostProcess")
@js.native
class ExtractHighlightsPostProcess protected ()
  extends typingsSlinky.babylonjs.postProcessesIndexMod.ExtractHighlightsPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
