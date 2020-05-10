package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHighlightLayerOptions extends js.Object {
  /**
    * Alpha blending mode used to apply the blur. Default is combine.
    */
  var alphaBlendingMode: Double = js.native
  /**
    * How big in texel of the blur texture is the horizontal blur.
    */
  var blurHorizontalSize: Double = js.native
  /**
    * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
    * of the picture to blur (the smaller the faster).
    */
  var blurTextureSizeRatio: Double = js.native
  /**
    * How big in texel of the blur texture is the vertical blur.
    */
  var blurVerticalSize: Double = js.native
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
  /**
    * Should we display highlight as a solid stroke?
    */
  var isStroke: js.UndefOr[Boolean] = js.native
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double = js.native
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}

object IHighlightLayerOptions {
  @scala.inline
  def apply(
    alphaBlendingMode: Double,
    blurHorizontalSize: Double,
    blurTextureSizeRatio: Double,
    blurVerticalSize: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double
  ): IHighlightLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], blurHorizontalSize = blurHorizontalSize.asInstanceOf[js.Any], blurTextureSizeRatio = blurTextureSizeRatio.asInstanceOf[js.Any], blurVerticalSize = blurVerticalSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightLayerOptions]
  }
  @scala.inline
  implicit class IHighlightLayerOptionsOps[Self <: IHighlightLayerOptions] (val x: Self) extends AnyVal {
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
    def withBlurHorizontalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurHorizontalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurTextureSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurTextureSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurVerticalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurVerticalSize")(value.asInstanceOf[js.Any])
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
    def withIsStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStroke")(js.undefined)
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

