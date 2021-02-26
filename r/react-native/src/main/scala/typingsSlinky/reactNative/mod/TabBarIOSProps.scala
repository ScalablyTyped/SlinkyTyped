package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarIOSProps extends ViewProps {
  
  /**
    * Background color of the tab bar
    */
  var barTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Specifies tab bar item positioning. Available values are:
    * - fill - distributes items across the entire width of the tab bar
    * - center - centers item in the available tab bar space
    * - auto (default) - distributes items dynamically according to the
    * user interface idiom. In a horizontally compact environment (e.g. iPhone 5)
    * this value defaults to `fill`, in a horizontally regular one (e.g. iPad)
    * it defaults to center.
    */
  var itemPositioning: js.UndefOr[fill | center | auto] = js.native
  
  /**
    * Color of the currently selected tab icon
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * A Boolean value that indicates whether the tab bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of unselected tab icons. Available since iOS 10.
    */
  var unselectedItemTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Color of text on unselected tabs
    */
  var unselectedTintColor: js.UndefOr[ColorValue] = js.native
}
object TabBarIOSProps {
  
  @scala.inline
  def apply(): TabBarIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarIOSProps]
  }
  
  @scala.inline
  implicit class TabBarIOSPropsMutableBuilder[Self <: TabBarIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarTintColor(value: ColorValue): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
    
    @scala.inline
    def setItemPositioning(value: fill | center | auto): Self = StObject.set(x, "itemPositioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPositioningUndefined: Self = StObject.set(x, "itemPositioning", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    @scala.inline
    def setUnselectedItemTintColor(value: ColorValue): Self = StObject.set(x, "unselectedItemTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedItemTintColorUndefined: Self = StObject.set(x, "unselectedItemTintColor", js.undefined)
    
    @scala.inline
    def setUnselectedTintColor(value: ColorValue): Self = StObject.set(x, "unselectedTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedTintColorUndefined: Self = StObject.set(x, "unselectedTintColor", js.undefined)
  }
}
