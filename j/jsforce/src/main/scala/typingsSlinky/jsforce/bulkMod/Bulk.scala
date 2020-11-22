package typingsSlinky.jsforce.bulkMod

import typingsSlinky.jsforce.batchMod.Batch
import typingsSlinky.jsforce.batchMod.BatchResultInfo
import typingsSlinky.jsforce.connectionMod.Connection
import typingsSlinky.jsforce.jobMod.Job
import typingsSlinky.jsforce.recordMod.Record
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/bulk", "Bulk")
@js.native
class Bulk protected () extends js.Object {
  def this(connection: Connection) = this()
  
  def createJob(`type`: String, operation: String): Job = js.native
  def createJob(`type`: String, operation: String, options: BulkOptions): Job = js.native
  
  def job(id: String): Job = js.native
  
  def load(`type`: String, operation: BulkLoadOperation): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: js.UndefOr[scala.Nothing],
    input: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: js.UndefOr[scala.Nothing], input: String): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: js.UndefOr[scala.Nothing],
    input: String,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: js.UndefOr[scala.Nothing],
    input: js.Array[Record[_]]
  ): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: js.UndefOr[scala.Nothing],
    input: js.Array[Record[_]],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: js.UndefOr[scala.Nothing], input: Stream): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: js.UndefOr[scala.Nothing],
    input: Stream,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: String): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: String,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: js.Array[Record[_]]): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: js.Array[Record[_]],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: Stream): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: Stream,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  
  var pollInterval: Double = js.native
  
  var pollTimeout: Double = js.native
  
  def query(soql: String): js.Any = js.native
}
