package typingsSlinky.reactNotifyToast

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.custom
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.error
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.success
import typingsSlinky.reactNotifyToast.reactNotifyToastStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notify-toast", JSImport.Default)
  @js.native
  class default protected () extends Notification {
    def this(props: NotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NotificationProps, context: js.Any) = this()
  }
  
  @JSImport("react-notify-toast", "Notification")
  @js.native
  class Notification protected ()
    extends Component[NotificationProps, js.Any, js.Any] {
    def this(props: NotificationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NotificationProps, context: js.Any) = this()
  }
  
  @JSImport("react-notify-toast", "notify")
  @js.native
  val notify_ : typingsSlinky.reactNotifyToast.mod.reactNotifyToast = js.native
  
  @js.native
  trait NotificationProps extends StObject {
    
    var options: js.UndefOr[Options] = js.native
  }
  object NotificationProps {
    
    @scala.inline
    def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    @scala.inline
    implicit class NotificationPropsMutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var colors: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double | String] = js.native
    
    var wrapperId: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setColors(value: js.Any): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWrapperId(value: String): Self = StObject.set(x, "wrapperId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperIdUndefined: Self = StObject.set(x, "wrapperId", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait reactNotifyToast extends StObject {
    
    def createShowQueue(): typingsSlinky.reactNotifyToast.mod.reactNotifyToast = js.native
    
    def hide(): Unit = js.native
    
    def show(text: String): Unit = js.native
    def show(
      text: String,
      `type`: js.UndefOr[scala.Nothing],
      timeout: js.UndefOr[scala.Nothing],
      color: reactNotifyToastColor
    ): Unit = js.native
    def show(text: String, `type`: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
    def show(text: String, `type`: js.UndefOr[scala.Nothing], timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: Double): Unit = js.native
    @JSName("show")
    def show_custom(text: String, `type`: custom, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: Double): Unit = js.native
    @JSName("show")
    def show_error(text: String, `type`: error, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: Double): Unit = js.native
    @JSName("show")
    def show_success(text: String, `type`: success, timeout: Double, color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: js.UndefOr[scala.Nothing], color: reactNotifyToastColor): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: Double): Unit = js.native
    @JSName("show")
    def show_warning(text: String, `type`: warning, timeout: Double, color: reactNotifyToastColor): Unit = js.native
  }
  
  @js.native
  trait reactNotifyToastColor extends StObject {
    
    var background: String = js.native
    
    var text: String = js.native
  }
  object reactNotifyToastColor {
    
    @scala.inline
    def apply(background: String, text: String): reactNotifyToastColor = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[reactNotifyToastColor]
    }
    
    @scala.inline
    implicit class reactNotifyToastColorMutableBuilder[Self <: reactNotifyToastColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
