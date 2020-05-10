package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected ()
  extends typingsSlinky.babylonjs.legacyMod.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[
        typingsSlinky.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
      ]
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[
        typingsSlinky.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
      ]
  ) = this()
}

