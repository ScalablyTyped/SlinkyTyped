package typingsSlinky.naverWhale

import typingsSlinky.chrome.chrome.system.storage.StorageCapacityInfo
import typingsSlinky.chrome.chrome.system.storage.StorageUnitInfo
import typingsSlinky.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typingsSlinky.chrome.chrome.system.storage.SystemStorageDetachedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofstorageEjectDevice extends js.Object {
  var onAttached: SystemStorageAttachedEvent = js.native
  var onDetached: SystemStorageDetachedEvent = js.native
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
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
  implicit class TypeofstorageEjectDeviceOps[Self <: TypeofstorageEjectDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEjectDevice(value: (String, js.Function1[/* result */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ejectDevice")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableCapacity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAttached(value: SystemStorageAttachedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDetached(value: SystemStorageDetachedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetached")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

