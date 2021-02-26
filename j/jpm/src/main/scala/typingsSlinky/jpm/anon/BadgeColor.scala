package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.Icon
import typingsSlinky.jpm.FFAddonSDK.ToggleButtonState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeColor extends StObject {
  
  var badge: js.UndefOr[String | Double] = js.native
  
  var badgeColor: js.UndefOr[String] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: Icon = js.native
  
  var id: String = js.native
  
  var label: String = js.native
  
  var onChange: js.UndefOr[js.Function1[/* state */ ToggleButtonState, _]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* state */ ToggleButtonState, _]] = js.native
}
object BadgeColor {
  
  @scala.inline
  def apply(icon: Icon, id: String, label: String): BadgeColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeColor]
  }
  
  @scala.inline
  implicit class BadgeColorMutableBuilder[Self <: BadgeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: /* state */ ToggleButtonState => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* state */ ToggleButtonState => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
