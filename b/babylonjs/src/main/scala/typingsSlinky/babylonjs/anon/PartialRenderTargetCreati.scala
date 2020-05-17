package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.RenderTargetCreationOptions> */
@js.native
trait PartialRenderTargetCreati extends js.Object {
  var format: js.UndefOr[Double] = js.native
  var generateDepthBuffer: js.UndefOr[Boolean] = js.native
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  var generateStencilBuffer: js.UndefOr[Boolean] = js.native
  var samplingMode: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
}

object PartialRenderTargetCreati {
  @scala.inline
  def apply(): PartialRenderTargetCreati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderTargetCreati]
  }
  @scala.inline
  implicit class PartialRenderTargetCreatiOps[Self <: PartialRenderTargetCreati] (val x: Self) extends AnyVal {
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

