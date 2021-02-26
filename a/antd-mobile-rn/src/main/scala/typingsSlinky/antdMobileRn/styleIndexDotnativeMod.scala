package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AlignItems
import typingsSlinky.antdMobileRn.anon.BackgroundColor
import typingsSlinky.antdMobileRn.anon.BorderRadius
import typingsSlinky.antdMobileRn.anon.Color
import typingsSlinky.antdMobileRn.anon.FlexDirection
import typingsSlinky.antdMobileRn.anon.FontSize
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.container")
    @js.native
    def container: BackgroundColor = js.native
    @scala.inline
    def container_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.innerContainer")
    @js.native
    def innerContainer: AlignItems = js.native
    @scala.inline
    def innerContainer_=(x: AlignItems): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.spinner")
    @js.native
    def spinner: FlexDirection = js.native
    @scala.inline
    def spinner_=(x: FlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinner")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.tip")
    @js.native
    def tip: Color = js.native
    @scala.inline
    def tip_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tip")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.toast")
    @js.native
    def toast: FontSize = js.native
    @scala.inline
    def toast_=(x: FontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toast")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/activity-indicator/style/index.native", "default.wrapper")
    @js.native
    def wrapper: BorderRadius = js.native
    @scala.inline
    def wrapper_=(x: BorderRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IActivityIndicatorStyle extends StObject {
    
    var container: ViewStyle = js.native
    
    var innerContainer: ViewStyle = js.native
    
    var spinner: ViewStyle = js.native
    
    var tip: TextStyle = js.native
    
    var toast: TextStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object IActivityIndicatorStyle {
    
    @scala.inline
    def apply(
      container: ViewStyle,
      innerContainer: ViewStyle,
      spinner: ViewStyle,
      tip: TextStyle,
      toast: TextStyle,
      wrapper: ViewStyle
    ): IActivityIndicatorStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActivityIndicatorStyle]
    }
    
    @scala.inline
    implicit class IActivityIndicatorStyleMutableBuilder[Self <: IActivityIndicatorStyle] (val x: Self) extends AnyVal {
      
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
