package typingsSlinky.bleno

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.bleno.anon.TypeofCharacteristic
import typingsSlinky.bleno.blenoStrings.accept
import typingsSlinky.bleno.blenoStrings.advertisingStart
import typingsSlinky.bleno.blenoStrings.advertisingStartError
import typingsSlinky.bleno.blenoStrings.advertisingStop
import typingsSlinky.bleno.blenoStrings.disconnect
import typingsSlinky.bleno.blenoStrings.mtuChange
import typingsSlinky.bleno.blenoStrings.rssiUpdate
import typingsSlinky.bleno.blenoStrings.servicesSet
import typingsSlinky.bleno.blenoStrings.servicesSetError
import typingsSlinky.bleno.blenoStrings.stateChange
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bleno", JSImport.Namespace)
  @js.native
  val ^ : Bleno = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Characteristic")
  @js.native
  class CharacteristicCls protected () extends Characteristic {
    def this(options: CharacteristicOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "Descriptor")
  @js.native
  class DescriptorCls protected () extends Descriptor {
    def this(options: DescriptorOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bleno", "PrimaryService")
  @js.native
  class PrimaryServiceCls protected () extends PrimaryService {
    def this(options: PrimaryServiceOptions) = this()
  }
  
  @js.native
  trait Bleno extends EventEmitter {
    
    val Characteristic: TypeofCharacteristic with (Instantiable1[/* options */ CharacteristicOptions, typingsSlinky.bleno.mod.Characteristic]) = js.native
    
    val Descriptor: Instantiable1[/* options */ DescriptorOptions, typingsSlinky.bleno.mod.Descriptor] = js.native
    
    val PrimaryService: Instantiable1[/* options */ PrimaryServiceOptions, typingsSlinky.bleno.mod.PrimaryService] = js.native
    
    val address: String = js.native
    
    def disconnect(): Unit = js.native
    
    val mtu: Double = js.native
    
    @JSName("on")
    def on_accept(event: accept, cb: js.Function1[/* address */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStart(event: advertisingStart, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStartError(event: advertisingStartError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_advertisingStop(event: advertisingStop, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function1[/* clientAddress */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_mtuChange(event: mtuChange, cb: js.Function1[/* mtu */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_rssiUpdate(event: rssiUpdate, cb: js.Function1[/* rssi */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSet(event: servicesSet, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): this.type = js.native
    @JSName("on")
    def on_servicesSetError(event: servicesSetError, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_stateChange(event: stateChange, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    val platform: String = js.native
    
    val rssi: Double = js.native
    
    def setServices(services: js.Array[typingsSlinky.bleno.mod.PrimaryService]): Unit = js.native
    def setServices(
      services: js.Array[typingsSlinky.bleno.mod.PrimaryService],
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertising(name: String): Unit = js.native
    def startAdvertising(
      name: String,
      serviceUuids: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def startAdvertising(name: String, serviceUuids: js.Array[String]): Unit = js.native
    def startAdvertising(
      name: String,
      serviceUuids: js.Array[String],
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertisingIBeacon(uuid: String, major: Double, minor: Double, measuredPower: Double): Unit = js.native
    def startAdvertisingIBeacon(
      uuid: String,
      major: Double,
      minor: Double,
      measuredPower: Double,
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def startAdvertisingWithEIRData(advertisementData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def startAdvertisingWithEIRData(advertisementData: Buffer, scanData: Buffer): Unit = js.native
    def startAdvertisingWithEIRData(
      advertisementData: Buffer,
      scanData: Buffer,
      callback: js.Function1[/* arg */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    val state: State = js.native
    
    def stopAdvertising(): Unit = js.native
    def stopAdvertising(callback: js.Function0[Unit]): Unit = js.native
    
    def updateRssi(): Unit = js.native
    def updateRssi(callback: js.Function2[/* err */ Null, /* rssi */ Double, Unit]): Unit = js.native
  }
  
  @js.native
  trait Characteristic extends StObject {
    
    val RESULT_ATTR_NOT_LONG: Double = js.native
    
    val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
    
    val RESULT_INVALID_OFFSET: Double = js.native
    
    val RESULT_SUCCESS: Double = js.native
    
    val RESULT_UNLIKELY_ERROR: Double = js.native
    
    var descriptors: js.Array[Descriptor] = js.native
    
    def onIndicate(): Unit = js.native
    
    def onNotify(): Unit = js.native
    
    def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit = js.native
    
    def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit = js.native
    
    def onUnsubscribe(): Unit = js.native
    
    def onWriteRequest(
      data: Buffer,
      offset: Double,
      withoutResponse: Boolean,
      callback: js.Function1[/* result */ Double, Unit]
    ): Unit = js.native
    
    var properties: js.Array[Property] = js.native
    
    var secure: js.Array[Property] = js.native
    
    var uuid: String = js.native
    
    var value: Buffer | Null = js.native
  }
  object Characteristic {
    
    @scala.inline
    def apply(
      RESULT_ATTR_NOT_LONG: Double,
      RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
      RESULT_INVALID_OFFSET: Double,
      RESULT_SUCCESS: Double,
      RESULT_UNLIKELY_ERROR: Double,
      descriptors: js.Array[Descriptor],
      onIndicate: () => Unit,
      onNotify: () => Unit,
      onReadRequest: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit,
      onSubscribe: (Double, js.Any) => Unit,
      onUnsubscribe: () => Unit,
      onWriteRequest: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit,
      properties: js.Array[Property],
      secure: js.Array[Property],
      uuid: String
    ): Characteristic = {
      val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Characteristic]
    }
    
    @scala.inline
    implicit class CharacteristicMutableBuilder[Self <: Characteristic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      @scala.inline
      def setOnIndicate(value: () => Unit): Self = StObject.set(x, "onIndicate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNotify(value: () => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadRequest(value: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubscribe(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUnsubscribe(value: () => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnWriteRequest(value: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4(value))
      
      @scala.inline
      def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setRESULT_ATTR_NOT_LONG(value: Double): Self = StObject.set(x, "RESULT_ATTR_NOT_LONG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = StObject.set(x, "RESULT_INVALID_ATTRIBUTE_LENGTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_INVALID_OFFSET(value: Double): Self = StObject.set(x, "RESULT_INVALID_OFFSET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_SUCCESS(value: Double): Self = StObject.set(x, "RESULT_SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESULT_UNLIKELY_ERROR(value: Double): Self = StObject.set(x, "RESULT_UNLIKELY_ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  @js.native
  trait CharacteristicOptions extends StObject {
    
    var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.native
    
    var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onReadRequest: js.UndefOr[
        (js.Function2[
          /* offset */ Double, 
          /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
          Unit
        ]) | Null
      ] = js.native
    
    var onSubscribe: js.UndefOr[
        (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
      ] = js.native
    
    var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var onWriteRequest: js.UndefOr[
        (js.Function4[
          /* data */ Buffer, 
          /* offset */ Double, 
          /* withoutResponse */ Boolean, 
          /* callback */ js.Function1[/* result */ Double, Unit], 
          Unit
        ]) | Null
      ] = js.native
    
    var properties: js.UndefOr[js.Array[Property] | Null] = js.native
    
    var secure: js.UndefOr[js.Array[Property] | Null] = js.native
    
    var uuid: String = js.native
    
    var value: js.UndefOr[Buffer | Null] = js.native
  }
  object CharacteristicOptions {
    
    @scala.inline
    def apply(uuid: String): CharacteristicOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharacteristicOptions]
    }
    
    @scala.inline
    implicit class CharacteristicOptionsMutableBuilder[Self <: CharacteristicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: js.Array[Descriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptorsNull: Self = StObject.set(x, "descriptors", null)
      
      @scala.inline
      def setDescriptorsUndefined: Self = StObject.set(x, "descriptors", js.undefined)
      
      @scala.inline
      def setDescriptorsVarargs(value: Descriptor*): Self = StObject.set(x, "descriptors", js.Array(value :_*))
      
      @scala.inline
      def setOnIndicate(value: () => Unit): Self = StObject.set(x, "onIndicate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnIndicateNull: Self = StObject.set(x, "onIndicate", null)
      
      @scala.inline
      def setOnIndicateUndefined: Self = StObject.set(x, "onIndicate", js.undefined)
      
      @scala.inline
      def setOnNotify(value: () => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNotifyNull: Self = StObject.set(x, "onNotify", null)
      
      @scala.inline
      def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      @scala.inline
      def setOnReadRequest(
        value: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit
      ): Self = StObject.set(x, "onReadRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReadRequestNull: Self = StObject.set(x, "onReadRequest", null)
      
      @scala.inline
      def setOnReadRequestUndefined: Self = StObject.set(x, "onReadRequest", js.undefined)
      
      @scala.inline
      def setOnSubscribe(value: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubscribeNull: Self = StObject.set(x, "onSubscribe", null)
      
      @scala.inline
      def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
      
      @scala.inline
      def setOnUnsubscribe(value: () => Unit): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnsubscribeNull: Self = StObject.set(x, "onUnsubscribe", null)
      
      @scala.inline
      def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      @scala.inline
      def setOnWriteRequest(
        value: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "onWriteRequest", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnWriteRequestNull: Self = StObject.set(x, "onWriteRequest", null)
      
      @scala.inline
      def setOnWriteRequestUndefined: Self = StObject.set(x, "onWriteRequest", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setSecure(value: js.Array[Property]): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureNull: Self = StObject.set(x, "secure", null)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSecureVarargs(value: Property*): Self = StObject.set(x, "secure", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Descriptor extends StObject {
    
    var uuid: String = js.native
    
    var value: Buffer = js.native
  }
  object Descriptor {
    
    @scala.inline
    def apply(uuid: String, value: Buffer): Descriptor = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    @scala.inline
    implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DescriptorOptions extends StObject {
    
    var uuid: String = js.native
    
    var value: js.UndefOr[Buffer | String | Null] = js.native
  }
  object DescriptorOptions {
    
    @scala.inline
    def apply(uuid: String): DescriptorOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptorOptions]
    }
    
    @scala.inline
    implicit class DescriptorOptionsMutableBuilder[Self <: DescriptorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryService extends StObject {
    
    var characteristics: js.Array[Characteristic] = js.native
    
    var uuid: String = js.native
  }
  object PrimaryService {
    
    @scala.inline
    def apply(characteristics: js.Array[Characteristic], uuid: String): PrimaryService = {
      val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryService]
    }
    
    @scala.inline
    implicit class PrimaryServiceMutableBuilder[Self <: PrimaryService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrimaryServiceOptions extends StObject {
    
    var characteristics: js.UndefOr[js.Array[Characteristic] | Null] = js.native
    
    var uuid: String = js.native
  }
  object PrimaryServiceOptions {
    
    @scala.inline
    def apply(uuid: String): PrimaryServiceOptions = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryServiceOptions]
    }
    
    @scala.inline
    implicit class PrimaryServiceOptionsMutableBuilder[Self <: PrimaryServiceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacteristicsNull: Self = StObject.set(x, "characteristics", null)
      
      @scala.inline
      def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
      
      @scala.inline
      def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bleno.blenoStrings.read
    - typingsSlinky.bleno.blenoStrings.write
    - typingsSlinky.bleno.blenoStrings.indicate
    - typingsSlinky.bleno.blenoStrings.notify
    - typingsSlinky.bleno.blenoStrings.writeWithoutResponse
  */
  trait Property extends StObject
  object Property {
    
    @scala.inline
    def indicate: typingsSlinky.bleno.blenoStrings.indicate = "indicate".asInstanceOf[typingsSlinky.bleno.blenoStrings.indicate]
    
    @scala.inline
    def read: typingsSlinky.bleno.blenoStrings.read = "read".asInstanceOf[typingsSlinky.bleno.blenoStrings.read]
    
    @scala.inline
    def write: typingsSlinky.bleno.blenoStrings.write = "write".asInstanceOf[typingsSlinky.bleno.blenoStrings.write]
    
    @scala.inline
    def writeWithoutResponse: typingsSlinky.bleno.blenoStrings.writeWithoutResponse = "writeWithoutResponse".asInstanceOf[typingsSlinky.bleno.blenoStrings.writeWithoutResponse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bleno.blenoStrings.poweredOn
    - typingsSlinky.bleno.blenoStrings.poweredOff
    - typingsSlinky.bleno.blenoStrings.unauthorized
    - typingsSlinky.bleno.blenoStrings.unsupported
    - typingsSlinky.bleno.blenoStrings.unknown
    - typingsSlinky.bleno.blenoStrings.resetting
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def poweredOff: typingsSlinky.bleno.blenoStrings.poweredOff = "poweredOff".asInstanceOf[typingsSlinky.bleno.blenoStrings.poweredOff]
    
    @scala.inline
    def poweredOn: typingsSlinky.bleno.blenoStrings.poweredOn = "poweredOn".asInstanceOf[typingsSlinky.bleno.blenoStrings.poweredOn]
    
    @scala.inline
    def resetting: typingsSlinky.bleno.blenoStrings.resetting = "resetting".asInstanceOf[typingsSlinky.bleno.blenoStrings.resetting]
    
    @scala.inline
    def unauthorized: typingsSlinky.bleno.blenoStrings.unauthorized = "unauthorized".asInstanceOf[typingsSlinky.bleno.blenoStrings.unauthorized]
    
    @scala.inline
    def unknown: typingsSlinky.bleno.blenoStrings.unknown = "unknown".asInstanceOf[typingsSlinky.bleno.blenoStrings.unknown]
    
    @scala.inline
    def unsupported: typingsSlinky.bleno.blenoStrings.unsupported = "unsupported".asInstanceOf[typingsSlinky.bleno.blenoStrings.unsupported]
  }
  
  type _To = Bleno
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bleno = ^
}
