package typingsSlinky.antdMobileRn

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.anon.AntLocale
import typingsSlinky.antdMobileRn.anon.Type
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`login-password`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`secure-text`
import typingsSlinky.antdMobileRn.modalPropsTypeMod.Action
import typingsSlinky.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antdMobileRn.promptDotnativeMod.IPromptStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  class default protected () extends PropmptContainer {
    def this(props: PropmptContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", "default.defaultProps")
    @js.native
    def defaultProps: Type = js.native
    @scala.inline
    def defaultProps_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropmptContainer
    extends Component[PropmptContainerProps, js.Any, js.Any] {
    
    def onChangeText(`type`: String, value: String): Unit = js.native
    
    def onClose(): Unit = js.native
  }
  
  @js.native
  trait PropmptContainerProps extends StObject {
    
    var actions: CallbackOrActions[TextStyle] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var placeholders: js.UndefOr[js.Array[String]] = js.native
    
    var styles: js.UndefOr[IPromptStyle] = js.native
    
    var title: ReactElement = js.native
    
    var `type`: js.UndefOr[
        typingsSlinky.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`
      ] = js.native
  }
  object PropmptContainerProps {
    
    @scala.inline
    def apply(actions: CallbackOrActions[TextStyle]): PropmptContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropmptContainerProps]
    }
    
    @scala.inline
    implicit class PropmptContainerPropsMutableBuilder[Self <: PropmptContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: CallbackOrActions[TextStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsFunction2(value: (/* valueOrLogin */ String, /* password */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageReactElement(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: js.Array[String]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      @scala.inline
      def setPlaceholdersVarargs(value: String*): Self = StObject.set(x, "placeholders", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IPromptStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
