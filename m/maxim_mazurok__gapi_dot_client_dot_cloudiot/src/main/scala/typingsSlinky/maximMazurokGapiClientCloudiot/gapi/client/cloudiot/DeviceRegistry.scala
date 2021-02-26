package typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceRegistry extends StObject {
  
  /**
    * The credentials used to verify the device credentials. No more than 10 credentials can be bound to a single registry at a time. The verification process occurs at the time of device
    * creation or update. If this field is empty, no verification is performed. Otherwise, the credentials of a newly created device or added credentials of an updated device should be
    * signed with one of these registry credentials. Note, however, that existing devices will never be affected by modifications to this list of credentials: after a device has been
    * successfully created in a registry, it should be able to connect even if its registry credentials are revoked, deleted, or modified.
    */
  var credentials: js.UndefOr[js.Array[RegistryCredential]] = js.native
  
  /**
    * The configuration for notification of telemetry events received from the device. All telemetry events that were successfully published by the device and acknowledged by Cloud IoT
    * Core are guaranteed to be delivered to Cloud Pub/Sub. If multiple configurations match a message, only the first matching configuration is used. If you try to publish a device
    * telemetry event using MQTT without specifying a Cloud Pub/Sub topic for the device's registry, the connection closes automatically. If you try to do so using an HTTP connection, an
    * error is returned. Up to 10 configurations may be provided.
    */
  var eventNotificationConfigs: js.UndefOr[js.Array[EventNotificationConfig]] = js.native
  
  /** The DeviceService (HTTP) configuration for this device registry. */
  var httpConfig: js.UndefOr[HttpConfig] = js.native
  
  /** The identifier of this device registry. For example, `myRegistry`. */
  var id: js.UndefOr[String] = js.native
  
  /** **Beta Feature** The default logging verbosity for activity from devices in this registry. The verbosity level can be overridden by Device.log_level. */
  var logLevel: js.UndefOr[String] = js.native
  
  /** The MQTT configuration for this device registry. */
  var mqttConfig: js.UndefOr[MqttConfig] = js.native
  
  /** The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The configuration for notification of new states received from the device. State updates are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are not
    * guaranteed. For example, if permissions are misconfigured or the specified topic doesn't exist, no notification will be published but the state will still be stored in Cloud IoT
    * Core.
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
  implicit class DeviceRegistryMutableBuilder[Self <: DeviceRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Array[RegistryCredential]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCredentialsVarargs(value: RegistryCredential*): Self = StObject.set(x, "credentials", js.Array(value :_*))
    
    @scala.inline
    def setEventNotificationConfigs(value: js.Array[EventNotificationConfig]): Self = StObject.set(x, "eventNotificationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNotificationConfigsUndefined: Self = StObject.set(x, "eventNotificationConfigs", js.undefined)
    
    @scala.inline
    def setEventNotificationConfigsVarargs(value: EventNotificationConfig*): Self = StObject.set(x, "eventNotificationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setHttpConfig(value: HttpConfig): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setMqttConfig(value: MqttConfig): Self = StObject.set(x, "mqttConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqttConfigUndefined: Self = StObject.set(x, "mqttConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStateNotificationConfig(value: StateNotificationConfig): Self = StObject.set(x, "stateNotificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNotificationConfigUndefined: Self = StObject.set(x, "stateNotificationConfig", js.undefined)
  }
}
