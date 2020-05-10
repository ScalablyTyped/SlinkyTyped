package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The device address of the remote peripheral that the GATT service belongs to.
    * Present, if this instance represents a remote service.
    */
  var deviceAddress: js.UndefOr[String] = js.native
  /**
    * Returns the identifier assigned to this service.
    * Use the instance ID to distinguish between services from a peripheral with the same UUID and to make function calls that take in a service identifier.
    * Present, if this instance represents a remote service.
    **/
  var instanceId: js.UndefOr[String] = js.native
  /** Indicates whether the type of this service is primary or secondary. */
  var isPrimary: Boolean = js.native
  /** The UUID of the service, e.g. 0000180d-0000-1000-8000-00805f9b34fb. */
  var uuid: String = js.native
}

object Service {
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): Service = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAddress")(js.undefined)
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
  }
  
}

