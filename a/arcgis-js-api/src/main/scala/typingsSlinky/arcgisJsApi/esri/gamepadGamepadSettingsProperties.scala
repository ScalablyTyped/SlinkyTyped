package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`forward-down`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`forward-up`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pan
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gamepadGamepadSettingsProperties extends StObject {
  
  /**
    * Use this property to explicitly select the gamepad device for map and scene navigation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#device)
    */
  var device: js.UndefOr[GamepadInputDeviceProperties] = js.native
  
  /**
    * Whether gamepad navigation is enabled on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This setting controls the behavior of forward and back movement of the left stick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#mode)
    */
  var mode: js.UndefOr[pan | zoom] = js.native
  
  /**
    * Determines whether pressing the tilt axis forwards make the view tilt down (towards the nadir), or up (towards the zenith).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-gamepad-GamepadSettings.html#tiltDirection)
    */
  var tiltDirection: js.UndefOr[`forward-down` | `forward-up`] = js.native
}
object gamepadGamepadSettingsProperties {
  
  @scala.inline
  def apply(): gamepadGamepadSettingsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gamepadGamepadSettingsProperties]
  }
  
  @scala.inline
  implicit class gamepadGamepadSettingsPropertiesMutableBuilder[Self <: gamepadGamepadSettingsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: GamepadInputDeviceProperties): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMode(value: pan | zoom): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTiltDirection(value: `forward-down` | `forward-up`): Self = StObject.set(x, "tiltDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltDirectionUndefined: Self = StObject.set(x, "tiltDirection", js.undefined)
  }
}
