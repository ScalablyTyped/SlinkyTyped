package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.system.storage.StorageCapacityInfo
import typingsSlinky.chromeApps.chrome.system.storage.StorageUnitInfo
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofstorageEjectDevice extends StObject {
  
  val EjectDeviceResultCode: FAILURE = js.native
  
  val StorageUnitType: FIXED = js.native
  
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def ejectDevice(
    id: String,
    callback: js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        /* keyof typeof EjectDeviceResultCode */ String, 
        Exclude[
          /* keyof typeof EjectDeviceResultCode */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
    * @since Dev channel only.
    */
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  
  /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
  
  /** Fired when a new removable storage is attached to the system. */
  val onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]] = js.native
  
  /** Fired when a removable storage is detached from the system. */
  val onDetached: Event[js.Function1[/* id */ String, Unit]] = js.native
}
object TypeofstorageEjectDevice {
  
  @scala.inline
  def apply(
    EjectDeviceResultCode: FAILURE,
    StorageUnitType: FIXED,
    ejectDevice: (String, js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        /* keyof typeof EjectDeviceResultCode */ String, 
        Exclude[
          /* keyof typeof EjectDeviceResultCode */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      Unit
    ]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]],
    onDetached: Event[js.Function1[/* id */ String, Unit]]
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(EjectDeviceResultCode = EjectDeviceResultCode.asInstanceOf[js.Any], StorageUnitType = StorageUnitType.asInstanceOf[js.Any], ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
  
  @scala.inline
  implicit class TypeofstorageEjectDeviceMutableBuilder[Self <: TypeofstorageEjectDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEjectDevice(
      value: (String, js.Function1[
          /* result */ ToStringLiteral[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
            /* keyof typeof EjectDeviceResultCode */ String, 
            Exclude[
              /* keyof typeof EjectDeviceResultCode */ String, 
              /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
            ]
          ], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "ejectDevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEjectDeviceResultCode(value: FAILURE): Self = StObject.set(x, "EjectDeviceResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit): Self = StObject.set(x, "getAvailableCapacity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttached(value: Event[js.Function1[/* info */ StorageUnitInfo, Unit]]): Self = StObject.set(x, "onAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDetached(value: Event[js.Function1[/* id */ String, Unit]]): Self = StObject.set(x, "onDetached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUnitType(value: FIXED): Self = StObject.set(x, "StorageUnitType", value.asInstanceOf[js.Any])
  }
}
