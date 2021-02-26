package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupDeleteJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupGetJobs
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupGetRollupCaps
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupGetRollupIndexCaps
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupPutJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupRollupSearch
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupStartJob
import typingsSlinky.elasticElasticsearch.requestParamsMod.RollupStopJob
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
trait DeleteJob_ extends StObject {
  
  def deleteJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRollupCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRollupIndexCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def startJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: RollupStartJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: RollupStartJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stopJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
