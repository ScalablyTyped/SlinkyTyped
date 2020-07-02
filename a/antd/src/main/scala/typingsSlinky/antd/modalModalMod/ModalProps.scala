package typingsSlinky.antd.modalModalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.undefined
  /** 取消按钮文字 */
  var cancelText: js.UndefOr[ReactElement] = js.undefined
  /** 垂直居中 */
  var centered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** 是否显示右上角的关闭按钮 */
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[ReactElement] = js.undefined
  /** 确定按钮 loading */
  var confirmLoading: js.UndefOr[Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  /** 底部内容 */
  var footer: js.UndefOr[ReactElement] = js.undefined
  /** 强制渲染 Modal */
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  /** 点击蒙层是否允许关闭 */
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var okButtonProps: js.UndefOr[ButtonProps] = js.undefined
  /** 确认按钮文字 */
  var okText: js.UndefOr[ReactElement] = js.undefined
  /** 确认按钮类型 */
  var okType: js.UndefOr[LegacyButtonType] = js.undefined
  /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调 */
  var onCancel: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.undefined
  /** 点击确定回调 */
  var onOk: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 标题 */
  var title: js.UndefOr[ReactElement | String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  /** 对话框是否可见 */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** 宽度 */
  var width: js.UndefOr[String | Double] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setCancelButtonProps(value: ButtonProps): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    @scala.inline
    def setCancelTextReactElement(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelText(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseIconReactElement(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseIcon(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setConfirmLoading(value: Boolean): Self = this.set("confirmLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmLoading: Self = this.set("confirmLoading", js.undefined)
    @scala.inline
    def setDestroyOnClose(value: Boolean): Self = this.set("destroyOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyOnClose: Self = this.set("destroyOnClose", js.undefined)
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setGetContainerHTMLElement(value: HTMLElement): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    @scala.inline
    def setGetContainerNull: Self = this.set("getContainer", null)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    @scala.inline
    def setMaskStyle(value: CSSProperties): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOkButtonProps(value: ButtonProps): Self = this.set("okButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkButtonProps: Self = this.set("okButtonProps", js.undefined)
    @scala.inline
    def setOkTextReactElement(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOkText(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOkType(value: LegacyButtonType): Self = this.set("okType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkType: Self = this.set("okType", js.undefined)
    @scala.inline
    def setOnCancel(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnOk(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement | String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapClassName(value: String): Self = this.set("wrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapClassName: Self = this.set("wrapClassName", js.undefined)
    @scala.inline
    def setWrapProps(value: js.Any): Self = this.set("wrapProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapProps: Self = this.set("wrapProps", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

