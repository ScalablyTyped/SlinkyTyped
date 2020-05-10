package typingsSlinky.babylonjs.multiRenderTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiRenderTargetOptions extends js.Object {
  /**
    * Define the default type of the buffers we are creating
    */
  var defaultType: js.UndefOr[Double] = js.native
  /**
    * Define if aspect ratio should be adapted to the texture or stay the scene one
    */
  var doNotChangeAspectRatio: js.UndefOr[Boolean] = js.native
  /**
    * Define if a depth buffer is required
    */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  /**
    * Define if a depth texture is required instead of a depth buffer
    */
  var generateDepthTexture: js.UndefOr[Boolean] = js.native
  /**
    * Define if the texture needs to create mip maps after render.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  /**
    * Define if a stencil buffer is required
    */
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  /**
    * Define the sampling modes of all the draw buffers we want to create
    */
  var samplingModes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Define the number of desired draw buffers
    */
  var textureCount: js.UndefOr[Double] = js.native
  /**
    * Define the types of all the draw buffers we want to create
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}

object IMultiRenderTargetOptions {
  @scala.inline
  def apply(): IMultiRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRenderTargetOptions]
  }
  @scala.inline
  implicit class IMultiRenderTargetOptionsOps[Self <: IMultiRenderTargetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotChangeAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotChangeAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotChangeAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotChangeAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateDepthBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDepthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateDepthBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDepthBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateDepthTexture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDepthTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateDepthTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateDepthTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateMipMaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateMipMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMipMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateStencilBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStencilBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateStencilBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStencilBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingModes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingModes")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

