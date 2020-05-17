package typingsSlinky.rcDrawer.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterVisibleChange extends js.Object {
  var className: String = js.native
  var defaultOpen: Boolean = js.native
  var duration: String = js.native
  var ease: String = js.native
  var forceRender: Boolean = js.native
  var getContainer: String = js.native
  var handler: ReactElement = js.native
  var keyboard: Boolean = js.native
  var level: String = js.native
  var maskClosable: Boolean = js.native
  var placement: String = js.native
  var prefixCls: String = js.native
  var showMask: Boolean = js.native
  var wrapperClassName: String = js.native
  def afterVisibleChange(): Unit = js.native
  def onChange(): Unit = js.native
}

object AfterVisibleChange {
  @scala.inline
  def apply(
    afterVisibleChange: () => Unit,
    className: String,
    defaultOpen: Boolean,
    duration: String,
    ease: String,
    forceRender: Boolean,
    getContainer: String,
    handler: ReactElement,
    keyboard: Boolean,
    level: String,
    maskClosable: Boolean,
    onChange: () => Unit,
    placement: String,
    prefixCls: String,
    showMask: Boolean,
    wrapperClassName: String
  ): AfterVisibleChange = {
    val __obj = js.Dynamic.literal(afterVisibleChange = js.Any.fromFunction0(afterVisibleChange), className = className.asInstanceOf[js.Any], defaultOpen = defaultOpen.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], forceRender = forceRender.asInstanceOf[js.Any], getContainer = getContainer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showMask = showMask.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterVisibleChange]
  }
  @scala.inline
  implicit class AfterVisibleChangeOps[Self <: AfterVisibleChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterVisibleChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterVisibleChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

