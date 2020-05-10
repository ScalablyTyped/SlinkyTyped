package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEffectLayerOptions extends js.Object {
  /**
    * Alpha blending mode used to apply the blur. Default depends of the implementation.
    */
  var alphaBlendingMode: Double = js.native
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  /**
    * Enforces a fixed size texture to ensure effect stability across devices.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the objects (the smaller the faster).
    */
  var mainTextureRatio: Double = js.native
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}

object IEffectLayerOptions {
  @scala.inline
  def apply(alphaBlendingMode: Double, mainTextureRatio: Double, renderingGroupId: Double): IEffectLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectLayerOptions]
  }
  @scala.inline
  implicit class IEffectLayerOptionsOps[Self <: IEffectLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaBlendingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaBlendingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainTextureRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderingGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: Nullable[Camera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(null)
        ret
    }
    @scala.inline
    def withMainTextureFixedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureFixedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTextureFixedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureFixedSize")(js.undefined)
        ret
    }
  }
  
}

