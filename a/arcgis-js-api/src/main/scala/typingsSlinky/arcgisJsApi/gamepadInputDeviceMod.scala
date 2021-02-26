package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.GamepadInputDevice
import typingsSlinky.arcgisJsApi.esri.GamepadInputDeviceConstructor
import typingsSlinky.arcgisJsApi.esri.GamepadInputDeviceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadInputDeviceMod extends Shortcut {
  
  @JSImport("esri/views/input/gamepad/GamepadInputDevice", JSImport.Namespace)
  @js.native
  val ^ : GamepadInputDeviceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/input/gamepad/GamepadInputDevice", JSImport.Namespace)
  @js.native
  /**
    * Properties and configuration of a gamepad.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadInputDevice.html)
    */
  class Class () extends GamepadInputDevice {
    def this(properties: GamepadInputDeviceProperties) = this()
  }
  
  type _To = GamepadInputDeviceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `gamepadInputDeviceMod.foo` */
  override def _to: GamepadInputDeviceConstructor = ^
}
