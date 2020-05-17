package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoClose extends js.Object {
  var autoClose: Boolean = js.native
  var disabled: Boolean = js.native
  var left: js.Array[scala.Nothing] = js.native
  var prefixCls: String = js.native
  var right: js.Array[scala.Nothing] = js.native
  def onClose(): Unit = js.native
  def onOpen(): Unit = js.native
}

object AutoClose {
  @scala.inline
  def apply(
    autoClose: Boolean,
    disabled: Boolean,
    left: js.Array[scala.Nothing],
    onClose: () => Unit,
    onOpen: () => Unit,
    prefixCls: String,
    right: js.Array[scala.Nothing]
  ): AutoClose = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClose]
  }
  @scala.inline
  implicit class AutoCloseOps[Self <: AutoClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

