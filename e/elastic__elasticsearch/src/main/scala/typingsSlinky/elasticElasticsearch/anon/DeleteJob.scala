package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
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
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJob extends js.Object {
  def deleteJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](
    params: RollupDeleteJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_job[TResponse, TContext](params: RollupDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](params: RollupDeleteJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_job[TResponse, TContext](params: RollupDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_job[TResponse, TContext](
    params: RollupDeleteJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRollupCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](
    params: RollupGetRollupCaps,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getRollupIndexCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](
    params: RollupGetRollupIndexCaps,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_jobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_jobs[TResponse, TContext](params: RollupGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](params: RollupGetJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_jobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_jobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_rollup_caps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_caps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_rollup_caps[TResponse, TContext](params: RollupGetRollupCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_caps[TResponse, TContext](params: RollupGetRollupCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_rollup_caps[TResponse, TContext](params: RollupGetRollupCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_caps[TResponse, TContext](
    params: RollupGetRollupCaps,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_rollup_index_caps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_index_caps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_rollup_index_caps[TResponse, TContext](params: RollupGetRollupIndexCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_index_caps[TResponse, TContext](params: RollupGetRollupIndexCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_rollup_index_caps[TResponse, TContext](params: RollupGetRollupIndexCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_rollup_index_caps[TResponse, TContext](
    params: RollupGetRollupIndexCaps,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RollupPutJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_job[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RollupPutJob[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RollupRollupSearch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RollupRollupSearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollup_search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RollupRollupSearch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def startJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startJob[TResponse, TContext](params: RollupStartJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: RollupStartJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startJob[TResponse, TContext](params: RollupStartJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](
    params: RollupStartJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def start_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_job[TResponse, TContext](params: RollupStartJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_job[TResponse, TContext](params: RollupStartJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_job[TResponse, TContext](params: RollupStartJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_job[TResponse, TContext](
    params: RollupStartJob,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def stopJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_job[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_job[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_job[TResponse, TContext](params: RollupStopJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_job[TResponse, TContext](params: RollupStopJob, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_job[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_job[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}

