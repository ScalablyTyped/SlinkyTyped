package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselStyleMod {
  
  @JSImport("@ant-design/react-native/lib/carousel/style", JSImport.Default)
  @js.native
  def default(theme: Theme): CarouselStyle = js.native
  
  @js.native
  trait CarouselStyle extends StObject {
    
    var pagination: ViewStyle = js.native
    
    var paginationX: ViewStyle = js.native
    
    var paginationY: ViewStyle = js.native
    
    var pointActiveStyle: ViewStyle = js.native
    
    var pointStyle: ViewStyle = js.native
    
    var spaceStyle: ViewStyle = js.native
  }
  object CarouselStyle {
    
    @scala.inline
    def apply(
      pagination: ViewStyle,
      paginationX: ViewStyle,
      paginationY: ViewStyle,
      pointActiveStyle: ViewStyle,
      pointStyle: ViewStyle,
      spaceStyle: ViewStyle
    ): CarouselStyle = {
      val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], paginationX = paginationX.asInstanceOf[js.Any], paginationY = paginationY.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselStyle]
    }
    
    @scala.inline
    implicit class CarouselStyleMutableBuilder[Self <: CarouselStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPagination(value: ViewStyle): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationX(value: ViewStyle): Self = StObject.set(x, "paginationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationY(value: ViewStyle): Self = StObject.set(x, "paginationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointActiveStyle(value: ViewStyle): Self = StObject.set(x, "pointActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointStyle(value: ViewStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceStyle(value: ViewStyle): Self = StObject.set(x, "spaceStyle", value.asInstanceOf[js.Any])
    }
  }
}
