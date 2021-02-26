package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.OmitModalStaticFunctionsw
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.cancel
import typingsSlinky.antd.antdStrings.ok
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod extends Shortcut {
  
  @JSImport("antd/lib/modal/Modal", JSImport.Default)
  @js.native
  val default: ModalInterface = js.native
  
  @JSImport("antd/lib/modal/Modal", "destroyFns")
  @js.native
  val destroyFns: js.Array[js.Function0[Unit]] = js.native
  
  @js.native
  trait ModalFuncProps extends StObject {
    
    var autoFocusButton: js.UndefOr[Null | ok | cancel] = js.native
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskStyle: js.UndefOr[CSSProperties] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var okCancel: js.UndefOr[Boolean] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String | Double] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ModalFuncProps {
    
    @scala.inline
    def apply(): ModalFuncProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalFuncProps]
    }
    
    @scala.inline
    implicit class ModalFuncPropsMutableBuilder[Self <: ModalFuncProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocusButton(value: ok | cancel): Self = StObject.set(x, "autoFocusButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusButtonNull: Self = StObject.set(x, "autoFocusButton", null)
      
      @scala.inline
      def setAutoFocusButtonUndefined: Self = StObject.set(x, "autoFocusButton", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextReactElement(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setModalRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkCancel(value: Boolean): Self = StObject.set(x, "okCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkCancelUndefined: Self = StObject.set(x, "okCancel", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextReactElement(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ModalInterface extends FunctionComponent[ModalProps] {
    
    var useModal: js.Function0[js.Tuple2[OmitModalStaticFunctionsw, ReactElement]] = js.native
  }
  
  @js.native
  trait ModalLocale extends StObject {
    
    var cancelText: String = js.native
    
    var justOkText: String = js.native
    
    var okText: String = js.native
  }
  object ModalLocale {
    
    @scala.inline
    def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    @scala.inline
    implicit class ModalLocaleMutableBuilder[Self <: ModalLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustOkText(value: String): Self = StObject.set(x, "justOkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModalProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    /** 取消按钮文字 */
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    /** 垂直居中 */
    var centered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** 是否显示右上角的关闭按钮 */
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    /** 确定按钮 loading */
    var confirmLoading: js.UndefOr[Boolean] = js.native
    
    var destroyOnClose: js.UndefOr[Boolean] = js.native
    
    /** 底部内容 */
    var footer: js.UndefOr[ReactElement] = js.native
    
    /** 强制渲染 Modal */
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
    
    /** 点击蒙层是否允许关闭 */
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskStyle: js.UndefOr[CSSProperties] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.native
    
    /** 确认按钮文字 */
    var okText: js.UndefOr[ReactElement] = js.native
    
    /** 确认按钮类型 */
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调 */
    var onCancel: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    /** 点击确定回调 */
    var onOk: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** 标题 */
    var title: js.UndefOr[ReactElement | String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    /** 对话框是否可见 */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** 宽度 */
    var width: js.UndefOr[String | Double] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var wrapProps: js.UndefOr[js.Any] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextReactElement(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setConfirmLoading(value: Boolean): Self = StObject.set(x, "confirmLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmLoadingUndefined: Self = StObject.set(x, "confirmLoading", js.undefined)
      
      @scala.inline
      def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerHTMLElement(value: HTMLElement): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setModalRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextReactElement(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setWrapProps(value: js.Any): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ModalInterface
  
  /* This means you don't have to write `default`, but can instead just say `modalModalMod.foo` */
  override def _to: ModalInterface = default
  
  type getContainerFunc = js.Function0[HTMLElement]
}
