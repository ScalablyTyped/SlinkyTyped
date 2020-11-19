package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[typingsSlinky.babylonjs.BABYLON.ImageProcessingConfiguration]
  ) = this()
}
