package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.BABYLON.Camera
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IGlowLayerOptions> */
@js.native
trait PartialIGlowLayerOptionsBlurKernelSize extends js.Object {
  var blurKernelSize: js.UndefOr[Double] = js.native
  var camera: js.UndefOr[Nullable[Camera]] = js.native
  var mainTextureFixedSize: js.UndefOr[Double] = js.native
  var mainTextureRatio: js.UndefOr[Double] = js.native
  var mainTextureSamples: js.UndefOr[Double] = js.native
  var renderingGroupId: js.UndefOr[Double] = js.native
}

object PartialIGlowLayerOptionsBlurKernelSize {
  @scala.inline
  def apply(): PartialIGlowLayerOptionsBlurKernelSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIGlowLayerOptionsBlurKernelSize]
  }
  @scala.inline
  implicit class PartialIGlowLayerOptionsBlurKernelSizeOps[Self <: PartialIGlowLayerOptionsBlurKernelSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurKernelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurKernelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurKernelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurKernelSize")(js.undefined)
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
    def withMainTextureSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTextureSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTextureSamples")(js.undefined)
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

