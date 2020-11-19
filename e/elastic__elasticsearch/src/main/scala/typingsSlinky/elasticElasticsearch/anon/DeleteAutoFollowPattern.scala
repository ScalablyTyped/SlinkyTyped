package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrDeleteAutoFollowPattern
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrFollow
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrFollowInfo
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrFollowStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrForgetFollower
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrGetAutoFollowPattern
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrPauseAutoFollowPattern
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrPauseFollow
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrPutAutoFollowPattern
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrResumeAutoFollowPattern
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrResumeFollow
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrStats
import typingsSlinky.elasticElasticsearch.requestParamsMod.CcrUnfollow
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
trait DeleteAutoFollowPattern extends js.Object {
  
  def deleteAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](
    params: CcrDeleteAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](
    params: CcrDeleteAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def followInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followInfo[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def followStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](
    params: CcrFollowStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def follow_info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def follow_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](
    params: CcrFollowStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrForgetFollower[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrForgetFollower[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](
    params: CcrGetAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](
    params: CcrGetAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pauseAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](
    params: CcrPauseAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pauseFollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseFollow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](
    params: CcrPauseFollow,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pause_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](
    params: CcrPauseAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pause_follow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_follow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](
    params: CcrPauseFollow,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrPutAutoFollowPattern[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrPutAutoFollowPattern[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resumeAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](
    params: CcrResumeAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrResumeFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resume_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](
    params: CcrResumeAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrResumeFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: CcrStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def unfollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def unfollow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
