package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestDeletePipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestGetPipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestProcessorGrok
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestPutPipeline
import typingsSlinky.elasticElasticsearch.requestParamsMod.IngestSimulate
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePipeline extends js.Object {
  
  def deletePipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deletePipeline[TResponse, TContext](params: IngestDeletePipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePipeline[TResponse, TContext](
    params: IngestDeletePipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_pipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_pipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_pipeline[TResponse, TContext](params: IngestDeletePipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_pipeline[TResponse, TContext](
    params: IngestDeletePipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getPipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getPipeline[TResponse, TContext](params: IngestGetPipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPipeline[TResponse, TContext](
    params: IngestGetPipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_pipeline[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_pipeline[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_pipeline[TResponse, TContext](params: IngestGetPipeline, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_pipeline[TResponse, TContext](
    params: IngestGetPipeline,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def processorGrok[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processorGrok[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processorGrok[TResponse, TContext](params: IngestProcessorGrok, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processorGrok[TResponse, TContext](
    params: IngestProcessorGrok,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def processor_grok[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processor_grok[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def processor_grok[TResponse, TContext](params: IngestProcessorGrok, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def processor_grok[TResponse, TContext](
    params: IngestProcessorGrok,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestPutPipeline[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestPutPipeline[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_pipeline[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestPutPipeline[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IngestSimulate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def simulate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IngestSimulate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
