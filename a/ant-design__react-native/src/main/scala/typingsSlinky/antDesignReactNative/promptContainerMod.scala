package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.anon.Type
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antDesignReactNative.stylePromptMod.PromptStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptContainerMod {
  
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
  @js.native
  class default protected () extends PropmptContainer {
    def this(props: PropmptContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.defaultProps")
    @js.native
    def defaultProps: Type = js.native
    @scala.inline
    def defaultProps_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropmptContainer
    extends Component[PropmptContainerProps, js.Any, js.Any] {
    
    def onBackAndroid(): Boolean = js.native
    
    def onChangeText(`type`: String, value: String): Unit = js.native
    
    def onClose(): Unit = js.native
  }
  
  @js.native
  trait PropmptContainerProps extends WithThemeStyles[PromptStyle] {
    
    var actions: CallbackOrActions[TextStyle] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.native
    
    var placeholders: js.UndefOr[js.Array[String]] = js.native
    
    var title: ReactElement = js.native
    
    var `type`: js.UndefOr[
        typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
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
      def setOnBackHandler(value: () => Boolean): Self = StObject.set(x, "onBackHandler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBackHandlerUndefined: Self = StObject.set(x, "onBackHandler", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: js.Array[String]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      @scala.inline
      def setPlaceholdersVarargs(value: String*): Self = StObject.set(x, "placeholders", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(
        value: typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
