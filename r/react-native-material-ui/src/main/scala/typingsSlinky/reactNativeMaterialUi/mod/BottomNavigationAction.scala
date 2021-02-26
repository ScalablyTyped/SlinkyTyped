package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomNavigationAction extends StObject {
  
  var active: Boolean = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: ReactElement | String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[Active] = js.native
  
  var testID: js.UndefOr[String] = js.native
}
object BottomNavigationAction {
  
  @scala.inline
  def apply(active: Boolean, icon: ReactElement | String): BottomNavigationAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationAction]
  }
  
  @scala.inline
  implicit class BottomNavigationActionMutableBuilder[Self <: BottomNavigationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactElement | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: Active): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
