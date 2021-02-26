package typingsSlinky.natUpnp

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.natUpnp.mod.RawDevice
import typingsSlinky.natUpnp.mod.RawService
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var device: js.UndefOr[RawDevice] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: RawDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    }
  }
  
  @js.native
  trait ControlURL extends StObject {
    
    var SCPDURL: String = js.native
    
    var controlURL: String = js.native
    
    var service: String = js.native
  }
  object ControlURL {
    
    @scala.inline
    def apply(SCPDURL: String, controlURL: String, service: String): ControlURL = {
      val __obj = js.Dynamic.literal(SCPDURL = SCPDURL.asInstanceOf[js.Any], controlURL = controlURL.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlURL]
    }
    
    @scala.inline
    implicit class ControlURLMutableBuilder[Self <: ControlURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlURL(value: String): Self = StObject.set(x, "controlURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCPDURL(value: String): Self = StObject.set(x, "SCPDURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Device extends StObject {
    
    var device: RawDevice | js.Array[RawDevice] = js.native
  }
  object Device {
    
    @scala.inline
    def apply(device: RawDevice | js.Array[RawDevice]): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: RawDevice | js.Array[RawDevice]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceVarargs(value: RawDevice*): Self = StObject.set(x, "device", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Devices extends StObject {
    
    var devices: js.Array[RawDevice] = js.native
    
    var services: js.Array[RawService] = js.native
  }
  object Devices {
    
    @scala.inline
    def apply(devices: js.Array[RawDevice], services: js.Array[RawService]): Devices = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[Devices]
    }
    
    @scala.inline
    implicit class DevicesMutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevices(value: js.Array[RawDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicesVarargs(value: RawDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
      
      @scala.inline
      def setServices(value: js.Array[RawService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: RawService*): Self = StObject.set(x, "services", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var `@`: Xmlnsu = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(`@`: Xmlnsu): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@")(`@`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@`(value: Xmlnsu): Self = StObject.set(x, "@", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object Port {
    
    @scala.inline
    def apply(host: String, port: Double): Port = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Service extends StObject {
    
    var service: RawService | js.Array[RawService] = js.native
  }
  object Service {
    
    @scala.inline
    def apply(service: RawService | js.Array[RawService]): Service = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: RawService | js.Array[RawService]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceVarargs(value: RawService*): Self = StObject.set(x, "service", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Xmlnsu extends StObject {
    
    @JSName("xmlns:u")
    var xmlnsColonu: String = js.native
  }
  object Xmlnsu {
    
    @scala.inline
    def apply(xmlnsColonu: String): Xmlnsu = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("xmlns:u")(xmlnsColonu.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xmlnsu]
    }
    
    @scala.inline
    implicit class XmlnsuMutableBuilder[Self <: Xmlnsu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmlnsColonu(value: String): Self = StObject.set(x, "xmlns:u", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    var `@`: js.UndefOr[Record[String, String]] = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@`(value: Record[String, String]): Self = StObject.set(x, "@", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@Undefined`: Self = StObject.set(x, "@", js.undefined)
    }
  }
}
