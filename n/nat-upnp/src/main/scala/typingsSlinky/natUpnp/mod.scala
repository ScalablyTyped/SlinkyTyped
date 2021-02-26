package typingsSlinky.natUpnp

import typingsSlinky.natUpnp.anon.ControlURL
import typingsSlinky.natUpnp.anon.Device
import typingsSlinky.natUpnp.anon.Devices
import typingsSlinky.natUpnp.anon.Dictkey
import typingsSlinky.natUpnp.anon.Host
import typingsSlinky.natUpnp.anon.Port
import typingsSlinky.natUpnp.anon.Service
import typingsSlinky.natUpnp.anon._empty
import typingsSlinky.natUpnp.anon.`0`
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nat-upnp", "createClient")
  @js.native
  def createClient(): Client = js.native
  
  object device {
    
    /**
      * Create a gateway device object with the specified url
      * @param url
      */
    @JSImport("nat-upnp", "device.create")
    @js.native
    def create(url: String): Device_ = js.native
  }
  
  object ssdp {
    
    /**
      * Create a Simple Service Discovery Protocol client
      */
    @JSImport("nat-upnp", "ssdp.create")
    @js.native
    def create(): Ssdp_ = js.native
  }
  
  object utils {
    
    @JSImport("nat-upnp", "utils.getNamespace")
    @js.native
    def getNamespace(data: _empty, uri: String): String = js.native
  }
  
  type CB[T] = js.Function2[/* err */ js.Error | Null, /* res */ js.UndefOr[T], Unit]
  
  @js.native
  trait Client extends StObject {
    
    /**
      * Close the underlaying sockets and resources
      */
    def close(): Unit = js.native
    
    /**
      * Fetch the external IP from the gateway
      * @param callback Callback to be run when completed, or on error
      */
    def externalIp(callback: CB[String]): Unit = js.native
    
    /**
      * Get the gateway device for communication
      * @param callback
      */
    def findGateway(callback: CB[Device_]): Unit = js.native
    
    /**
      * Get a list of existing mappings
      * @param callback Callback to be run when completed, or on error
      */
    def getMappings(callback: CB[js.Array[Mapping]]): Unit = js.native
    /**
      * Get a list of existing mappings
      * @param options Filter mappings based on these options
      * @param callback Callback to be run when completed, or on error
      */
    def getMappings(options: GetMappingOpts, callback: CB[js.Array[Mapping]]): Unit = js.native
    
    /**
      * Create a new port mapping
      * @param options Options for the new port mapping
      * @param [callback] Callback to be run when completed, or on error
      */
    def portMapping(options: NewPortMappingOpts): Unit = js.native
    def portMapping(options: NewPortMappingOpts, callback: CB[RawResponse]): Unit = js.native
    
    /**
      * Remove a port mapping
      * @param options Specify which port mapping to remove
      * @param [callback] Callback to be run when completed, or on error
      */
    def portUnmapping(options: DeletePortMappingOpts): Unit = js.native
    def portUnmapping(options: DeletePortMappingOpts, callback: CB[RawResponse]): Unit = js.native
  }
  
  type DeletePortMappingOpts = StandardOpts
  
  @js.native
  trait Device_ extends StObject {
    
    /**
      * Get the available services on the network device
      * @param types List of service types to lookf or
      * @param callback
      */
    def getService(types: js.Array[String], callback: CB[ControlURL]): Unit = js.native
    
    /**
      * Parse out available services
      * and devices from a root device
      * @param info
      * @returns the available devices and services in array form
      */
    def parseDescription(info: `0`): Devices = js.native
    
    /**
      * Perform a SSDP/UPNP request
      * @param action the action to perform
      * @param args arguments of said action
      * @param callback Callback to be run when completed, or on error
      */
    def run(action: String, args: js.Array[String], callback: CB[RawResponse]): Unit = js.native
  }
  object Device_ {
    
    @scala.inline
    def apply(
      getService: (js.Array[String], CB[ControlURL]) => Unit,
      parseDescription: `0` => Devices,
      run: (String, js.Array[String], CB[RawResponse]) => Unit
    ): Device_ = {
      val __obj = js.Dynamic.literal(getService = js.Any.fromFunction2(getService), parseDescription = js.Any.fromFunction1(parseDescription), run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[Device_]
    }
    
    @scala.inline
    implicit class Device_MutableBuilder[Self <: Device_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetService(value: (js.Array[String], CB[ControlURL]) => Unit): Self = StObject.set(x, "getService", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseDescription(value: `0` => Devices): Self = StObject.set(x, "parseDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRun(value: (String, js.Array[String], CB[RawResponse]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait GetMappingOpts extends StObject {
    
    var description: js.UndefOr[js.RegExp | String] = js.native
    
    var local: js.UndefOr[Boolean] = js.native
  }
  object GetMappingOpts {
    
    @scala.inline
    def apply(): GetMappingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMappingOpts]
    }
    
    @scala.inline
    implicit class GetMappingOptsMutableBuilder[Self <: GetMappingOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: js.RegExp | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionRegExp(value: js.RegExp): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    }
  }
  
  @js.native
  trait Mapping extends StObject {
    
    var description: String = js.native
    
    var enabled: Boolean = js.native
    
    var local: Boolean = js.native
    
    var `private`: Port = js.native
    
    var protocol: String = js.native
    
    var public: Port = js.native
    
    var ttl: Double = js.native
  }
  object Mapping {
    
    @scala.inline
    def apply(
      description: String,
      enabled: Boolean,
      local: Boolean,
      `private`: Port,
      protocol: String,
      public: Port,
      ttl: Double
    ): Mapping = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping]
    }
    
    @scala.inline
    implicit class MappingMutableBuilder[Self <: Mapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate(value: Port): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Port): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewPortMappingOpts extends StandardOpts {
    
    var description: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object NewPortMappingOpts {
    
    @scala.inline
    def apply(): NewPortMappingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewPortMappingOpts]
    }
    
    @scala.inline
    implicit class NewPortMappingOptsMutableBuilder[Self <: NewPortMappingOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait RawDevice extends StObject {
    
    var UDN: String = js.native
    
    var UPC: String = js.native
    
    var deviceList: js.UndefOr[Device] = js.native
    
    var deviceType: String = js.native
    
    var friendlyName: String = js.native
    
    var manufacturer: String = js.native
    
    var manufacturerURL: String = js.native
    
    var modelDescription: String = js.native
    
    var modelName: String = js.native
    
    var modelNumber: String = js.native
    
    var modelURL: String = js.native
    
    var presentationURL: String = js.native
    
    var serialNumber: String = js.native
    
    var serviceList: js.UndefOr[Service] = js.native
  }
  object RawDevice {
    
    @scala.inline
    def apply(
      UDN: String,
      UPC: String,
      deviceType: String,
      friendlyName: String,
      manufacturer: String,
      manufacturerURL: String,
      modelDescription: String,
      modelName: String,
      modelNumber: String,
      modelURL: String,
      presentationURL: String,
      serialNumber: String
    ): RawDevice = {
      val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], UPC = UPC.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], manufacturerURL = manufacturerURL.asInstanceOf[js.Any], modelDescription = modelDescription.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], modelURL = modelURL.asInstanceOf[js.Any], presentationURL = presentationURL.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawDevice]
    }
    
    @scala.inline
    implicit class RawDeviceMutableBuilder[Self <: RawDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceList(value: Device): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceListUndefined: Self = StObject.set(x, "deviceList", js.undefined)
      
      @scala.inline
      def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerURL(value: String): Self = StObject.set(x, "manufacturerURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelDescription(value: String): Self = StObject.set(x, "modelDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelNumber(value: String): Self = StObject.set(x, "modelNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelURL(value: String): Self = StObject.set(x, "modelURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentationURL(value: String): Self = StObject.set(x, "presentationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceList(value: Service): Self = StObject.set(x, "serviceList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceListUndefined: Self = StObject.set(x, "serviceList", js.undefined)
      
      @scala.inline
      def setUDN(value: String): Self = StObject.set(x, "UDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPC(value: String): Self = StObject.set(x, "UPC", value.asInstanceOf[js.Any])
    }
  }
  
  type RawResponse = Partial[Record[String, Dictkey]]
  
  @js.native
  trait RawService extends StObject {
    
    var SCPDURL: js.UndefOr[String] = js.native
    
    var controlURL: js.UndefOr[String] = js.native
    
    var eventSubURL: js.UndefOr[String] = js.native
    
    var serviceId: String = js.native
    
    var serviceType: String = js.native
  }
  object RawService {
    
    @scala.inline
    def apply(serviceId: String, serviceType: String): RawService = {
      val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawService]
    }
    
    @scala.inline
    implicit class RawServiceMutableBuilder[Self <: RawService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlURLUndefined: Self = StObject.set(x, "controlURL", js.undefined)
      
      @scala.inline
      def setEventSubURL(value: String): Self = StObject.set(x, "eventSubURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSubURLUndefined: Self = StObject.set(x, "eventSubURL", js.undefined)
      
      @scala.inline
      def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCPDURLUndefined: Self = StObject.set(x, "SCPDURL", js.undefined)
      
      @scala.inline
      def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ssdp_ extends EventEmitter {
    
    /**
      * Close all sockets
      */
    def close(): Unit = js.native
    
    /**
      * Search for a SSDP compatible server on the network
      * @param device Search Type (ST) header, specifying which device to search for
      * @param promise An existing EventEmitter to emit event on
      * @returns The event emitter provided in Promise, or a newly instantiated one.
      */
    def search(device: String): EventEmitter = js.native
    def search(device: String, promise: EventEmitter): EventEmitter = js.native
  }
  
  @js.native
  trait StandardOpts extends StObject {
    
    var `private`: js.UndefOr[Double | Null | Host] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var public: js.UndefOr[Double | Null | Host] = js.native
  }
  object StandardOpts {
    
    @scala.inline
    def apply(): StandardOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardOpts]
    }
    
    @scala.inline
    implicit class StandardOptsMutableBuilder[Self <: StandardOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: Double | Host): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateNull: Self = StObject.set(x, "private", null)
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setPublic(value: Double | Host): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicNull: Self = StObject.set(x, "public", null)
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
}
