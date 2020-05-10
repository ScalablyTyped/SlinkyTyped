package typingsSlinky.glReactHeadless.glviewheadlessMod

import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLViewHeadlessProps extends js.Object {
  var height: Double = js.native
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  var onContextLost: js.UndefOr[js.Function0[Unit]] = js.native
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.native
  var width: Double = js.native
}

object GLViewHeadlessProps {
  @scala.inline
  def apply(height: Double, width: Double): GLViewHeadlessProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLViewHeadlessProps]
  }
  @scala.inline
  implicit class GLViewHeadlessPropsOps[Self <: GLViewHeadlessProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextFailure(value: /* e */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextLost(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextLost")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnContextLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextLost")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextRestored(value: /* gl */ WebGLRenderingContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextRestored")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextRestored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextRestored")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withWebglContextAttributes(value: WebGLContextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglContextAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebglContextAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webglContextAttributes")(js.undefined)
        ret
    }
  }
  
}

