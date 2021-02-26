package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.bezel
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.entireScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSideMenu extends StObject {
  
  /**
    * Configure the left side menu
    */
  var left: js.UndefOr[SideMenuSide] = js.native
  
  /**
    * Configure how a user is allowed to open a drawer using gestures
    * #### (iOS specific)
    * @default 'entireScreen'
    */
  var openGestureMode: js.UndefOr[entireScreen | bezel] = js.native
  
  /**
    * Configure the right side menu
    */
  var right: js.UndefOr[SideMenuSide] = js.native
}
object OptionsSideMenu {
  
  @scala.inline
  def apply(): OptionsSideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSideMenu]
  }
  
  @scala.inline
  implicit class OptionsSideMenuMutableBuilder[Self <: OptionsSideMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: SideMenuSide): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setOpenGestureMode(value: entireScreen | bezel): Self = StObject.set(x, "openGestureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenGestureModeUndefined: Self = StObject.set(x, "openGestureMode", js.undefined)
    
    @scala.inline
    def setRight(value: SideMenuSide): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
