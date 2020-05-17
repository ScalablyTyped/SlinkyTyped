package typingsSlinky.cassandraDriver.typesMod.types

import typingsSlinky.cassandraDriver.anon.Date
import typingsSlinky.cassandraDriver.mod.ValueCallback
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
class TimeUuid () extends Uuid {
  def getDate(): js.Date = js.native
  def getDatePrecision(): Date = js.native
}

/* static members */
@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  def fromDate(date: js.Date): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  def fromString(value: String): TimeUuid = js.native
  def max(date: js.Date, ticks: Double): TimeUuid = js.native
  def min(date: js.Date, ticks: Double): TimeUuid = js.native
  def now(): TimeUuid = js.native
  def now(callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: String): TimeUuid = js.native
  def now(nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: String, clockId: Buffer): TimeUuid = js.native
  def now(nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  def now(nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = js.native
}

