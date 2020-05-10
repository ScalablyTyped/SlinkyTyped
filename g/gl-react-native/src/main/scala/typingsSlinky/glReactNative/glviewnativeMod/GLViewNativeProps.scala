package typingsSlinky.glReactNative.glviewnativeMod

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GLViewNativeProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  var style: js.UndefOr[js.Any] = js.native
}

object GLViewNativeProps {
  @scala.inline
  def apply(): GLViewNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GLViewNativeProps]
  }
  @scala.inline
  implicit class GLViewNativePropsOps[Self <: GLViewNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

