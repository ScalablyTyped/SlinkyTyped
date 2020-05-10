package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "AnaglyphPostProcess")
@js.native
class AnaglyphPostProcess protected ()
  extends typingsSlinky.babylonjs.indexMod.AnaglyphPostProcess {
  /**
    * Creates a new AnaglyphPostProcess
    * @param name defines postprocess name
    * @param options defines creation options or target ratio scale
    * @param rigCameras defines cameras using this postprocess
    * @param samplingMode defines required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
    * @param engine defines hosting engine
    * @param reusable defines if the postprocess will be reused multiple times per frame
    */
  def this(name: String, options: Double, rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera]) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
}

