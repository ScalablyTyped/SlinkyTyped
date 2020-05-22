package typingsSlinky.elasticElasticsearch.helpersMod

import typingsSlinky.elasticElasticsearch.requestParamsMod.Search
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helpers extends js.Object {
  def bulk[TDocument](options: BulkHelperOptions[TDocument]): BulkHelper[BulkStats] = js.native
  def scrollDocuments[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody]): AsyncIterable[TDocument] = js.native
  def scrollDocuments[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody], options: TransportRequestOptions): AsyncIterable[TDocument] = js.native
  def scrollSearch[TDocument, TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody]): AsyncIterable[ScrollSearchResponse[TDocument, TResponse, TContext]] = js.native
  def scrollSearch[TDocument, TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody], options: TransportRequestOptions): AsyncIterable[ScrollSearchResponse[TDocument, TResponse, TContext]] = js.native
  def search[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody]): js.Promise[js.Array[TDocument]] = js.native
  def search[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody], options: TransportRequestOptions): js.Promise[js.Array[TDocument]] = js.native
}

