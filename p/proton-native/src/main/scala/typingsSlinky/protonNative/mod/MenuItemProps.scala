package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.protonNativeStrings.About
import typingsSlinky.protonNative.protonNativeStrings.Check
import typingsSlinky.protonNative.protonNativeStrings.Item
import typingsSlinky.protonNative.protonNativeStrings.Preferences
import typingsSlinky.protonNative.protonNativeStrings.Quit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemProps extends StObject {
  
  /**
    * If the type is `Check`, then set whether it is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * The text to display for the menu item.
    */
  var children: js.UndefOr[String] = js.native
  
  /**
    * Called when the menu item is clicked. If the type is `Check`, then it passes whether it is checked as an argument.
    */
  var onClick: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  
  /**
    * How the menu item is displayed.
    *
    * - `Check` - a checkable option in the menu.
    * - `Quit` - a Quit button. This accepts no text.
    * - `About` - an About button. This accepts no text.
    * - `Preferences` - a Preferences button. This accepts no text.
    * - `Separator` - a Separator between menu items. This accepts no text.
    * - `Item` - a normal menu button. This is the default.
    */
  var `type`: js.UndefOr[
    Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item
  ] = js.native
}
object MenuItemProps {
  
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  
  @scala.inline
  implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setType(
      value: Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
