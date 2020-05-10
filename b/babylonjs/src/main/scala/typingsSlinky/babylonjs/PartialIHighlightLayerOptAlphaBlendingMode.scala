package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.Camera
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IHighlightLayerOptions> */
@js.native
trait PartialIHighlightLayerOptAlphaBlendingMode extends js.Object {
  var alphaBlendingMode: js.UndefOr[Double] = js.native
  var blurHorizontalSize: js.UndefOr[Double] = js.native
  var blurTextureSizeRatio: js.UndefOr[Double] = js.native
  var blurVerticalSize: js.UndefOr[Double] = js.native
  var camera: js.UndefOr[Nullable[Camera]] = js.native
  var isStroke: js.UndefOr[Boolean] = js.native
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  var mainTextureRatio: js.UndefOr[Double] = js.native
  var renderingGroupId: js.UndefOr[Double] = js.native
}

object PartialIHighlightLayerOptAlphaBlendingMode {
  @scala.inline
  def apply(): PartialIHighlightLayerOptAlphaBlendingMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIHighlightLayerOptAlphaBlendingMode]
  }
  @scala.inline
  implicit class PartialIHighlightLayerOptAlphaBlendingModeOps[Self <: PartialIHighlightLayerOptAlphaBlendingMode] (val x: Self) extends AnyVal {
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
    def withoutAlphaBlendingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaBlendingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurHorizontalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurHorizontalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurHorizontalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurHorizontalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurTextureSizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurTextureSizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurTextureSizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurTextureSizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurVerticalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurVerticalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurVerticalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurVerticalSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: Nullable[Camera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
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
    @scala.inline
    def withMainTextureRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTextureRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(js.undefined)
        ret
    }
  }
  
}

