package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "TonemapPostProcess")
@js.native
class TonemapPostProcess protected ()
  extends typingsSlinky.babylonjs.legacyMod.TonemapPostProcess {
  /**
    * Creates a new TonemapPostProcess
    * @param name defines the name of the postprocess
    * @param _operator defines the operator to use
    * @param exposureAdjustment defines the required exposure adjustement
    * @param camera defines the camera to use (can be null)
    * @param samplingMode defines the required sampling mode (BABYLON.Texture.BILINEAR_SAMPLINGMODE by default)
    * @param engine defines the hosting engine (can be ignore if camera is set)
    * @param textureFormat defines the texture format to use (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    */
  def this(
    name: String,
    _operator: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera
  ) = this()
  def this(
    name: String,
    _operator: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    _operator: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    textureFormat: Double
  ) = this()
}

