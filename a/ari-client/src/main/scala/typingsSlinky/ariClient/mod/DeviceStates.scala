package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.DeviceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceStates extends StObject {
  
  /**
    * Destroy a device-state controlled by ARI.
    *
    * @param params.deviceName - Name of the device.
    */
  def delete(params: DeviceName): js.Promise[Unit] = js.native
  /**
    * Destroy a device-state controlled by ARI.
    *
    * @param params.deviceName - Name of the device.
    */
  def delete(params: DeviceName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Retrieve the current state of a device.
    *
    * @param params.deviceName - Name of the device.
    */
  def get(params: DeviceName): js.Promise[DeviceState] = js.native
  /**
    * Retrieve the current state of a device.
    *
    * @param params.deviceName - Name of the device.
    */
  def get(
    params: DeviceName,
    callback: js.Function2[/* err */ js.Error, /* devicestate */ DeviceState, Unit]
  ): Unit = js.native
  
  /**
    * List all ARI controlled device states.
    */
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /**
    * List all ARI controlled device states.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* devicestates */ js.Array[DeviceState], Unit]): Unit = js.native
  
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceName - Name of the device.
    * @param params.deviceState - Device state value.
    */
  def update(params: typingsSlinky.ariClient.anon.DeviceState): js.Promise[Unit] = js.native
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceName - Name of the device.
    * @param params.deviceState - Device state value.
    */
  def update(params: typingsSlinky.ariClient.anon.DeviceState, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
