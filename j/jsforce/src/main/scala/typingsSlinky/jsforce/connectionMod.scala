package typingsSlinky.jsforce

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsforce.analyticsMod.Analytics
import typingsSlinky.jsforce.anon.Body
import typingsSlinky.jsforce.anon.Call
import typingsSlinky.jsforce.anon.Clear
import typingsSlinky.jsforce.anon.Customdomain
import typingsSlinky.jsforce.anon.PartialPartialOAuth2Optio
import typingsSlinky.jsforce.anon.Picture
import typingsSlinky.jsforce.apexMod.Apex
import typingsSlinky.jsforce.bulkMod.Bulk
import typingsSlinky.jsforce.cacheMod.Cache
import typingsSlinky.jsforce.chatterMod.Chatter
import typingsSlinky.jsforce.describeResultMod.BatchDescribeSObjectOptions
import typingsSlinky.jsforce.describeResultMod.DescribeGlobalResult
import typingsSlinky.jsforce.describeResultMod.DescribeSObjectOptions
import typingsSlinky.jsforce.describeResultMod.DescribeSObjectResult
import typingsSlinky.jsforce.httpApiMod.HttpApiOptions
import typingsSlinky.jsforce.jsforceStrings.refresh
import typingsSlinky.jsforce.limitsInfoMod.LimitsInfo
import typingsSlinky.jsforce.metadataMod.Metadata
import typingsSlinky.jsforce.mod.OAuth2
import typingsSlinky.jsforce.mod.Streaming
import typingsSlinky.jsforce.queryMod.ExecuteOptions
import typingsSlinky.jsforce.queryMod.Query
import typingsSlinky.jsforce.queryMod.QueryResult
import typingsSlinky.jsforce.recordMod.Record
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.jsforce.salesforceObjectMod.SObject
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("jsforce/connection", "BaseConnection")
  @js.native
  abstract class BaseConnection () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def _baseUrl(): String = js.native
    
    def batchDescribe(options: BatchDescribeSObjectOptions): js.Promise[js.Array[DescribeSObjectResult]] = js.native
    def batchDescribe(
      options: BatchDescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[DescribeSObjectResult], Unit]
    ): js.Promise[js.Array[DescribeSObjectResult]] = js.native
    
    def create[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: js.Array[Record[T]],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: Record[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: Record[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def del[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def delete[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def describe(`type`: String): js.Promise[DescribeSObjectResult] = js.native
    def describe(
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): js.Promise[DescribeSObjectResult] = js.native
    def describe(`type`: DescribeSObjectOptions): js.Promise[DescribeSObjectResult] = js.native
    def describe(
      `type`: DescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): js.Promise[DescribeSObjectResult] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
    @JSName("describe$")
    def describe$(`type`: String): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(`type`: DescribeSObjectOptions): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(
      `type`: DescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): DescribeSObjectResult = js.native
    @JSName("describe$")
    var describe$_Original: Call = js.native
    
    def describeGlobal[T](): js.Promise[DescribeGlobalResult] = js.native
    def describeGlobal[T](callback: js.Function2[/* err */ js.Error, /* result */ DescribeGlobalResult, Unit]): js.Promise[DescribeGlobalResult] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
    @JSName("describeGlobal$")
    def describeGlobal$(): DescribeGlobalResult = js.native
    @JSName("describeGlobal$")
    def describeGlobal$(callback: js.Function2[/* err */ js.Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
    @JSName("describeGlobal$")
    var describeGlobal$_Original: Clear = js.native
    
    def destroy[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def insert[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: Record[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def query[T](soql: String): Query[QueryResult[T]] = js.native
    def query[T](
      soql: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    def query[T](soql: String, options: ExecuteOptions): Query[QueryResult[T]] = js.native
    def query[T](
      soql: String,
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    
    def queryMore[T](locator: String): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](
      locator: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](locator: String, options: ExecuteOptions): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](
      locator: String,
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): js.Promise[QueryResult[T]] = js.native
    
    def recent(): js.Promise[js.Array[RecordResult]] = js.native
    def recent(callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]): js.Promise[js.Array[RecordResult]] = js.native
    def recent(param: String): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      param: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def recent(param: Double): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      param: Double,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def recent(`type`: String, limit: Double): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      `type`: String,
      limit: Double,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    
    def request[T](info: String): js.Promise[T] = js.native
    def request[T](
      info: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def request[T](info: String, options: HttpApiOptions): js.Promise[T] = js.native
    def request[T](
      info: String,
      options: HttpApiOptions,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def request[T](info: RequestInfo): js.Promise[T] = js.native
    def request[T](
      info: RequestInfo,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def request[T](info: RequestInfo, options: HttpApiOptions): js.Promise[T] = js.native
    def request[T](
      info: RequestInfo,
      options: HttpApiOptions,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    
    def retrieve[T](`type`: String, ids: String): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: js.Array[String]): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    
    // we want any object to be accepted if the user doesn't decide to give an explicit type
    def sobject[T](resource: String): SObject[T] = js.native
    
    def update[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: js.Array[Record[T]],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: Record[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: Record[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def upsert[T](records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: js.Array[Record[T]],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: js.Array[Record[T]],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: Record[T],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: Record[T],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: js.Array[Record[T]],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: js.Array[Record[T]],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: Record[T],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: Record[T],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  }
  
  @JSImport("jsforce/connection", "Connection")
  @js.native
  class Connection protected () extends BaseConnection {
    def this(params: ConnectionOptions) = this()
    
    var accessToken: String = js.native
    
    var analytics: Analytics = js.native
    
    var apex: Apex = js.native
    
    def authorize(code: String): js.Promise[UserInfo] = js.native
    def authorize(code: String, callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]): js.Promise[UserInfo] = js.native
    
    var bulk: Bulk = js.native
    
    var cache: Cache = js.native
    
    var chatter: Chatter = js.native
    
    def identity(): js.Promise[IdentityInfo] = js.native
    def identity(callback: js.Function2[/* err */ js.Error, /* res */ IdentityInfo, Unit]): js.Promise[IdentityInfo] = js.native
    
    def initialize(): Unit = js.native
    def initialize(options: ConnectionOptions): Unit = js.native
    
    // Specific to Connection
    var instanceUrl: String = js.native
    
    def limits(): js.Promise[LimitsInfo] = js.native
    def limits(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[LimitsInfo] = js.native
    
    def login(user: String, password: String): js.Promise[UserInfo] = js.native
    def login(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def loginByOAuth2(user: String, password: String): js.Promise[UserInfo] = js.native
    def loginByOAuth2(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def loginBySoap(user: String, password: String): js.Promise[UserInfo] = js.native
    def loginBySoap(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def logout(): js.Promise[Unit] = js.native
    def logout(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
    def logout(revoke: Boolean): js.Promise[Unit] = js.native
    def logout(
      revoke: Boolean,
      callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
    ): js.Promise[Unit] = js.native
    
    def logoutByOAuth2(): js.Promise[Unit] = js.native
    def logoutByOAuth2(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
    def logoutByOAuth2(revoke: Boolean): js.Promise[Unit] = js.native
    def logoutByOAuth2(
      revoke: Boolean,
      callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
    ): js.Promise[Unit] = js.native
    
    def logoutBySoap(): js.Promise[Unit] = js.native
    def logoutBySoap(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
    def logoutBySoap(revoke: Boolean): js.Promise[Unit] = js.native
    def logoutBySoap(
      revoke: Boolean,
      callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
    ): js.Promise[Unit] = js.native
    
    var metadata: Metadata = js.native
    
    var oauth2: OAuth2 = js.native
    
    def queryAll[T](soql: String): Query[QueryResult[T]] = js.native
    def queryAll[T](
      soql: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    def queryAll[T](soql: String, options: js.Object): Query[QueryResult[T]] = js.native
    def queryAll[T](
      soql: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
    
    var streaming: Streaming = js.native
    
    var tooling: Tooling = js.native
    
    var userInfo: js.UndefOr[UserInfo] = js.native
    
    var version: String = js.native
  }
  
  @JSImport("jsforce/connection", "RestApi")
  @js.native
  abstract class RestApi () extends StObject {
    
    def del(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def get(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def patch(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def post(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def put(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  }
  
  @JSImport("jsforce/connection", "Tooling")
  @js.native
  class Tooling () extends BaseConnection {
    def this(options: EventEmitterOptions) = this()
    
    var _logger: js.Any = js.native
    
    // Specific to tooling
    def executeAnonymous(body: String): js.Promise[ExecuteAnonymousResult] = js.native
    def executeAnonymous(body: String, callback: js.Function2[/* err */ js.Error, /* res */ js.Any, Unit]): js.Promise[ExecuteAnonymousResult] = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  
  type ConnectionEvent = refresh
  
  @js.native
  trait ConnectionOptions extends PartialOAuth2Options {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var callOptions: js.UndefOr[js.Object] = js.native
    
    var httpProxy: js.UndefOr[String] = js.native
    
    var instanceUrl: js.UndefOr[String] = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var maxRequest: js.UndefOr[Double] = js.native
    
    var oauth2: js.UndefOr[PartialPartialOAuth2Optio] = js.native
    
    var proxyUrl: js.UndefOr[String] = js.native
    
    var refreshFn: js.UndefOr[
        js.Function2[/* conn */ Connection, /* callback */ Callback[UserInfo], js.Promise[UserInfo]]
      ] = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
    
    var serverUrl: js.UndefOr[String] = js.native
    
    var sessionId: js.UndefOr[String] = js.native
    
    var signedRequest: js.UndefOr[String | js.Object] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setCallOptions(value: js.Object): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
      
      @scala.inline
      def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
      
      @scala.inline
      def setInstanceUrl(value: String): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMaxRequest(value: Double): Self = StObject.set(x, "maxRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRequestUndefined: Self = StObject.set(x, "maxRequest", js.undefined)
      
      @scala.inline
      def setOauth2(value: PartialPartialOAuth2Optio): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
      
      @scala.inline
      def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
      
      @scala.inline
      def setRefreshFn(value: (/* conn */ Connection, /* callback */ Callback[UserInfo]) => js.Promise[UserInfo]): Self = StObject.set(x, "refreshFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefreshFnUndefined: Self = StObject.set(x, "refreshFn", js.undefined)
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      @scala.inline
      def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      @scala.inline
      def setSignedRequest(value: String | js.Object): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedRequestUndefined: Self = StObject.set(x, "signedRequest", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ExecuteAnonymousResult extends StObject {
    
    var column: Double = js.native
    
    var compileProblem: String = js.native
    
    var compiled: Boolean = js.native
    
    var exceptionMessage: String = js.native
    
    var exceptionStackTrace: String = js.native
    
    var line: Double = js.native
    
    var success: Boolean = js.native
  }
  object ExecuteAnonymousResult {
    
    @scala.inline
    def apply(
      column: Double,
      compileProblem: String,
      compiled: Boolean,
      exceptionMessage: String,
      exceptionStackTrace: String,
      line: Double,
      success: Boolean
    ): ExecuteAnonymousResult = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compileProblem = compileProblem.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], exceptionMessage = exceptionMessage.asInstanceOf[js.Any], exceptionStackTrace = exceptionStackTrace.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteAnonymousResult]
    }
    
    @scala.inline
    implicit class ExecuteAnonymousResultMutableBuilder[Self <: ExecuteAnonymousResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileProblem(value: String): Self = StObject.set(x, "compileProblem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionMessage(value: String): Self = StObject.set(x, "exceptionMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionStackTrace(value: String): Self = StObject.set(x, "exceptionStackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdentityInfo
    extends // And possible other attributes.
  /* key */ StringDictionary[js.Any] {
    
    var active: Boolean = js.native
    
    var addr_city: String | Null = js.native
    
    var addr_country: String | Null = js.native
    
    var addr_state: String | Null = js.native
    
    var addr_street: String | Null = js.native
    
    var addr_zip: String | Null = js.native
    
    var asserted_user: Boolean = js.native
    
    var display_name: String = js.native
    
    var email: String = js.native
    
    var email_verified: Boolean = js.native
    
    var first_name: String | Null = js.native
    
    var id: String = js.native
    
    var is_app_installed: Boolean = js.native
    
    var is_lightning_login_user: Boolean = js.native
    
    var language: String = js.native
    
    var last_modified_date: js.Date = js.native
    
    var last_name: String = js.native
    
    var locale: String = js.native
    
    var mobile_phone: String | Null = js.native
    
    var mobile_phone_verified: Boolean = js.native
    
    var nick_name: String = js.native
    
    var organization_id: String = js.native
    
    var photos: Picture = js.native
    
    var status: Body = js.native
    
    var timezone: String = js.native
    
    var urls: Customdomain = js.native
    
    var user_id: String = js.native
    
    var user_type: String = js.native
    
    var username: String = js.native
    
    var utcOffset: Double = js.native
  }
  object IdentityInfo {
    
    @scala.inline
    def apply(
      active: Boolean,
      asserted_user: Boolean,
      display_name: String,
      email: String,
      email_verified: Boolean,
      id: String,
      is_app_installed: Boolean,
      is_lightning_login_user: Boolean,
      language: String,
      last_modified_date: js.Date,
      last_name: String,
      locale: String,
      mobile_phone_verified: Boolean,
      nick_name: String,
      organization_id: String,
      photos: Picture,
      status: Body,
      timezone: String,
      urls: Customdomain,
      user_id: String,
      user_type: String,
      username: String,
      utcOffset: Double
    ): IdentityInfo = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], asserted_user = asserted_user.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_app_installed = is_app_installed.asInstanceOf[js.Any], is_lightning_login_user = is_lightning_login_user.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_modified_date = last_modified_date.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile_phone_verified = mobile_phone_verified.asInstanceOf[js.Any], nick_name = nick_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_type = user_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityInfo]
    }
    
    @scala.inline
    implicit class IdentityInfoMutableBuilder[Self <: IdentityInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_city(value: String): Self = StObject.set(x, "addr_city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_cityNull: Self = StObject.set(x, "addr_city", null)
      
      @scala.inline
      def setAddr_country(value: String): Self = StObject.set(x, "addr_country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_countryNull: Self = StObject.set(x, "addr_country", null)
      
      @scala.inline
      def setAddr_state(value: String): Self = StObject.set(x, "addr_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_stateNull: Self = StObject.set(x, "addr_state", null)
      
      @scala.inline
      def setAddr_street(value: String): Self = StObject.set(x, "addr_street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_streetNull: Self = StObject.set(x, "addr_street", null)
      
      @scala.inline
      def setAddr_zip(value: String): Self = StObject.set(x, "addr_zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddr_zipNull: Self = StObject.set(x, "addr_zip", null)
      
      @scala.inline
      def setAsserted_user(value: Boolean): Self = StObject.set(x, "asserted_user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_nameNull: Self = StObject.set(x, "first_name", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_app_installed(value: Boolean): Self = StObject.set(x, "is_app_installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_lightning_login_user(value: Boolean): Self = StObject.set(x, "is_lightning_login_user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_modified_date(value: js.Date): Self = StObject.set(x, "last_modified_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobile_phone(value: String): Self = StObject.set(x, "mobile_phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobile_phoneNull: Self = StObject.set(x, "mobile_phone", null)
      
      @scala.inline
      def setMobile_phone_verified(value: Boolean): Self = StObject.set(x, "mobile_phone_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNick_name(value: String): Self = StObject.set(x, "nick_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: Picture): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Body): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrls(value: Customdomain): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PartialOAuth2Options extends StObject {
    
    var authzServiceUrl: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var clientSecret: js.UndefOr[String] = js.native
    
    var loginUrl: js.UndefOr[String] = js.native
    
    var redirectUri: js.UndefOr[String] = js.native
    
    var tokenServiceUrl: js.UndefOr[String] = js.native
  }
  object PartialOAuth2Options {
    
    @scala.inline
    def apply(): PartialOAuth2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOAuth2Options]
    }
    
    @scala.inline
    implicit class PartialOAuth2OptionsMutableBuilder[Self <: PartialOAuth2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthzServiceUrl(value: String): Self = StObject.set(x, "authzServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzServiceUrlUndefined: Self = StObject.set(x, "authzServiceUrl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
    }
  }
  
  @js.native
  trait RequestInfo extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object RequestInfo {
    
    @scala.inline
    def apply(): RequestInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait RestApiOptions extends StObject {
    
    var allOrNone: js.UndefOr[Boolean] = js.native
    
    var allowRecursive: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
  }
  object RestApiOptions {
    
    @scala.inline
    def apply(): RestApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiOptions]
    }
    
    @scala.inline
    implicit class RestApiOptionsMutableBuilder[Self <: RestApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllOrNone(value: Boolean): Self = StObject.set(x, "allOrNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOrNoneUndefined: Self = StObject.set(x, "allOrNone", js.undefined)
      
      @scala.inline
      def setAllowRecursive(value: Boolean): Self = StObject.set(x, "allowRecursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRecursiveUndefined: Self = StObject.set(x, "allowRecursive", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  @js.native
  trait UserInfo extends StObject {
    
    var id: String = js.native
    
    var organizationId: String = js.native
    
    var url: String = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(id: String, organizationId: String, url: String): UserInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
