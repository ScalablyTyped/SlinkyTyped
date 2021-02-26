package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.left
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.mini
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.regular
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsFab extends StObject {
  
  var alignHorizontally: js.UndefOr[left | right] = js.native
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var clickColor: js.UndefOr[Color] = js.native
  
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[ImageResource] = js.native
  
  var iconColor: js.UndefOr[Color] = js.native
  
  var id: String = js.native
  
  var rippleColor: js.UndefOr[Color] = js.native
  
  var size: js.UndefOr[mini | regular] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OptionsFab {
  
  @scala.inline
  def apply(id: String): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFab]
  }
  
  @scala.inline
  implicit class OptionsFabMutableBuilder[Self <: OptionsFab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignHorizontally(value: left | right): Self = StObject.set(x, "alignHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignHorizontallyUndefined: Self = StObject.set(x, "alignHorizontally", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setClickColor(value: Color): Self = StObject.set(x, "clickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickColorUndefined: Self = StObject.set(x, "clickColor", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: Boolean): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageResource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: Color): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColor(value: Color): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setSize(value: mini | regular): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
