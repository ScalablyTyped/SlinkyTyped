package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * If a device is blocked, connections or requests from this device will fail.
    * Can be used to temporarily prevent the device from connecting if, for
    * example, the sensor is generating bad data and needs maintenance.
    */
  var blocked: js.UndefOr[Boolean] = js.native
  /**
    * The most recent device configuration, which is eventually sent from
    * Cloud IoT Core to the device. If not present on creation, the
    * configuration will be initialized with an empty payload and version value
    * of `1`. To update this field after creation, use the
    * `DeviceManager.ModifyCloudToDeviceConfig` method.
    */
  var config: js.UndefOr[DeviceConfig] = js.native
  /**
    * The credentials used to authenticate this device. To allow credential
    * rotation without interruption, multiple device credentials can be bound to
    * this device. No more than 3 credentials can be bound to a single device at
    * a time. When new credentials are added to a device, they are verified
    * against the registry credentials. For details, see the description of the
    * `DeviceRegistry.credentials` field.
    */
  var credentials: js.UndefOr[js.Array[DeviceCredential]] = js.native
  /**
    * The user-defined device identifier. The device ID must be unique
    * within a device registry.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a cloud-to-device config version acknowledgment
    * was received from the device. This field is only for configurations
    * sent through MQTT.
    */
  var lastConfigAckTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a cloud-to-device config version was sent to
    * the device.
    */
  var lastConfigSendTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The error message of the most recent error, such as a failure
    * to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this
    * field. If no errors have occurred, this field has an empty message
    * and the status code 0 == OK. Otherwise, this field is expected to have a
    * status code other than OK.
    */
  var lastErrorStatus: js.UndefOr[Status] = js.native
  /**
    * [Output only] The time the most recent error occurred, such as a failure to
    * publish to Cloud Pub/Sub. This field is the timestamp of
    * 'last_error_status'.
    */
  var lastErrorTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a telemetry event was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes.
    */
  var lastEventTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a heartbeat was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes. This field is only for devices connecting through MQTT.
    */
  var lastHeartbeatTime: js.UndefOr[String] = js.native
  /**
    * [Output only] The last time a state event was received. Timestamps are
    * periodically collected and written to storage; they may be stale by a few
    * minutes.
    */
  var lastStateTime: js.UndefOr[String] = js.native
  /**
    * The metadata key-value pairs assigned to the device. This metadata is not
    * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
    * information for the device.
    *
    * Keys must conform to the regular expression [a-zA-Z0-9-_]+ and be less than
    * 128 bytes in length.
    *
    * Values are free-form strings. Each value must be less than or equal to 32
    * KB in size.
    *
    * The total size of all keys and values must be less than 256 KB, and the
    * maximum number of key-value pairs is 500.
    */
  var metadata: js.UndefOr[Record[String, String]] = js.native
  /**
    * The resource path name. For example,
    * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
    * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`.
    * When `name` is populated as a response from the service, it always ends
    * in the device numeric ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output only] A server-defined unique numeric ID for the device. This is a
    * more compact way to identify devices, and it is globally unique.
    */
  var numId: js.UndefOr[String] = js.native
  /**
    * [Output only] The state most recently received from the device. If no state
    * has been reported, this field is not present.
    */
  var state: js.UndefOr[DeviceState] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: DeviceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: js.Array[DeviceCredential]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLastConfigAckTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConfigAckTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastConfigAckTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConfigAckTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastConfigSendTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConfigSendTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastConfigSendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastConfigSendTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastHeartbeatTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHeartbeatTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastHeartbeatTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHeartbeatTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DeviceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

