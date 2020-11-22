package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestDeletePipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestGetPipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestProcessorGrok
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestPutPipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestSimulate
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePipeline_ extends js.Object {
  
  def deletePipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getPipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def processorGrok[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
