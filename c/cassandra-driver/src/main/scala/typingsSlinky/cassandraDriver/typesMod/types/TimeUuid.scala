package typingsSlinky.cassandraDriver.typesMod.types

import typingsSlinky.cassandraDriver.anon.Date
import typingsSlinky.cassandraDriver.mod.ValueCallback
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
class TimeUuid protected () extends Uuid {
  def this(buffer: Buffer) = this()
  
  def getDate(): js.Date = js.native
  
  def getDatePrecision(): Date = js.native
}
object TimeUuid {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(
    date: js.Date,
    ticks: js.UndefOr[scala.Nothing],
    nodeId: js.UndefOr[scala.Nothing],
    clockId: String
  ): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(
    date: js.Date,
    ticks: js.UndefOr[scala.Nothing],
    nodeId: js.UndefOr[scala.Nothing],
    clockId: Buffer
  ): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: String, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: js.UndefOr[scala.Nothing], nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: js.UndefOr[scala.Nothing], clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = js.native
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromDate")
  @js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.fromString")
  @js.native
  def fromString(value: String): TimeUuid = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.max")
  @js.native
  def max(date: js.Date, ticks: Double): TimeUuid = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.min")
  @js.native
  def min(date: js.Date, ticks: Double): TimeUuid = js.native
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(): TimeUuid = js.native
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(callback: ValueCallback[TimeUuid]): Unit = js.native
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: String, clockId: String): TimeUuid = js.native
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: String, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: Buffer, clockId: String): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid.now")
  @js.native
  def now(nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
}
