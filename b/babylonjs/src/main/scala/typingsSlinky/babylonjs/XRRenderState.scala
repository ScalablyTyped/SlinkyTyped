package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRRenderState extends js.Object {
  var baseLayer: js.UndefOr[XRWebGLLayer] = js.native
  var depthFar: js.UndefOr[Double] = js.native
  var depthNear: js.UndefOr[Double] = js.native
  var inlineVerticalFieldOfView: js.UndefOr[Double] = js.native
}

object XRRenderState {
  @scala.inline
  def apply(): XRRenderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRRenderState]
  }
  @scala.inline
  implicit class XRRenderStateOps[Self <: XRRenderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseLayer(value: XRWebGLLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthFar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthFar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFar")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthNear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthNear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthNear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthNear")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineVerticalFieldOfView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineVerticalFieldOfView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineVerticalFieldOfView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineVerticalFieldOfView")(js.undefined)
        ret
    }
  }
  
}

