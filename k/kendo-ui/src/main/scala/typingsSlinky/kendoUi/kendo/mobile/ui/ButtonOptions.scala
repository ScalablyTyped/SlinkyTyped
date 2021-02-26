package typingsSlinky.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOptions extends StObject {
  
  var badge: js.UndefOr[String] = js.native
  
  var click: js.UndefOr[js.Function1[/* e */ ButtonClickEvent, Unit]] = js.native
  
  var clickOn: js.UndefOr[String] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ButtonOptions {
  
  @scala.inline
  def apply(): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ButtonClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickOn(value: String): Self = StObject.set(x, "clickOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOnUndefined: Self = StObject.set(x, "clickOn", js.undefined)
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
