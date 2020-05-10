package typingsSlinky.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLabelRenderParamsXmlParams extends js.Object {
  /**  The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.native
  /** The color of the label. */
  var labelColor: js.UndefOr[Color] = js.native
  /**
  		 * If true, the PNG will be generated using the display resolution.
  		 * If false, the PNG will be generated using the printer resolution.
  		 * If the display resolution is used, the resulting PNG will be smaller.
  		 * Use the printer resolution if the resulting image will be zoomed. This will give the zoomed preview better quality.
  		 */
  var pngUseDisplayResolution: js.UndefOr[Boolean] = js.native
  /** The color of label shadow. */
  var shadowColor: js.UndefOr[Color] = js.native
  /** The shadow width in TWIPS. If '0' is specified, no shadow is rendered. */
  var shadowDepth: js.UndefOr[Double] = js.native
}

object CreateLabelRenderParamsXmlParams {
  @scala.inline
  def apply(): CreateLabelRenderParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelRenderParamsXmlParams]
  }
  @scala.inline
  implicit class CreateLabelRenderParamsXmlParamsOps[Self <: CreateLabelRenderParamsXmlParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDirection(value: FlowDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPngUseDisplayResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngUseDisplayResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPngUseDisplayResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngUseDisplayResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowDepth")(js.undefined)
        ret
    }
  }
  
}

