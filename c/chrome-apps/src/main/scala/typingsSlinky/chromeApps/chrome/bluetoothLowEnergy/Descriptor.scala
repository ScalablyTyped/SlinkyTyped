package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptor extends js.Object {
  /** The GATT characteristic this descriptor belongs to. */
  var characteristic: js.UndefOr[Characteristic] = js.native
  /** Returns the identifier assigned to this descriptor. Use the instance ID to distinguish between descriptors from a peripheral with the same UUID and to make function calls that take in a descriptor identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The permissions of this descriptor.
    * @since Chrome 52.
    */
  var permissions: js.Array[DescriptorPermissions] = js.native
  /** The UUID of the characteristic descriptor, e.g. 00002902-0000-1000-8000-00805f9b34fb. */
  var uuid: String = js.native
  /** The currently cached descriptor value. This value gets updated when the value of the descriptor is read. */
  var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object Descriptor {
  @scala.inline
  def apply(permissions: js.Array[DescriptorPermissions], uuid: String): Descriptor = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor]
  }
  @scala.inline
  implicit class DescriptorOps[Self <: Descriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(value: js.Array[DescriptorPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacteristic(value: Characteristic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacteristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

