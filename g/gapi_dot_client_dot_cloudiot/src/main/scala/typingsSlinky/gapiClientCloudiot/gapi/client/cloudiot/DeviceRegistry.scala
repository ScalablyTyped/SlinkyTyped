package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceRegistry extends js.Object {
  /**
    * The credentials used to verify the device credentials. No more than 10
    * credentials can be bound to a single registry at a time. The verification
    * process occurs at the time of device creation or update. If this field is
    * empty, no verification is performed. Otherwise, the credentials of a newly
    * created device or added credentials of an updated device should be signed
    * with one of these registry credentials.
    *
    * Note, however, that existing devices will never be affected by
    * modifications to this list of credentials: after a device has been
    * successfully created in a registry, it should be able to connect even if
    * its registry credentials are revoked, deleted, or modified.
    */
  var credentials: js.UndefOr[js.Array[RegistryCredential]] = js.native
  /**
    * The configuration for notification of telemetry events received from the
    * device. All telemetry events that were successfully published by the
    * device and acknowledged by Cloud IoT Core are guaranteed to be
    * delivered to Cloud Pub/Sub. Only the first configuration is used.
    */
  var eventNotificationConfigs: js.UndefOr[js.Array[EventNotificationConfig]] = js.native
  /** The DeviceService (HTTP) configuration for this device registry. */
  var httpConfig: js.UndefOr[HttpConfig] = js.native
  /** The identifier of this device registry. For example, `myRegistry`. */
  var id: js.UndefOr[String] = js.native
  /** The MQTT configuration for this device registry. */
  var mqttConfig: js.UndefOr[MqttConfig] = js.native
  /**
    * The resource path name. For example,
    * `projects/example-project/locations/us-central1/registries/my-registry`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The configuration for notification of new states received from the device.
    * State updates are guaranteed to be stored in the state history, but
    * notifications to Cloud Pub/Sub are not guaranteed. For example, if
    * permissions are misconfigured or the specified topic doesn't exist, no
    * notification will be published but the state will still be stored in Cloud
    * IoT Core.
    */
  var stateNotificationConfig: js.UndefOr[StateNotificationConfig] = js.native
}

object DeviceRegistry {
  @scala.inline
  def apply(): DeviceRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRegistry]
  }
  @scala.inline
  implicit class DeviceRegistryOps[Self <: DeviceRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: js.Array[RegistryCredential]): Self = {
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
    def withEventNotificationConfigs(value: js.Array[EventNotificationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNotificationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventNotificationConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNotificationConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpConfig(value: HttpConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpConfig")(js.undefined)
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
    def withMqttConfig(value: MqttConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMqttConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mqttConfig")(js.undefined)
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
    def withStateNotificationConfig(value: StateNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateNotificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateNotificationConfig")(js.undefined)
        ret
    }
  }
  
}

