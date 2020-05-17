package typingsSlinky.rcDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var closable: Boolean = js.native
  var destroyOnClose: Boolean = js.native
  var focusTriggerAfterClose: Boolean = js.native
  var keyboard: Boolean = js.native
  var mask: Boolean = js.native
  var maskClosable: Boolean = js.native
  var prefixCls: String = js.native
  var visible: Boolean = js.native
}

object ClassName {
  @scala.inline
  def apply(
    className: String,
    closable: Boolean,
    destroyOnClose: Boolean,
    focusTriggerAfterClose: Boolean,
    keyboard: Boolean,
    mask: Boolean,
    maskClosable: Boolean,
    prefixCls: String,
    visible: Boolean
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], destroyOnClose = destroyOnClose.asInstanceOf[js.Any], focusTriggerAfterClose = focusTriggerAfterClose.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusTriggerAfterClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusTriggerAfterClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

