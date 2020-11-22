package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
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
      samplingMode: js.UndefOr[scala.Nothing],
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
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: Double,
      camera: Camera,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
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
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      colorTableUrl: String,
      options: PostProcessOptions,
      camera: Camera,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
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
    
    /**
      * Gets the color table url used to create the LUT texture
      */
    var colorTableUrl: String = js.native
  }
  /* static members */
  @js.native
  object ColorCorrectionPostProcess extends js.Object {
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[ColorCorrectionPostProcess] = js.native
  }
}
