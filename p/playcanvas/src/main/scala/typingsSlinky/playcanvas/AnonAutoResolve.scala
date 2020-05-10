package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoResolve extends js.Object {
  var autoResolve: js.UndefOr[Boolean] = js.native
  var colorBuffer: js.UndefOr[Texture] = js.native
  var depth: js.UndefOr[Boolean] = js.native
  var depthBuffer: js.UndefOr[Texture] = js.native
  var face: js.UndefOr[Double] = js.native
  var samples: js.UndefOr[Double] = js.native
  var stencil: js.UndefOr[Boolean] = js.native
}

object AnonAutoResolve {
  @scala.inline
  def apply(): AnonAutoResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoResolve]
  }
  @scala.inline
  implicit class AnonAutoResolveOps[Self <: AnonAutoResolve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBuffer(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthBuffer(value: Texture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withFace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(js.undefined)
        ret
    }
    @scala.inline
    def withSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samples")(js.undefined)
        ret
    }
    @scala.inline
    def withStencil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(js.undefined)
        ret
    }
  }
  
}

