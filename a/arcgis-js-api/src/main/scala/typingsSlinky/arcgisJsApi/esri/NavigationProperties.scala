package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationProperties extends StObject {
  
  /**
    * Indicates if single finger touch [drag](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#event-drag) events are enabled or disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#browserTouchPanEnabled)
    */
  var browserTouchPanEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  var gamepad: js.UndefOr[gamepadGamepadSettingsProperties] = js.native
  
  /**
    * When `true`, the view will temporarily continue to pan after the pointer (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#momentumEnabled)
    */
  var momentumEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the view can be zoomed in or out with the mouse wheel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#mouseWheelZoomEnabled)
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.native
}
object NavigationProperties {
  
  @scala.inline
  def apply(): NavigationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationProperties]
  }
  
  @scala.inline
  implicit class NavigationPropertiesMutableBuilder[Self <: NavigationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserTouchPanEnabled(value: Boolean): Self = StObject.set(x, "browserTouchPanEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserTouchPanEnabledUndefined: Self = StObject.set(x, "browserTouchPanEnabled", js.undefined)
    
    @scala.inline
    def setGamepad(value: gamepadGamepadSettingsProperties): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadUndefined: Self = StObject.set(x, "gamepad", js.undefined)
    
    @scala.inline
    def setMomentumEnabled(value: Boolean): Self = StObject.set(x, "momentumEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumEnabledUndefined: Self = StObject.set(x, "momentumEnabled", js.undefined)
    
    @scala.inline
    def setMouseWheelZoomEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelZoomEnabledUndefined: Self = StObject.set(x, "mouseWheelZoomEnabled", js.undefined)
  }
}
