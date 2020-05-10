package typingsSlinky.babylonjs.glowLayerMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlowLayerOptions extends js.Object {
  /**
    * How big is the kernel of the blur texture.
    */
  var blurKernelSize: Double = js.native
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera] = js.native
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
    * Enable MSAA by chosing the number of samples.
    */
  var mainTextureSamples: js.UndefOr[Double] = js.native
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double = js.native
}

object IGlowLayerOptions {
  @scala.inline
  def apply(blurKernelSize: Double, mainTextureRatio: Double, renderingGroupId: Double): IGlowLayerOptions = {
    val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlowLayerOptions]
  }
  @scala.inline
  implicit class IGlowLayerOptionsOps[Self <: IGlowLayerOptions] (val x: Self) extends AnyVal {
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
  }
  
}

