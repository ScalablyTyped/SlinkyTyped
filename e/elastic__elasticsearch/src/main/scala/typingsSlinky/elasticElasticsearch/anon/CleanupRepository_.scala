package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotCleanupRepository
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotClone
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotCreate
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotCreateRepository
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotDelete
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotDeleteRepository
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotGet
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotGetRepository
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotRestore
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotStatus
import typingsSlinky.elasticElasticsearch.requestParamsMod.SnapshotVerifyRepository
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanupRepository_ extends StObject {
  
  def cleanupRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotClone[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotClone[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotRestore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotRestore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def verifyRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
