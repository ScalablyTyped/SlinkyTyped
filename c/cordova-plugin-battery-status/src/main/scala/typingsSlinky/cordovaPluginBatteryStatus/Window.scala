package typingsSlinky.cordovaPluginBatteryStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  /**
    * Adds a listener for an event from the BatteryStatus plugin.
    * @param type       - The event to listen for.
    * 
    *                     `batterystatus`: event fires when the percentage of battery charge changes by at least 1 percent, or if the device is plugged in or unplugged.
    * 
    *                     `batterycritical`: event fires when the percentage of battery charge has reached the critical battery threshold. The value is device-specific.
    * 
    *                     `batterylow`: event fires when the percentage of battery charge has reached the low battery threshold, device-specific value.
    * @param listener   - The function that executes when the event fires. The function is passed an BatteryStatusEvent object as a parameter.
    * @param useCapture - A Boolean indicating whether events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree.
    */
  def addEventListener(`type`: batteryEvent, listener: js.Function1[/* ev */ BatteryStatusEvent, _]): Unit = js.native
  def addEventListener(`type`: batteryEvent, listener: js.Function1[/* ev */ BatteryStatusEvent, _], useCapture: Boolean): Unit = js.native
  
  def onbatterycritical(`type`: BatteryStatusEvent): Unit = js.native
  
  def onbatterylow(`type`: BatteryStatusEvent): Unit = js.native
  
  def onbatterystatus(`type`: BatteryStatusEvent): Unit = js.native
  
  /**
    * Removes a listener for an event from the BatteryStatus plugin.
    * @param Atype      - The event to stop listening for.
    * 
    *                     `batterystatus`: event fires when the percentage of battery charge changes by at least 1 percent, or if the device is plugged in or unplugged.
    *                    
    *                     `batterycritical`: event fires when the percentage of battery charge has reached the critical battery threshold. The value is device-specific.
    *                    
    *                     `batterylow`: event fires when the percentage of battery charge has reached the low battery threshold, device-specific value.
    * @param callback   - The function that executes when the event fires. The function is passed an BatteryStatusEvent object as a parameter.
    * @param useCapture - A Boolean indicating whether events of this type will be dispatched to the registered listener before being dispatched to any EventTarget beneath it in the DOM tree.
    */
  def removeEventListener(`type`: batteryEvent, listener: js.Function1[/* ev */ BatteryStatusEvent, _]): Unit = js.native
  def removeEventListener(`type`: batteryEvent, listener: js.Function1[/* ev */ BatteryStatusEvent, _], useCapture: Boolean): Unit = js.native
}
