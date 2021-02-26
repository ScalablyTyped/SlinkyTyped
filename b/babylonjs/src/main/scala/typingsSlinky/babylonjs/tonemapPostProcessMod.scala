package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tonemapPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/tonemapPostProcess", "TonemapPostProcess")
  @js.native
  class TonemapPostProcess protected () extends PostProcess {
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
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      textureFormat: Double
    ) = this()
    def this(
      name: String,
      _operator: TonemappingOperator,
      /** Defines the required exposure adjustement */
    exposureAdjustment: Double,
      camera: Camera,
      samplingMode: Double,
      engine: Engine,
      textureFormat: Double
    ) = this()
    
    var _operator: js.Any = js.native
    
    /** Defines the required exposure adjustement */
    var exposureAdjustment: Double = js.native
  }
  
  @js.native
  sealed trait TonemappingOperator extends StObject
  @JSImport("babylonjs/PostProcesses/tonemapPostProcess", "TonemappingOperator")
  @js.native
  object TonemappingOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TonemappingOperator with Double] = js.native
    
    /** Hable */
    @js.native
    sealed trait Hable extends TonemappingOperator
    /* 0 */ val Hable: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator.Hable with Double = js.native
    
    /** HejiDawson */
    @js.native
    sealed trait HejiDawson extends TonemappingOperator
    /* 2 */ val HejiDawson: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator.HejiDawson with Double = js.native
    
    /** Photographic */
    @js.native
    sealed trait Photographic extends TonemappingOperator
    /* 3 */ val Photographic: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator.Photographic with Double = js.native
    
    /** Reinhard */
    @js.native
    sealed trait Reinhard extends TonemappingOperator
    /* 1 */ val Reinhard: typingsSlinky.babylonjs.tonemapPostProcessMod.TonemappingOperator.Reinhard with Double = js.native
  }
}
