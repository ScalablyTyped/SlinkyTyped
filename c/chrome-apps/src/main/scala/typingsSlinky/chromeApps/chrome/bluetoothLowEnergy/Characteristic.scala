package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Characteristic extends js.Object {
  /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[String] = js.native
  /** The properties of this characteristic. */
  var properties: js.Array[CharacteristicProperties] = js.native
  /** The GATT service this characteristic belongs to. */
  var service: js.UndefOr[Service] = js.native
  /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
  var uuid: String = js.native
  /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
  var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}

object Characteristic {
  @scala.inline
  def apply(properties: js.Array[CharacteristicProperties], uuid: String): Characteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  @scala.inline
  implicit class CharacteristicOps[Self <: Characteristic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Array[CharacteristicProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
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
    def withService(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
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

