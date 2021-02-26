package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.system.storage.StorageCapacityInfo
import typingsSlinky.chrome.chrome.system.storage.StorageUnitInfo
import typingsSlinky.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typingsSlinky.chrome.chrome.system.storage.SystemStorageDetachedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofstorageEjectDevice extends StObject {
  
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
  
  var onAttached: SystemStorageAttachedEvent = js.native
  
  var onDetached: SystemStorageDetachedEvent = js.native
}
object TypeofstorageEjectDevice {
  
  @scala.inline
  def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Unit,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(ejectDevice = js.Any.fromFunction2(ejectDevice), getAvailableCapacity = js.Any.fromFunction2(getAvailableCapacity), getInfo = js.Any.fromFunction1(getInfo), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
  
  @scala.inline
  implicit class TypeofstorageEjectDeviceMutableBuilder[Self <: TypeofstorageEjectDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEjectDevice(value: (String, js.Function1[/* result */ String, Unit]) => Unit): Self = StObject.set(x, "ejectDevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit): Self = StObject.set(x, "getAvailableCapacity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttached(value: SystemStorageAttachedEvent): Self = StObject.set(x, "onAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDetached(value: SystemStorageDetachedEvent): Self = StObject.set(x, "onDetached", value.asInstanceOf[js.Any])
  }
}
