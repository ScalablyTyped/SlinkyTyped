package typingsSlinky.babylonjs.postProcessesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "ColorCorrectionPostProcess")
@js.native
class ColorCorrectionPostProcess protected ()
  extends typingsSlinky.babylonjs.colorCorrectionPostProcessMod.ColorCorrectionPostProcess {
  def this(name: String, colorTableUrl: String, options: Double, camera: Camera) = this()
  def this(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Camera) = this()
  def this(name: String, colorTableUrl: String, options: Double, camera: Camera, samplingMode: Double) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
}

