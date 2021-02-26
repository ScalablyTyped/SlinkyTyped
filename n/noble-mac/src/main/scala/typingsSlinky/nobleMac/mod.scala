package typingsSlinky.nobleMac

import typingsSlinky.nobleMac.anon.Data
import typingsSlinky.nobleMac.nobleMacStrings.broadcast
import typingsSlinky.nobleMac.nobleMacStrings.characteristicsDiscover
import typingsSlinky.nobleMac.nobleMacStrings.connect
import typingsSlinky.nobleMac.nobleMacStrings.connected
import typingsSlinky.nobleMac.nobleMacStrings.connecting
import typingsSlinky.nobleMac.nobleMacStrings.descriptorsDiscover
import typingsSlinky.nobleMac.nobleMacStrings.disconnect
import typingsSlinky.nobleMac.nobleMacStrings.disconnected
import typingsSlinky.nobleMac.nobleMacStrings.disconnecting
import typingsSlinky.nobleMac.nobleMacStrings.discover
import typingsSlinky.nobleMac.nobleMacStrings.error
import typingsSlinky.nobleMac.nobleMacStrings.includedServicesDiscover
import typingsSlinky.nobleMac.nobleMacStrings.notify
import typingsSlinky.nobleMac.nobleMacStrings.read
import typingsSlinky.nobleMac.nobleMacStrings.rssiUpdate
import typingsSlinky.nobleMac.nobleMacStrings.scanStart
import typingsSlinky.nobleMac.nobleMacStrings.scanStop
import typingsSlinky.nobleMac.nobleMacStrings.servicesDiscover
import typingsSlinky.nobleMac.nobleMacStrings.stateChange
import typingsSlinky.nobleMac.nobleMacStrings.valueRead
import typingsSlinky.nobleMac.nobleMacStrings.valueWrite
import typingsSlinky.nobleMac.nobleMacStrings.write
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("noble-mac", "Characteristic")
  @js.native
  class Characteristic () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def broadcast(broadcast: Boolean): Unit = js.native
    def broadcast(broadcast: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var descriptors: js.Array[Descriptor] = js.native
    
    def discoverDescriptors(): Unit = js.native
    def discoverDescriptors(callback: js.Function2[/* error */ String, /* descriptors */ js.Array[Descriptor], Unit]): Unit = js.native
    
    var name: String = js.native
    
    def notify(notify: Boolean): Unit = js.native
    def notify(notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, option: Boolean, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_broadcast(event: broadcast, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_descriptorsDiscover(event: descriptorsDiscover, listener: js.Function1[/* descriptors */ js.Array[Descriptor], Unit]): this.type = js.native
    @JSName("on")
    def on_notify(event: notify, listener: js.Function1[/* state */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_read(event: read, listener: js.Function2[/* data */ Buffer, /* isNotification */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_write(event: write, withoutResponse: Boolean, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    var properties: js.Array[String] = js.native
    
    def read(): Unit = js.native
    def read(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    def unsubscribe(): Unit = js.native
    def unsubscribe(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var uuid: String = js.native
    
    def write(data: Buffer, notify: Boolean): Unit = js.native
    def write(data: Buffer, notify: Boolean, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble-mac", "Descriptor")
  @js.native
  class Descriptor () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_valueRead(event: valueRead, listener: js.Function2[/* error */ String, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_valueWrite(event: valueWrite, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    
    def readValue(): Unit = js.native
    def readValue(callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
    
    def writeValue(data: Buffer): Unit = js.native
    def writeValue(data: Buffer, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
  
  @JSImport("noble-mac", "Peripheral")
  @js.native
  class Peripheral () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var address: String = js.native
    
    var addressType: String = js.native
    
    var advertisement: Advertisement = js.native
    
    def connect(): Unit = js.native
    def connect(callback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    var connectable: Boolean = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    def discoverAllServicesAndCharacteristics(): Unit = js.native
    def discoverAllServicesAndCharacteristics(
      callback: js.Function3[
          /* error */ String, 
          /* services */ js.Array[Service], 
          /* characteristics */ js.Array[Characteristic], 
          Unit
        ]
    ): Unit = js.native
    
    def discoverServices(serviceUUIDs: js.Array[String]): Unit = js.native
    def discoverServices(
      serviceUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* services */ js.Array[Service], Unit]
    ): Unit = js.native
    
    def discoverSomeServicesAndCharacteristics(serviceUUIDs: js.Array[String], characteristicUUIDs: js.Array[String]): Unit = js.native
    def discoverSomeServicesAndCharacteristics(
      serviceUUIDs: js.Array[String],
      characteristicUUIDs: js.Array[String],
      callback: js.Function3[
          /* error */ String, 
          /* services */ js.Array[Service], 
          /* characteristics */ js.Array[Characteristic], 
          Unit
        ]
    ): Unit = js.native
    
    var id: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* error */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_rssiUpdate(event: rssiUpdate, listener: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_servicesDiscover(event: servicesDiscover, listener: js.Function1[/* services */ js.Array[Service], Unit]): this.type = js.native
    
    def readHandle(handle: Buffer, callback: js.Function2[/* error */ String, /* data */ Buffer, Unit]): Unit = js.native
    
    var rssi: Double = js.native
    
    var services: js.Array[Service] = js.native
    
    var state: error | connecting | connected | disconnecting | disconnected = js.native
    
    def updateRssi(): Unit = js.native
    def updateRssi(callback: js.Function2[/* error */ String, /* rssi */ Double, Unit]): Unit = js.native
    
    var uuid: String = js.native
    
    def writeHandle(
      handle: Buffer,
      data: Buffer,
      withoutResponse: Boolean,
      callback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
  }
  
  @JSImport("noble-mac", "Service")
  @js.native
  class Service () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var characteristics: js.Array[Characteristic] = js.native
    
    def discoverCharacteristics(characteristicUUIDs: js.Array[String]): Unit = js.native
    def discoverCharacteristics(
      characteristicUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* characteristics */ js.Array[Characteristic], Unit]
    ): Unit = js.native
    
    def discoverIncludedServices(serviceUUIDs: js.Array[String]): Unit = js.native
    def discoverIncludedServices(
      serviceUUIDs: js.Array[String],
      callback: js.Function2[/* error */ String, /* includedServiceUuids */ js.Array[String], Unit]
    ): Unit = js.native
    
    var includedServiceUuids: js.Array[String] = js.native
    
    var name: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_characteristicsDiscover(
      event: characteristicsDiscover,
      listener: js.Function1[/* characteristics */ js.Array[Characteristic], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_includedServicesDiscover(
      event: includedServicesDiscover,
      listener: js.Function1[/* includedServiceUuids */ js.Array[String], Unit]
    ): this.type = js.native
    
    var `type`: String = js.native
    
    var uuid: String = js.native
  }
  
  @JSImport("noble-mac", "on")
  @js.native
  def on(event: String, listener: js.Function): EventEmitter = js.native
  @JSImport("noble-mac", "on")
  @js.native
  def on_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "on")
  @js.native
  def on_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "on")
  @js.native
  def on_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "on")
  @js.native
  def on_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  
  @JSImport("noble-mac", "removeAllListeners")
  @js.native
  def removeAllListeners(): EventEmitter = js.native
  @JSImport("noble-mac", "removeAllListeners")
  @js.native
  def removeAllListeners(event: String): EventEmitter = js.native
  
  @JSImport("noble-mac", "removeListener")
  @js.native
  def removeListener(event: String, listener: js.Function): EventEmitter = js.native
  @JSImport("noble-mac", "removeListener")
  @js.native
  def removeListener_discover(event: discover, listener: js.Function1[/* peripheral */ Peripheral, Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "removeListener")
  @js.native
  def removeListener_scanStart(event: scanStart, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "removeListener")
  @js.native
  def removeListener_scanStop(event: scanStop, listener: js.Function0[Unit]): EventEmitter = js.native
  @JSImport("noble-mac", "removeListener")
  @js.native
  def removeListener_stateChange(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
  
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(): Unit = js.native
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String]): Unit = js.native
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = js.native
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  @JSImport("noble-mac", "startScanning")
  @js.native
  def startScanning(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  @JSImport("noble-mac", "state")
  @js.native
  val state: String = js.native
  
  @JSImport("noble-mac", "stopScanning")
  @js.native
  def stopScanning(): Unit = js.native
  @JSImport("noble-mac", "stopScanning")
  @js.native
  def stopScanning(callback: js.Function0[Unit]): Unit = js.native
  
  @js.native
  trait Advertisement extends StObject {
    
    var localName: String = js.native
    
    var manufacturerData: Buffer = js.native
    
    var serviceData: Data = js.native
    
    var serviceUuids: js.Array[String] = js.native
    
    var txPowerLevel: Double = js.native
  }
  object Advertisement {
    
    @scala.inline
    def apply(
      localName: String,
      manufacturerData: Buffer,
      serviceData: Data,
      serviceUuids: js.Array[String],
      txPowerLevel: Double
    ): Advertisement = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any], txPowerLevel = txPowerLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advertisement]
    }
    
    @scala.inline
    implicit class AdvertisementMutableBuilder[Self <: Advertisement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManufacturerData(value: Buffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceData(value: Data): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
      
      @scala.inline
      def setTxPowerLevel(value: Double): Self = StObject.set(x, "txPowerLevel", value.asInstanceOf[js.Any])
    }
  }
}
