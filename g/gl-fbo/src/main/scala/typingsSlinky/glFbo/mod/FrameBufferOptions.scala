package typingsSlinky.glFbo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBufferOptions extends js.Object {
  var color: js.UndefOr[Double] = js.native
  var depth: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[Boolean] = js.native
  var preferFloat: js.UndefOr[Boolean] = js.native
  var stencil: js.UndefOr[Boolean] = js.native
}

object FrameBufferOptions {
  @scala.inline
  def apply(): FrameBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameBufferOptions]
  }
  @scala.inline
  implicit class FrameBufferOptionsOps[Self <: FrameBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFloat")(js.undefined)
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

