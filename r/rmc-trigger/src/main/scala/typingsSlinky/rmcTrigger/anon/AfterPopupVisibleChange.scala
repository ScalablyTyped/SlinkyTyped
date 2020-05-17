package typingsSlinky.rmcTrigger.anon

import org.scalajs.dom.raw.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterPopupVisibleChange extends js.Object {
  var afterPopupVisibleChange: js.Function0[Unit] = js.native
  var defaultPopupVisible: Boolean = js.native
  var destroyPopupOnHide: Boolean = js.native
  var getDocument: js.Function0[Document] = js.native
  var getPopupClassNameFromAlign: js.Function0[String] = js.native
  var mask: Boolean = js.native
  var maskClosable: Boolean = js.native
  var onPopupAlign: js.Function0[Unit] = js.native
  var onPopupVisibleChange: js.Function0[Unit] = js.native
  var popupClassName: String = js.native
  var prefixCls: String = js.native
}

object AfterPopupVisibleChange {
  @scala.inline
  def apply(
    afterPopupVisibleChange: () => Unit,
    defaultPopupVisible: Boolean,
    destroyPopupOnHide: Boolean,
    getDocument: () => Document,
    getPopupClassNameFromAlign: () => String,
    mask: Boolean,
    maskClosable: Boolean,
    onPopupAlign: () => Unit,
    onPopupVisibleChange: () => Unit,
    popupClassName: String,
    prefixCls: String
  ): AfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(afterPopupVisibleChange = js.Any.fromFunction0(afterPopupVisibleChange), defaultPopupVisible = defaultPopupVisible.asInstanceOf[js.Any], destroyPopupOnHide = destroyPopupOnHide.asInstanceOf[js.Any], getDocument = js.Any.fromFunction0(getDocument), getPopupClassNameFromAlign = js.Any.fromFunction0(getPopupClassNameFromAlign), mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onPopupAlign = js.Any.fromFunction0(onPopupAlign), onPopupVisibleChange = js.Any.fromFunction0(onPopupVisibleChange), popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterPopupVisibleChange]
  }
  @scala.inline
  implicit class AfterPopupVisibleChangeOps[Self <: AfterPopupVisibleChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPopupVisibleChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPopupVisibleChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyPopupOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPopupOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDocument(value: () => Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPopupClassNameFromAlign(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupClassNameFromAlign")(js.Any.fromFunction0(value))
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
    def withOnPopupAlign(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPopupVisibleChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopupClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

