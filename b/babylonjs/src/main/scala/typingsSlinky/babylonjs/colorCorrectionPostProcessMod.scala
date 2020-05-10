package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/colorCorrectionPostProcess", JSImport.Namespace)
@js.native
object colorCorrectionPostProcessMod extends js.Object {
  @js.native
  class ColorCorrectionPostProcess protected () extends PostProcess {
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
    var _colorTableTexture: js.Any = js.native
  }
  
}

