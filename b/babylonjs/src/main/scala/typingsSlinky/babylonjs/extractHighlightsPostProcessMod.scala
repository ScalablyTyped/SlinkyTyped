package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractHighlightsPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/extractHighlightsPostProcess", "ExtractHighlightsPostProcess")
  @js.native
  class ExtractHighlightsPostProcess protected () extends PostProcess {
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /** @hidden */
    var _exposure: Double = js.native
    
    /**
      * Post process which has the input texture to be used when performing highlight extraction
      * @hidden
      */
    var _inputPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * The luminance threshold, pixels below this value will be set to black.
      */
    var threshold: Double = js.native
  }
}
