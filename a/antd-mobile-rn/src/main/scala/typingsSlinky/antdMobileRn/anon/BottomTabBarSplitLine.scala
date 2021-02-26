package typingsSlinky.antdMobileRn.anon

import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomTabBarSplitLine extends StObject {
  
  var bottomTabBarSplitLine: ViewStyle = js.native
  
  var container: ViewStyle = js.native
  
  var topTabBarSplitLine: ViewStyle = js.native
}
object BottomTabBarSplitLine {
  
  @scala.inline
  def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): BottomTabBarSplitLine = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabBarSplitLine]
  }
  
  @scala.inline
  implicit class BottomTabBarSplitLineMutableBuilder[Self <: BottomTabBarSplitLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
  }
}
