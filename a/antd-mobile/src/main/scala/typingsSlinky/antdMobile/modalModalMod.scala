package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.Animated
import typingsSlinky.antdMobile.anon.Close
import typingsSlinky.antdMobile.anon.PartialHTMLPropsHTMLDivEl
import typingsSlinky.antdMobile.antdMobileStrings.`login-password`
import typingsSlinky.antdMobile.antdMobileStrings.`secure-text`
import typingsSlinky.antdMobile.modalPropsTypeMod.Action
import typingsSlinky.antdMobile.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antdMobile.modalPropsTypeMod.ModalPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod {
  
  @JSImport("antd-mobile/lib/modal/Modal", JSImport.Default)
  @js.native
  class default () extends Modal
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/modal/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "default.defaultProps")
    @js.native
    def defaultProps: Animated = js.native
    @scala.inline
    def defaultProps_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
  @js.native
  abstract class ModalComponent[P, S] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  /* static members */
  object ModalComponent {
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactElement, message: ReactElement): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactElement, message: ReactElement, actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactElement, message: ReactElement, actions: js.Array[Action[CSSProperties]]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(
      title: ReactElement,
      message: ReactElement,
      actions: js.Array[Action[CSSProperties]],
      platform: String
    ): Close = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.Array[Action[CSSProperties]]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.Array[Action[CSSProperties]], platform: String): Close = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(title: ReactElement, message: ReactElement, callbackOrActions: CallbackOrActions[CSSProperties]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typingsSlinky.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactElement,
      message: ReactElement,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
  }
  
  @js.native
  trait Modal
    extends ModalComponent[ModalProps, js.Any] {
    
    def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): ReactElement = js.native
    def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): ReactElement = js.native
  }
  
  @js.native
  trait ModalProps extends ModalPropsType[CSSProperties] {
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var wrapProps: js.UndefOr[PartialHTMLPropsHTMLDivEl] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(visible: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setWrapProps(value: PartialHTMLPropsHTMLDivEl): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
    }
  }
}
