package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationStyleMod {
  
  @JSImport("@ant-design/react-native/lib/pagination/style", JSImport.Default)
  @js.native
  def default(theme: Theme): PaginationStyle = js.native
  
  @js.native
  trait PaginationStyle extends StObject {
    
    var activeTextStyle: TextStyle = js.native
    
    var container: ViewStyle = js.native
    
    var indicatorStyle: ViewStyle = js.native
    
    var numberStyle: ViewStyle = js.native
    
    var pointActiveStyle: ViewStyle = js.native
    
    var pointStyle: ViewStyle = js.native
    
    var spaceStyle: ViewStyle = js.native
    
    var totalStyle: TextStyle = js.native
  }
  object PaginationStyle {
    
    @scala.inline
    def apply(
      activeTextStyle: TextStyle,
      container: ViewStyle,
      indicatorStyle: ViewStyle,
      numberStyle: ViewStyle,
      pointActiveStyle: ViewStyle,
      pointStyle: ViewStyle,
      spaceStyle: ViewStyle,
      totalStyle: TextStyle
    ): PaginationStyle = {
      val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationStyle]
    }
    
    @scala.inline
    implicit class PaginationStyleMutableBuilder[Self <: PaginationStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTextStyle(value: TextStyle): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyle(value: ViewStyle): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberStyle(value: ViewStyle): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointActiveStyle(value: ViewStyle): Self = StObject.set(x, "pointActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointStyle(value: ViewStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceStyle(value: ViewStyle): Self = StObject.set(x, "spaceStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalStyle(value: TextStyle): Self = StObject.set(x, "totalStyle", value.asInstanceOf[js.Any])
    }
  }
}
