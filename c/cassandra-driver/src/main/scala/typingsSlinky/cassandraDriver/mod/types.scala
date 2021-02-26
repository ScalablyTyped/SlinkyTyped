package typingsSlinky.cassandraDriver.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  @JSImport("cassandra-driver", "types.BigDecimal")
  @js.native
  class BigDecimal protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.BigDecimal {
    def this(unscaledValue: Double, scale: Double) = this()
  }
  object BigDecimal {
    
    /* static member */
    @JSImport("cassandra-driver", "types.BigDecimal.fromBuffer")
    @js.native
    def fromBuffer(buf: Buffer): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.BigDecimal.fromNumber")
    @js.native
    def fromNumber(value: Double): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.BigDecimal.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.BigDecimal = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.BigDecimal.toBuffer")
    @js.native
    def toBuffer(value: typingsSlinky.cassandraDriver.typesMod.types.BigDecimal): Buffer = js.native
  }
  
  @JSImport("cassandra-driver", "types.Duration")
  @js.native
  class Duration protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.Duration {
    def this(month: Double, days: Double, nanoseconds: Double) = this()
    def this(month: Double, days: Double, nanoseconds: typingsSlinky.cassandraDriver.typesMod.types.Long) = this()
  }
  object Duration {
    
    /* static member */
    @JSImport("cassandra-driver", "types.Duration.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.typesMod.types.Duration = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Duration.fromString")
    @js.native
    def fromString(input: String): typingsSlinky.cassandraDriver.typesMod.types.Duration = js.native
  }
  
  @JSImport("cassandra-driver", "types.InetAddress")
  @js.native
  class InetAddress protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.InetAddress {
    def this(buffer: Buffer) = this()
  }
  object InetAddress {
    
    /* static member */
    @JSImport("cassandra-driver", "types.InetAddress.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.InetAddress = js.native
  }
  
  @JSImport("cassandra-driver", "types.Integer")
  @js.native
  class Integer protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.Integer {
    def this(bits: js.Array[Double], sign: Double) = this()
  }
  object Integer {
    
    @JSImport("cassandra-driver", "types.Integer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ONE")
    @js.native
    def ONE: typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    @scala.inline
    def ONE_=(x: typingsSlinky.cassandraDriver.typesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ZERO")
    @js.native
    def ZERO: typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    @scala.inline
    def ZERO_=(x: typingsSlinky.cassandraDriver.typesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.fromBits")
    @js.native
    def fromBits(bits: js.Array[Double]): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.fromBuffer")
    @js.native
    def fromBuffer(bits: Buffer): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.fromInt")
    @js.native
    def fromInt(value: Double): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.fromNumber")
    @js.native
    def fromNumber(value: Double): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.fromString")
    @js.native
    def fromString(str: String): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    @JSImport("cassandra-driver", "types.Integer.fromString")
    @js.native
    def fromString(str: String, opt_radix: Double): typingsSlinky.cassandraDriver.typesMod.types.Integer = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.toBuffer")
    @js.native
    def toBuffer(value: typingsSlinky.cassandraDriver.typesMod.types.Integer): Buffer = js.native
  }
  
  @JSImport("cassandra-driver", "types.LocalDate")
  @js.native
  class LocalDate protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.LocalDate {
    def this(year: Double, month: Double, day: Double) = this()
  }
  object LocalDate {
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalDate.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalDate.fromDate")
    @js.native
    def fromDate(date: js.Date): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalDate.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalDate.now")
    @js.native
    def now(): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalDate.utcNow")
    @js.native
    def utcNow(): typingsSlinky.cassandraDriver.typesMod.types.LocalDate = js.native
  }
  
  @JSImport("cassandra-driver", "types.LocalTime")
  @js.native
  class LocalTime protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.LocalTime {
    def this(totalNanoseconds: typingsSlinky.cassandraDriver.typesMod.types.Long) = this()
  }
  object LocalTime {
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalTime.fromBuffer")
    @js.native
    def fromBuffer(value: Buffer): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalTime.fromDate")
    @js.native
    def fromDate(date: js.Date, nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalTime.fromMilliseconds")
    @js.native
    def fromMilliseconds(milliseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    @JSImport("cassandra-driver", "types.LocalTime.fromMilliseconds")
    @js.native
    def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalTime.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.LocalTime.now")
    @js.native
    def now(): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
    @JSImport("cassandra-driver", "types.LocalTime.now")
    @js.native
    def now(nanoseconds: Double): typingsSlinky.cassandraDriver.typesMod.types.LocalTime = js.native
  }
  
  @JSImport("cassandra-driver", "types.Long")
  @js.native
  class Long ()
    extends typingsSlinky.cassandraDriver.typesMod.types.Long
  
  @JSImport("cassandra-driver", "types.TimeUuid")
  @js.native
  class TimeUuid protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.TimeUuid {
    def this(buffer: Buffer) = this()
  }
  object TimeUuid {
    
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: js.UndefOr[scala.Nothing],
      nodeId: js.UndefOr[scala.Nothing],
      clockId: String
    ): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: js.UndefOr[scala.Nothing],
      nodeId: js.UndefOr[scala.Nothing],
      clockId: Buffer
    ): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.fromDate")
    @js.native
    def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.max")
    @js.native
    def max(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.min")
    @js.native
    def min(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]): Unit = js.native
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: String, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    /* static member */
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: String, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: Buffer, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(nodeId: Buffer, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
    @JSImport("cassandra-driver", "types.TimeUuid.now")
    @js.native
    def now(
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = js.native
  }
  
  @JSImport("cassandra-driver", "types.Tuple")
  @js.native
  class Tuple protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.Tuple {
    def this(args: js.Any*) = this()
  }
  object Tuple {
    
    /* static member */
    @JSImport("cassandra-driver", "types.Tuple.fromArray")
    @js.native
    def fromArray(elements: js.Array[_]): typingsSlinky.cassandraDriver.typesMod.types.Tuple = js.native
  }
  
  @JSImport("cassandra-driver", "types.Uuid")
  @js.native
  class Uuid protected ()
    extends typingsSlinky.cassandraDriver.typesMod.types.Uuid {
    def this(buffer: Buffer) = this()
  }
  object Uuid {
    
    /* static member */
    @JSImport("cassandra-driver", "types.Uuid.fromString")
    @js.native
    def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.Uuid = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Uuid.random")
    @js.native
    def random(): typingsSlinky.cassandraDriver.typesMod.types.Uuid = js.native
    /* static member */
    @JSImport("cassandra-driver", "types.Uuid.random")
    @js.native
    def random(callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.Uuid]): Unit = js.native
  }
  
  @JSImport("cassandra-driver", "types.consistencies")
  @js.native
  object consistencies extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cassandraDriver.typesMod.types.consistencies with Double] = js.native
    
    /* 0x05 */ val all: typingsSlinky.cassandraDriver.typesMod.types.consistencies.all with Double = js.native
    
    /* 0x00 */ val any: typingsSlinky.cassandraDriver.typesMod.types.consistencies.any with Double = js.native
    
    /* 0x07 */ val eachQuorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.eachQuorum with Double = js.native
    
    /* 0x0a */ val localOne: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localOne with Double = js.native
    
    /* 0x06 */ val localQuorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localQuorum with Double = js.native
    
    /* 0x09 */ val localSerial: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localSerial with Double = js.native
    
    /* 0x01 */ val one: typingsSlinky.cassandraDriver.typesMod.types.consistencies.one with Double = js.native
    
    /* 0x04 */ val quorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.quorum with Double = js.native
    
    /* 0x08 */ val serial: typingsSlinky.cassandraDriver.typesMod.types.consistencies.serial with Double = js.native
    
    /* 0x03 */ val three: typingsSlinky.cassandraDriver.typesMod.types.consistencies.three with Double = js.native
    
    /* 0x02 */ val two: typingsSlinky.cassandraDriver.typesMod.types.consistencies.two with Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.dataTypes")
  @js.native
  object dataTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cassandraDriver.typesMod.types.dataTypes with Double] = js.native
    
    /* 0x0001 */ val ascii: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.ascii with Double = js.native
    
    /* 0x0002 */ val bigint: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.bigint with Double = js.native
    
    /* 0x0003 */ val blob: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.blob with Double = js.native
    
    /* 0x0004 */ val boolean: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.boolean with Double = js.native
    
    /* 0x0005 */ val counter: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.counter with Double = js.native
    
    /* 0x0000 */ val custom: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.custom with Double = js.native
    
    /* 0x0011 */ val date: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.date with Double = js.native
    
    /* 0x0006 */ val decimal: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.decimal with Double = js.native
    
    /* 0x0007 */ val double: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.double with Double = js.native
    
    /* 0x0015 */ val duration: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.duration with Double = js.native
    
    /* 0x0008 */ val float: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.float with Double = js.native
    
    /* 0x0010 */ val inet: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.inet with Double = js.native
    
    /* 0x0009 */ val int: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.int with Double = js.native
    
    /* 0x0020 */ val list: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.list with Double = js.native
    
    /* 0x0021 */ val map: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.map with Double = js.native
    
    /* 0x0022 */ val set: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.set with Double = js.native
    
    /* 0x0013 */ val smallint: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.smallint with Double = js.native
    
    /* 0x000a */ val text: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.text with Double = js.native
    
    /* 0x0012 */ val time: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.time with Double = js.native
    
    /* 0x000b */ val timestamp: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.timestamp with Double = js.native
    
    /* 0x000f */ val timeuuid: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.timeuuid with Double = js.native
    
    /* 0x0014 */ val tinyint: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.tinyint with Double = js.native
    
    /* 0x0031 */ val tuple: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.tuple with Double = js.native
    
    /* 0x0030 */ val udt: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.udt with Double = js.native
    
    /* 0x000c */ val uuid: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.uuid with Double = js.native
    
    /* 0x000d */ val varchar: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.varchar with Double = js.native
    
    /* 0x000e */ val varint: typingsSlinky.cassandraDriver.typesMod.types.dataTypes.varint with Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.distance")
  @js.native
  object distance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cassandraDriver.typesMod.types.distance with Double] = js.native
    
    /* 1 */ val ignored: typingsSlinky.cassandraDriver.typesMod.types.distance.ignored with Double = js.native
    
    /* 0 */ val local: typingsSlinky.cassandraDriver.typesMod.types.distance.local with Double = js.native
    
    /* 0 */ val remote: typingsSlinky.cassandraDriver.typesMod.types.distance.remote with Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.protocolVersion")
  @js.native
  object protocolVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cassandraDriver.typesMod.types.protocolVersion with Double] = js.native
    
    /* 0x41 */ val dseV1: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.dseV1 with Double = js.native
    
    /* 0x42 */ val dseV2: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.dseV2 with Double = js.native
    
    def isSupported(version: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion): Boolean = js.native
    
    /* 0x42 */ val maxSupported: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.maxSupported with Double = js.native
    
    /* 0x01 */ val minSupported: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.minSupported with Double = js.native
    
    /* 0x01 */ val v1: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.v1 with Double = js.native
    
    /* 0x02 */ val v2: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.v2 with Double = js.native
    
    /* 0x03 */ val v3: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.v3 with Double = js.native
    
    /* 0x04 */ val v4: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.v4 with Double = js.native
    
    /* 0x05 */ val v5: typingsSlinky.cassandraDriver.typesMod.types.protocolVersion.v5 with Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.responseErrorCodes")
  @js.native
  object responseErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes with Double] = js.native
    
    /* 0x2400 */ val alreadyExists: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.alreadyExists with Double = js.native
    
    /* 0x0100 */ val badCredentials: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.badCredentials with Double = js.native
    
    /* 0x8000 */ val clientWriteFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.clientWriteFailure with Double = js.native
    
    /* 0x2300 */ val configError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.configError with Double = js.native
    
    /* 0x1400 */ val functionFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.functionFailure with Double = js.native
    
    /* 0x2200 */ val invalid: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.invalid with Double = js.native
    
    /* 0x1002 */ val isBootstrapping: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.isBootstrapping with Double = js.native
    
    /* 0x1001 */ val overloaded: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.overloaded with Double = js.native
    
    /* 0x000A */ val protocolError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.protocolError with Double = js.native
    
    /* 0x1300 */ val readFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.readFailure with Double = js.native
    
    /* 0x1200 */ val readTimeout: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.readTimeout with Double = js.native
    
    /* 0x0000 */ val serverError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.serverError with Double = js.native
    
    /* 0x2000 */ val syntaxError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.syntaxError with Double = js.native
    
    /* 0x1003 */ val truncateError: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.truncateError with Double = js.native
    
    /* 0x2100 */ val unauthorized: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unauthorized with Double = js.native
    
    /* 0x1000 */ val unavailableException: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unavailableException with Double = js.native
    
    /* 0x2500 */ val unprepared: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.unprepared with Double = js.native
    
    /* 0x1500 */ val writeFailure: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.writeFailure with Double = js.native
    
    /* 0x1100 */ val writeTimeout: typingsSlinky.cassandraDriver.typesMod.types.responseErrorCodes.writeTimeout with Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.unset")
  @js.native
  val unset: js.Object = js.native
}
