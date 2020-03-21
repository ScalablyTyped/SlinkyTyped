package typingsSlinky.cassandraDriver.mod.types

import typingsSlinky.cassandraDriver.mod.ValueCallback
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
class TimeUuid ()
  extends typingsSlinky.cassandraDriver.typesMod.types.TimeUuid

/* static members */
@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  def fromDate(date: js.Date): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromString(value: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def max(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def min(date: js.Date, ticks: Double): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]): Unit = js.native
  def now(nodeId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: String, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: String, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): typingsSlinky.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typingsSlinky.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
}

