package typingsSlinky.babylonjs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.depthOfFieldBlurPostProcessMod.DepthOfFieldBlurPostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessRenderEffectMod.PostProcessRenderEffect
import typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/depthOfFieldEffect", JSImport.Namespace)
@js.native
object depthOfFieldEffectMod extends js.Object {
  
  @js.native
  class DepthOfFieldEffect protected () extends PostProcessRenderEffect {
    /**
      * Creates a new instance DepthOfFieldEffect
      * @param scene The scene the effect belongs to.
      * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
      * @param pipelineTextureType The type of texture to be used when performing the post processing.
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture]) = this()
    def this(scene: Scene, depthTexture: Nullable[RenderTargetTexture], blurLevel: DepthOfFieldEffectBlurLevel) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: js.UndefOr[scala.Nothing],
      pipelineTextureType: Double
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: Double
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: js.UndefOr[scala.Nothing],
      pipelineTextureType: js.UndefOr[scala.Nothing],
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: js.UndefOr[scala.Nothing],
      pipelineTextureType: Double,
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: js.UndefOr[scala.Nothing],
      blockCompilation: Boolean
    ) = this()
    def this(
      scene: Scene,
      depthTexture: Nullable[RenderTargetTexture],
      blurLevel: DepthOfFieldEffectBlurLevel,
      pipelineTextureType: Double,
      blockCompilation: Boolean
    ) = this()
    
    var _circleOfConfusion: js.Any = js.native
    
    /**
      * @hidden Internal, blurs from high to low
      */
    var _depthOfFieldBlurX: js.Array[DepthOfFieldBlurPostProcess] = js.native
    
    var _depthOfFieldBlurY: js.Any = js.native
    
    var _dofMerge: js.Any = js.native
    
    /**
      * @hidden Internal post processes in depth of field effect
      */
    var _effects: js.Array[PostProcess] = js.native
    
    /**
      * Internal
      * @returns if all the contained post processes are ready.
      * @hidden
      */
    def _isReady(): Boolean = js.native
    
    /**
      * @hidden Internal
      */
    def _updateEffects(): Unit = js.native
    
    /**
      * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
      */
    def depthTexture_=(value: RenderTargetTexture): Unit = js.native
    
    /**
      * Disposes each of the internal effects for a given camera.
      * @param camera The camera to dispose the effect on.
      */
    def disposeEffects(camera: Camera): Unit = js.native
    
    def fStop: Double = js.native
    /**
      * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
      */
    def fStop_=(value: Double): Unit = js.native
    
    def focalLength: Double = js.native
    /**
      * The focal the length of the camera used in the effect in scene units/1000 (eg. millimeter)
      */
    def focalLength_=(value: Double): Unit = js.native
    
    def focusDistance: Double = js.native
    /**
      * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
      */
    def focusDistance_=(value: Double): Unit = js.native
    
    /**
      * Get the current class name of the current effet
      * @returns "DepthOfFieldEffect"
      */
    def getClassName(): String = js.native
    
    def lensSize: Double = js.native
    /**
      * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diamater of the resulting aperture can be computed by lensSize/fStop.
      */
    def lensSize_=(value: Double): Unit = js.native
  }
  
  @js.native
  sealed trait DepthOfFieldEffectBlurLevel extends js.Object
  @js.native
  object DepthOfFieldEffectBlurLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DepthOfFieldEffectBlurLevel with Double] = js.native
    
    /**
      * Large blur
      */
    @js.native
    sealed trait High extends DepthOfFieldEffectBlurLevel
    /* 2 */ @js.native
    object High extends TopLevel[High with Double]
    
    /**
      * Subtle blur
      */
    @js.native
    sealed trait Low extends DepthOfFieldEffectBlurLevel
    /* 0 */ @js.native
    object Low extends TopLevel[Low with Double]
    
    /**
      * Medium blur
      */
    @js.native
    sealed trait Medium extends DepthOfFieldEffectBlurLevel
    /* 1 */ @js.native
    object Medium extends TopLevel[Medium with Double]
  }
}
