package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorStyleMod {
  
  @JSImport("@ant-design/react-native/lib/activity-indicator/style", JSImport.Default)
  @js.native
  def default(theme: Theme): ActivityIndicatorStyle = js.native
  
  @js.native
  trait ActivityIndicatorStyle extends StObject {
    
    var container: ViewStyle = js.native
    
    var innerContainer: ViewStyle = js.native
    
    var spinner: ViewStyle = js.native
    
    var tip: TextStyle = js.native
    
    var toast: TextStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object ActivityIndicatorStyle {
    
    @scala.inline
    def apply(
      container: ViewStyle,
      innerContainer: ViewStyle,
      spinner: ViewStyle,
      tip: TextStyle,
      toast: TextStyle,
      wrapper: ViewStyle
    ): ActivityIndicatorStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityIndicatorStyle]
    }
    
    @scala.inline
    implicit class ActivityIndicatorStyleMutableBuilder[Self <: ActivityIndicatorStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinner(value: ViewStyle): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTip(value: TextStyle): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast(value: TextStyle): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
