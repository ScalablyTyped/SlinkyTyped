package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.anon.Data
import typingsSlinky.chromeApps.anon.Uuid
import typingsSlinky.chromeApps.chromeAppsStrings.read_
import typingsSlinky.chromeApps.chromeAppsStrings.write_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on Chrome OS.
  * @requires Note: With Chrome 56, users can select nearby Bluetooth Low Energy devices to provide to web sites that use the Web Bluetooth API.
  * @description
  * The chrome.bluetoothLowEnergy API is used to communicate
  * with Bluetooth Smart (Low Energy) devices using the
  * Generic Attribute Profile (GATT).
  */
object bluetoothLowEnergy {
  
  @js.native
  trait Advertisement extends StObject {
    
    /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
    var manufacturerData: js.UndefOr[Data] = js.native
    
    /** List of service data to be included in 'Service Data' fields of the advertising data. */
    var serviceData: Uuid = js.native
    
    /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var serviceUuids: js.UndefOr[js.Array[String]] = js.native
    
    /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
    var solicitUuids: js.UndefOr[js.Array[String]] = js.native
    
    /** Type of advertisement. */
    var `type`: AdvertisementType = js.native
  }
  object Advertisement {
    
    @scala.inline
    def apply(serviceData: Uuid, `type`: AdvertisementType): Advertisement = {
      val __obj = js.Dynamic.literal(serviceData = serviceData.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    @scala.inline
    implicit class AdvertisementMutableBuilder[Self <: Advertisement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManufacturerData(value: Data): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
      
      @scala.inline
      def setServiceData(value: Uuid): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuidsUndefined: Self = StObject.set(x, "serviceUuids", js.undefined)
      
      @scala.inline
      def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
      
      @scala.inline
      def setSolicitUuids(value: js.Array[String]): Self = StObject.set(x, "solicitUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolicitUuidsUndefined: Self = StObject.set(x, "solicitUuids", js.undefined)
      
      @scala.inline
      def setSolicitUuidsVarargs(value: String*): Self = StObject.set(x, "solicitUuids", js.Array(value :_*))
      
      @scala.inline
      def setType(value: AdvertisementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.broadcast
    - typingsSlinky.chromeApps.chromeAppsStrings.peripheral
  */
  trait AdvertisementType extends StObject
  object AdvertisementType {
    
    @scala.inline
    def broadcast: typingsSlinky.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.broadcast]
    
    @scala.inline
    def peripheral: typingsSlinky.chromeApps.chromeAppsStrings.peripheral = "peripheral".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.peripheral]
  }
  
  @js.native
  trait Characteristic extends StObject {
    
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
    implicit class CharacteristicMutableBuilder[Self <: Characteristic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[CharacteristicProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: CharacteristicProperties*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.broadcast
    - typingsSlinky.chromeApps.chromeAppsStrings.read_
    - typingsSlinky.chromeApps.chromeAppsStrings.writeWithoutResponse
    - typingsSlinky.chromeApps.chromeAppsStrings.write_
    - typingsSlinky.chromeApps.chromeAppsStrings.notify
    - typingsSlinky.chromeApps.chromeAppsStrings.indicate
    - typingsSlinky.chromeApps.chromeAppsStrings.authenticatedSignedWrites
    - typingsSlinky.chromeApps.chromeAppsStrings.extendedProperties
    - typingsSlinky.chromeApps.chromeAppsStrings.reliableWrite
    - typingsSlinky.chromeApps.chromeAppsStrings.writableAuxiliaries
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptRead
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptWrite
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedRead
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite
  */
  trait CharacteristicProperties extends StObject
  object CharacteristicProperties {
    
    @scala.inline
    def authenticatedSignedWrites: typingsSlinky.chromeApps.chromeAppsStrings.authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.authenticatedSignedWrites]
    
    @scala.inline
    def broadcast: typingsSlinky.chromeApps.chromeAppsStrings.broadcast = "broadcast".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.broadcast]
    
    @scala.inline
    def encryptAuthenticatedRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedRead = "encryptAuthenticatedRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedRead]
    
    @scala.inline
    def encryptAuthenticatedWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite = "encryptAuthenticatedWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite]
    
    @scala.inline
    def encryptRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptRead = "encryptRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptRead]
    
    @scala.inline
    def encryptWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptWrite = "encryptWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptWrite]
    
    @scala.inline
    def extendedProperties: typingsSlinky.chromeApps.chromeAppsStrings.extendedProperties = "extendedProperties".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.extendedProperties]
    
    @scala.inline
    def indicate: typingsSlinky.chromeApps.chromeAppsStrings.indicate = "indicate".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.indicate]
    
    @scala.inline
    def read: read_ = "read".asInstanceOf[read_]
    
    @scala.inline
    def reliableWrite: typingsSlinky.chromeApps.chromeAppsStrings.reliableWrite = "reliableWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.reliableWrite]
    
    @scala.inline
    def writableAuxiliaries: typingsSlinky.chromeApps.chromeAppsStrings.writableAuxiliaries = "writableAuxiliaries".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.writableAuxiliaries]
    
    @scala.inline
    def write: write_ = "write".asInstanceOf[write_]
    
    @scala.inline
    def writeWithoutResponse: typingsSlinky.chromeApps.chromeAppsStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.writeWithoutResponse]
  }
  
