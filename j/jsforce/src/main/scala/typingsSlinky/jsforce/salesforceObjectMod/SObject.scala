package typingsSlinky.jsforce.salesforceObjectMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jsforce.anon.CallCallback
import typingsSlinky.jsforce.anon.CallCallbackClear
import typingsSlinky.jsforce.anon.CallClear
import typingsSlinky.jsforce.anon.CallLayoutNameCallback
import typingsSlinky.jsforce.anon.ExtIdField
import typingsSlinky.jsforce.batchMod.Batch
import typingsSlinky.jsforce.batchMod.BatchResultInfo
import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.connectionMod.RestApiOptions
import typingsSlinky.jsforce.describeResultMod.DescribeSObjectResult
import typingsSlinky.jsforce.queryMod.Query
import typingsSlinky.jsforce.quickActionMod.QuickActionInfo
import typingsSlinky.jsforce.recordMod.Record
import typingsSlinky.jsforce.recordMod.RecordReference
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.jsforce.salesforceIdMod.SalesforceId
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/salesforce-object", "SObject")
@js.native
class SObject[T] () extends js.Object {
  
  def approvalLayouts(): js.Promise[ApprovalLayoutInfo] = js.native
  def approvalLayouts(callback: Callback[ApprovalLayoutInfo]): js.Promise[ApprovalLayoutInfo] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  @JSName("approvalLayouts$")
  def approvalLayouts$(): ApprovalLayoutInfo = js.native
  @JSName("approvalLayouts$")
  def approvalLayouts$(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  @JSName("approvalLayouts$")
  var approvalLayouts$_Original: CallClear = js.native
  
  def bulkload(operation: String): Batch = js.native
  def bulkload(
    operation: String,
    options: js.UndefOr[scala.Nothing],
    input: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: String): Batch = js.native
  def bulkload(
    operation: String,
    options: js.UndefOr[scala.Nothing],
    input: String,
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: js.Array[Record[T]]): Batch = js.native
  def bulkload(
    operation: String,
    options: js.UndefOr[scala.Nothing],
    input: js.Array[Record[T]],
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: Stream): Batch = js.native
  def bulkload(
    operation: String,
    options: js.UndefOr[scala.Nothing],
    input: Stream,
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: ExtIdField): Batch = js.native
  def bulkload(
    operation: String,
    options: ExtIdField,
    input: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: ExtIdField, input: String): Batch = js.native
  def bulkload(operation: String, options: ExtIdField, input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def bulkload(operation: String, options: ExtIdField, input: js.Array[Record[T]]): Batch = js.native
  def bulkload(
    operation: String,
    options: ExtIdField,
    input: js.Array[Record[T]],
    callback: Callback[js.Array[RecordResult]]
  ): Batch = js.native
  def bulkload(operation: String, options: ExtIdField, input: Stream): Batch = js.native
  def bulkload(operation: String, options: ExtIdField, input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def compactLayouts(): js.Promise[CompactLayoutInfo] = js.native
  def compactLayouts(callback: Callback[CompactLayoutInfo]): js.Promise[CompactLayoutInfo] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
  @JSName("compactLayouts$")
  def compactLayouts$(): CompactLayoutInfo = js.native
  @JSName("compactLayouts$")
  def compactLayouts$(callback: Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
  @JSName("compactLayouts$")
  var compactLayouts$_Original: CallCallback = js.native
  
  def count(): Query[Double] = js.native
  def count(conditions: js.UndefOr[scala.Nothing], callback: Callback[Double]): Query[Double] = js.native
  def count(conditions: String): Query[Double] = js.native
  def count(conditions: String, callback: Callback[Double]): Query[Double] = js.native
  def count(conditions: js.Object): Query[Double] = js.native
  def count(conditions: js.Object, callback: Callback[Double]): Query[Double] = js.native
  
  def create(record: T): js.Promise[RecordResult] = js.native
  def create(record: T, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def create(record: T, options: js.UndefOr[scala.Nothing], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def create(record: T, options: RestApiOptions): js.Promise[RecordResult] = js.native
  def create(record: T, options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def create(record: js.Array[T]): js.Promise[js.Array[RecordResult]] = js.native
  def create(record: js.Array[T], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  def create(
    record: js.Array[T],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[RecordResult]]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def create(record: js.Array[T], options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
  def create(record: js.Array[T], options: RestApiOptions, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  
  def createBulk(): Batch = js.native
  def createBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def createBulk(input: String): Batch = js.native
  def createBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def createBulk(input: js.Array[Record[T]]): Batch = js.native
  def createBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def createBulk(input: Stream): Batch = js.native
  def createBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def del(id: String): js.Promise[RecordResult] = js.native
  def del(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def del(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
  def del(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  
  def delete(id: String): js.Promise[RecordResult] = js.native
  def delete(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def delete(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
  def delete(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  
  def deleteBulk(): Batch = js.native
  def deleteBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteBulk(input: String): Batch = js.native
  def deleteBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteBulk(input: js.Array[Record[T]]): Batch = js.native
  def deleteBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteBulk(input: Stream): Batch = js.native
  def deleteBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def deleteHardBulk(): Batch = js.native
  def deleteHardBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteHardBulk(input: String): Batch = js.native
  def deleteHardBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteHardBulk(input: js.Array[Record[T]]): Batch = js.native
  def deleteHardBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def deleteHardBulk(input: Stream): Batch = js.native
  def deleteHardBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def deleted(start: String, end: String): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: String, end: String, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: String, end: js.Date): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: String, end: js.Date, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: js.Date, end: String): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: js.Date, end: String, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: js.Date, end: js.Date): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: js.Date, end: js.Date, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
  
  def describe(): js.Promise[DescribeSObjectResult] = js.native
  def describe(callback: Callback[DescribeSObjectResult]): js.Promise[DescribeSObjectResult] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  @JSName("describe$")
  def describe$(): DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(callback: Callback[DescribeSObjectResult]): DescribeSObjectResult = js.native
  @JSName("describe$")
  var describe$_Original: CallCallbackClear = js.native
  
  def destroy(id: String): js.Promise[RecordResult] = js.native
  def destroy(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def destroy(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
  def destroy(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  
  def destroyBulk(): Batch = js.native
  def destroyBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyBulk(input: String): Batch = js.native
  def destroyBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyBulk(input: js.Array[Record[T]]): Batch = js.native
  def destroyBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyBulk(input: Stream): Batch = js.native
  def destroyBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def destroyHardBulk(): Batch = js.native
  def destroyHardBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyHardBulk(input: String): Batch = js.native
  def destroyHardBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyHardBulk(input: js.Array[Record[T]]): Batch = js.native
  def destroyHardBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def destroyHardBulk(input: Stream): Batch = js.native
  def destroyHardBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def find[T](): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: String): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: String,
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Array[String],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Array[String],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Object,
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: String): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: String, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Array[String], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: js.Array[String],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Object): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: String,
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](query: String, fields: js.Object, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: String): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: String, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Array[String], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Array[String],
    options: FindOptions,
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
  
  def findOne[T](): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: String): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: String, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: String,
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String]): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Array[String],
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: js.UndefOr[scala.Nothing],
    fields: js.Object,
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: String): Query[Record[T]] = js.native
  def findOne[T](query: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: String,
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: String,
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: String): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: String, options: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: String, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: String, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Array[String]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: String,
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Array[String], options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Object): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: String,
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: String, fields: js.Object, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: js.Object): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.UndefOr[scala.Nothing],
    options: FindOptions,
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: String): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: String, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: String, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[String]): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[String], options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[Record[T]]
  ): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
  
  def insert(records: js.Array[Record[T]]): js.Promise[js.Array[RecordResult]] = js.native
  def insert(records: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  def insert(record: Record[T]): js.Promise[RecordResult] = js.native
  def insert(record: Record[T], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  
  def insertBulk(): Batch = js.native
  def insertBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def insertBulk(input: String): Batch = js.native
  def insertBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def insertBulk(input: js.Array[Record[T]]): Batch = js.native
  def insertBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def insertBulk(input: Stream): Batch = js.native
  def insertBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def layouts(): js.Promise[LayoutInfo] = js.native
  def layouts(layoutName: js.UndefOr[scala.Nothing], callback: Callback[LayoutInfo]): js.Promise[LayoutInfo] = js.native
  def layouts(layoutName: String): js.Promise[LayoutInfo] = js.native
  def layouts(layoutName: String, callback: Callback[LayoutInfo]): js.Promise[LayoutInfo] = js.native
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
  @JSName("layouts$")
  def layouts$(): LayoutInfo = js.native
  @JSName("layouts$")
  def layouts$(layoutName: js.UndefOr[scala.Nothing], callback: Callback[LayoutInfo]): LayoutInfo = js.native
  @JSName("layouts$")
  def layouts$(layoutName: String): LayoutInfo = js.native
  @JSName("layouts$")
  def layouts$(layoutName: String, callback: Callback[LayoutInfo]): LayoutInfo = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
  @JSName("layouts$")
  var layouts$_Original: CallLayoutNameCallback = js.native
  
  def listview(id: String): ListView = js.native
  
  def listviews(): js.Promise[ListViewsInfo] = js.native
  def listviews(callback: Callback[ListViewsInfo]): js.Promise[ListViewsInfo] = js.native
  
  def quickAction(actionName: String): typingsSlinky.jsforce.quickActionMod.QuickAction = js.native
  
  def quickActions(): js.Promise[js.Array[QuickActionInfo]] = js.native
  def quickActions(callback: Callback[js.Array[QuickActionInfo]]): js.Promise[js.Array[QuickActionInfo]] = js.native
  
  def recent(): js.Promise[js.Array[RecordResult]] = js.native
  def recent(callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  
  def record(id: SalesforceId): RecordReference[T] = js.native
  
  def retrieve(ids: js.Array[SalesforceId]): js.Promise[js.Array[Record[T]]] = js.native
  def retrieve(ids: js.Array[SalesforceId], callback: Callback[js.Array[Record[T]]]): js.Promise[js.Array[Record[T]]] = js.native
  def retrieve(
    ids: js.Array[SalesforceId],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[Record[T]]]
  ): js.Promise[js.Array[Record[T]]] = js.native
  def retrieve(ids: js.Array[SalesforceId], options: js.Object): js.Promise[js.Array[Record[T]]] = js.native
  def retrieve(ids: js.Array[SalesforceId], options: js.Object, callback: Callback[js.Array[Record[T]]]): js.Promise[js.Array[Record[T]]] = js.native
  def retrieve(id: SalesforceId): js.Promise[Record[T]] = js.native
  def retrieve(id: SalesforceId, callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
  def retrieve(id: SalesforceId, options: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
  def retrieve(id: SalesforceId, options: js.Object): js.Promise[Record[T]] = js.native
  def retrieve(id: SalesforceId, options: js.Object, callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
  
  // TODO:use a typed pluck to turn `fields` into a subset of T's fields so that the output is slimmed down appropriately
  def select(): Query[js.Array[T]] = js.native
  def select(callback: Callback[js.Array[T]]): Query[js.Array[T]] = js.native
  def select(
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.jsforce.jsforceStrings.SObject with TopLevel[js.Any]
  ): Query[js.Array[Partial[T]]] = js.native
  def select(
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.jsforce.jsforceStrings.SObject with TopLevel[js.Any],
    callback: Callback[js.Array[Partial[T]]]
  ): Query[js.Array[Partial[T]]] = js.native
  def select(fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
  def select(fields: /* keyof T */ String): Query[js.Array[Partial[T]]] = js.native
  def select(fields: /* keyof T */ String, callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
  def select(fields: js.Array[/* keyof T */ String]): Query[js.Array[Partial[T]]] = js.native
  def select(fields: js.Array[/* keyof T */ String], callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
  
  def update(records: js.Array[Partial[T]]): js.Promise[js.Array[RecordResult]] = js.native
  def update(records: js.Array[Partial[T]], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  def update(
    records: js.Array[Partial[T]],
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[RecordResult]]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def update(records: js.Array[Partial[T]], options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
  def update(records: js.Array[Partial[T]], options: RestApiOptions, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  // Should update require that the record Id field be provided?
  def update(record: Partial[T]): js.Promise[RecordResult] = js.native
  def update(record: Partial[T], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def update(record: Partial[T], options: js.UndefOr[scala.Nothing], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def update(record: Partial[T], options: RestApiOptions): js.Promise[RecordResult] = js.native
  def update(record: Partial[T], options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  
  // should input really be optional? the documentation says so, but how can you actually update without it?
  def updateBulk(): Batch = js.native
  def updateBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def updateBulk(input: String): Batch = js.native
  def updateBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def updateBulk(input: js.Array[Record[_]]): Batch = js.native
  def updateBulk(input: js.Array[Record[_]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
  def updateBulk(input: Stream): Batch = js.native
  def updateBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
  
  def updated(start: String, end: String): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: String, end: String, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: String, end: js.Date): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: String, end: js.Date, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: js.Date, end: String): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: js.Date, end: String, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: js.Date, end: js.Date): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: js.Date, end: js.Date, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
  
  def upsert(records: js.Array[Record[T]], extIdField: String): js.Promise[js.Array[RecordResult]] = js.native
  def upsert(records: js.Array[Record[T]], extIdField: String, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
  def upsert(
    records: js.Array[Record[T]],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[js.Array[RecordResult]]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def upsert(records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
  def upsert(
    records: js.Array[Record[T]],
    extIdField: String,
    options: RestApiOptions,
    callback: Callback[js.Array[RecordResult]]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def upsert(records: Record[T], extIdField: String): js.Promise[RecordResult] = js.native
  def upsert(records: Record[T], extIdField: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  def upsert(
    records: Record[T],
    extIdField: String,
    options: js.UndefOr[scala.Nothing],
    callback: Callback[RecordResult]
  ): js.Promise[RecordResult] = js.native
  def upsert(records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult] = js.native
  def upsert(records: Record[T], extIdField: String, options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
  
  def upsertBulk(): Batch = js.native
  def upsertBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
  def upsertBulk(input: String): Batch = js.native
  def upsertBulk(input: String, callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
  def upsertBulk(input: js.Array[Record[T]]): Batch = js.native
  def upsertBulk(input: js.Array[Record[T]], callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
  def upsertBulk(input: Stream): Batch = js.native
  def upsertBulk(input: Stream, callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
}
