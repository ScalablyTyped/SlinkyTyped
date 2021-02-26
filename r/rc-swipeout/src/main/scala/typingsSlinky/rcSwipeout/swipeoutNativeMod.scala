package typingsSlinky.rcSwipeout

import slinky.core.facade.ReactElement
import typingsSlinky.rcSwipeout.anon.BackgroundColor
import typingsSlinky.rcSwipeout.propTypesMod.IPropTypes
import typingsSlinky.rcSwipeout.rcSwipeoutStrings.delete
import typingsSlinky.rcSwipeout.rcSwipeoutStrings.primary
import typingsSlinky.rcSwipeout.rcSwipeoutStrings.secondary
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeoutNativeMod {
  
  @JSImport("rc-swipeout/lib/Swipeout.native", JSImport.Default)
  @js.native
  class default protected () extends Swipeout {
    def this(props: js.Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      @scala.inline
      def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.onClose")
      @js.native
      def onClose(): Unit = js.native
      
      @JSImport("rc-swipeout/lib/Swipeout.native", "default.defaultProps.onOpen")
      @js.native
      def onOpen(): Unit = js.native
    }
  }
  
  @js.native
  trait SwipeButttonType extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[
        typingsSlinky.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary
      ] = js.native
    
    var underlayColor: js.UndefOr[String] = js.native
  }
  object SwipeButttonType {
    
    @scala.inline
    def apply(): SwipeButttonType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeButttonType]
    }
    
    @scala.inline
    implicit class SwipeButttonTypeMutableBuilder[Self <: SwipeButttonType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: typingsSlinky.rcSwipeout.rcSwipeoutStrings.default | delete | primary | secondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait Swipeout
    extends Component[IPropTypes, js.Any, js.Any] {
    
    def renderCustomButton(button: js.Any): BackgroundColor = js.native
  }
}
