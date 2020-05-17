package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTargetCreationOptions extends js.Object {
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[Double] = js.native
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  /**
    * Specifies is mipmaps must be generated
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[Double] = js.native
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[Double] = js.native
}

object RenderTargetCreationOptions {
  @scala.inline
  def apply(): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
  @scala.inline
  implicit class RenderTargetCreationOptionsOps[Self <: RenderTargetCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
    def withSamplingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

