package typingsSlinky.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drive extends js.Object {
  var blockSize: Double | Null = js.native
  var busType: BusType = js.native
  var busVersion: String | Null = js.native
  var description: String = js.native
  var device: String = js.native
  var devicePath: String | Null = js.native
  var enumerator: String = js.native
  var error: js.Any = js.native
  var isCard: Boolean | Null = js.native
  var isReadOnly: Boolean = js.native
  var isRemovable: Boolean | Null = js.native
  var isSCSI: Boolean | Null = js.native
  var isSystem: Boolean = js.native
  var isUAS: Boolean | Null = js.native
  var isUSB: Boolean | Null = js.native
  var isVirtual: Boolean | Null = js.native
  var logicalBlockSize: Double | Null = js.native
  var mountpoints: js.Array[MountPoint] = js.native
  var raw: String = js.native
   // can be null
  var size: Double | Null = js.native
}

object Drive {
  @scala.inline
  def apply(
    busType: BusType,
    description: String,
    device: String,
    enumerator: String,
    error: js.Any,
    isReadOnly: Boolean,
    isSystem: Boolean,
    mountpoints: js.Array[MountPoint],
    raw: String
  ): Drive = {
    val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusType(value: BusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountpoints(value: js.Array[MountPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(null)
        ret
    }
    @scala.inline
    def withBusVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busVersion")(null)
        ret
    }
    @scala.inline
    def withDevicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevicePathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePath")(null)
        ret
    }
    @scala.inline
    def withIsCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCard")(null)
        ret
    }
    @scala.inline
    def withIsRemovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemovableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemovable")(null)
        ret
    }
    @scala.inline
    def withIsSCSI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSCSI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSCSINull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSCSI")(null)
        ret
    }
    @scala.inline
    def withIsUAS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUAS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUASNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUAS")(null)
        ret
    }
    @scala.inline
    def withIsUSB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUSB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUSBNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUSB")(null)
        ret
    }
    @scala.inline
    def withIsVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVirtualNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtual")(null)
        ret
    }
    @scala.inline
    def withLogicalBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalBlockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalBlockSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalBlockSize")(null)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(null)
        ret
    }
  }
  
}