  @js.native
  trait Descriptor extends StObject {
    
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
    implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristic(value: Characteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setPermissions(value: js.Array[DescriptorPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: DescriptorPermissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.read_
    - typingsSlinky.chromeApps.chromeAppsStrings.write_
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptedRead
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptedWrite
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
    - typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
  */
  trait DescriptorPermissions extends StObject
  object DescriptorPermissions {
    
    @scala.inline
    def encryptedAuthenticatedRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = "encryptedAuthenticatedRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead]
    
    @scala.inline
    def encryptedAuthenticatedWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = "encryptedAuthenticatedWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite]
    
    @scala.inline
    def encryptedRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptedRead = "encryptedRead".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptedRead]
    
    @scala.inline
    def encryptedWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptedWrite = "encryptedWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.encryptedWrite]
    
    @scala.inline
    def read: read_ = "read".asInstanceOf[read_]
    
    @scala.inline
    def write: write_ = "write".asInstanceOf[write_]
  }
  
  @js.native
  trait INotification extends StObject {
    
    /** Optional flag for sending an indication instead of a notification. */
    var shouldIndicate: Boolean = js.native
    
    /** New value of the characteristic. */
    var value: js.typedarray.ArrayBuffer = js.native
  }
  object INotification {
    
    @scala.inline
    def apply(shouldIndicate: Boolean, value: js.typedarray.ArrayBuffer): INotification = {
      val __obj = js.Dynamic.literal(shouldIndicate = shouldIndicate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotification]
    }
    
    @scala.inline
    implicit class INotificationMutableBuilder[Self <: INotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldIndicate(value: Boolean): Self = StObject.set(x, "shouldIndicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProperties extends StObject {
    
    /**
      * Flag indicating whether a connection to the device is left open when the event page of the application is unloaded. The default value is false.
      * @see [HowToManageAppLifecycle]{@link https://developer.chrome.com/apps/app_lifecycle}
      * @default false
      */
    var persistent: Boolean = js.native
  }
  object IProperties {
    
    @scala.inline
    def apply(persistent: Boolean): IProperties = {
      val __obj = js.Dynamic.literal(persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProperties]
    }
    
    @scala.inline
    implicit class IPropertiesMutableBuilder[Self <: IProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResponse extends StObject {
    
    /** If this is an error response, this should be true. */
    var isError: Boolean = js.native
    
    /** Id of the request this is a response to. */
    var requestId: integer = js.native
    
    /** Response value. Write requests and error responses will ignore this parameter. */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  }
  object IResponse {
    
    @scala.inline
    def apply(isError: Boolean, requestId: integer): IResponse = {
      val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    /** Device that send this request. */
    var device: RequestDevice = js.native
    
    /** Unique ID for this request. Use this ID when responding to this request. */
    var requestId: integer = js.native
    
    /** Value to write (if this is a write request). */
    var value: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(device: RequestDevice, requestId: integer): Request = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: RequestDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: integer): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RequestDevice extends StObject {
    
    /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
    var address: String = js.native
    
    /** The class of the device, a bit - field defined by:
      * @see [Specs]{@link http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband}
      **/
    var deviceClass: js.UndefOr[integer] = js.native
    
    /** The human-readable name of the device. */
    var name: js.UndefOr[String] = js.native
  }
  object RequestDevice {
    
    @scala.inline
    def apply(address: String): RequestDevice = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDevice]
    }
    
    @scala.inline
    implicit class RequestDeviceMutableBuilder[Self <: RequestDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceClass(value: integer): Self = StObject.set(x, "deviceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceClassUndefined: Self = StObject.set(x, "deviceClass", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait Service extends StObject {
    
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
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceAddressUndefined: Self = StObject.set(x, "deviceAddress", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
