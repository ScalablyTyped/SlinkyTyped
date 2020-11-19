package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DepthOfFieldEffect")
@js.native
class DepthOfFieldEffect protected ()
  extends typingsSlinky.babylonjs.legacyMod.DepthOfFieldEffect {
  /**
    * Creates a new instance DepthOfFieldEffect
    * @param scene The scene the effect belongs to.
    * @param depthTexture The depth texture of the scene to compute the circle of confusion.This must be set in order for this to function but may be set after initialization if needed.
    * @param pipelineTextureType The type of texture to be used when performing the post processing.
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: typingsSlinky.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: typingsSlinky.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: js.UndefOr[scala.Nothing],
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: js.UndefOr[scala.Nothing],
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: typingsSlinky.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: js.UndefOr[scala.Nothing],
    blockCompilation: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    depthTexture: Nullable[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture],
    blurLevel: typingsSlinky.babylonjs.depthOfFieldEffectMod.DepthOfFieldEffectBlurLevel,
    pipelineTextureType: Double,
    blockCompilation: Boolean
  ) = this()
}
