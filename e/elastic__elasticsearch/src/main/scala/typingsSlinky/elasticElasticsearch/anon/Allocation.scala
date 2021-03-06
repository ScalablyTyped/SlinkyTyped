package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatAliases
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatAllocation
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatCount
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatFielddata
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatHealth
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatHelp
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatIndices
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatMaster
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatMlDataFrameAnalytics
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatMlDatafeeds
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatMlJobs
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatMlTrainedModels
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatNodeattrs
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatNodes
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatPendingTasks
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatPlugins
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatRecovery
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatRepositories
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatSegments
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatShards
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatSnapshots
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatTasks
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatTemplates
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatThreadPool
import typingsSlinky.elasticElasticsearch.requestParamsMod.CatTransforms
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allocation extends StObject {
  
  def aliases[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def aliases[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: CatAliases): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: CatAliases, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def aliases[TResponse, TContext](params: CatAliases, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: CatAliases, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def allocation[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: CatAllocation): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: CatAllocation, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation[TResponse, TContext](params: CatAllocation, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: CatAllocation, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def count[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: CatCount): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: CatCount, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TContext](params: CatCount, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: CatCount, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def fielddata[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fielddata[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: CatFielddata): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: CatFielddata, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fielddata[TResponse, TContext](params: CatFielddata, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: CatFielddata, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: CatHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: CatHealth, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: CatHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: CatHealth, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def help[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def help[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: CatHelp): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: CatHelp, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def help[TResponse, TContext](params: CatHelp, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: CatHelp, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def indices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def indices[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: CatIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: CatIndices, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def indices[TResponse, TContext](params: CatIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: CatIndices, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def master[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def master[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: CatMaster): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: CatMaster, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def master[TResponse, TContext](params: CatMaster, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: CatMaster, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def mlDataFrameAnalytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: CatMlDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: CatMlDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: CatMlDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](
    params: CatMlDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def mlDatafeeds[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlDatafeeds[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](params: CatMlDatafeeds): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](params: CatMlDatafeeds, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlDatafeeds[TResponse, TContext](params: CatMlDatafeeds, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](
    params: CatMlDatafeeds,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def mlJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlJobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def mlTrainedModels[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlTrainedModels[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](params: CatMlTrainedModels): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](params: CatMlTrainedModels, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mlTrainedModels[TResponse, TContext](params: CatMlTrainedModels, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](
    params: CatMlTrainedModels,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def ml_data_frame_analytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_data_frame_analytics[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_data_frame_analytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_data_frame_analytics[TResponse, TContext](params: CatMlDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_data_frame_analytics[TResponse, TContext](params: CatMlDataFrameAnalytics, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_data_frame_analytics[TResponse, TContext](params: CatMlDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_data_frame_analytics[TResponse, TContext](
    params: CatMlDataFrameAnalytics,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def ml_datafeeds[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_datafeeds[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_datafeeds[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_datafeeds[TResponse, TContext](params: CatMlDatafeeds): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_datafeeds[TResponse, TContext](params: CatMlDatafeeds, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_datafeeds[TResponse, TContext](params: CatMlDatafeeds, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_datafeeds[TResponse, TContext](
    params: CatMlDatafeeds,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def ml_jobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_jobs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_jobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_jobs[TResponse, TContext](params: CatMlJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_jobs[TResponse, TContext](params: CatMlJobs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_jobs[TResponse, TContext](params: CatMlJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_jobs[TResponse, TContext](params: CatMlJobs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def ml_trained_models[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_trained_models[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_trained_models[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_trained_models[TResponse, TContext](params: CatMlTrainedModels): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_trained_models[TResponse, TContext](params: CatMlTrainedModels, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ml_trained_models[TResponse, TContext](params: CatMlTrainedModels, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ml_trained_models[TResponse, TContext](
    params: CatMlTrainedModels,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def nodeattrs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def nodeattrs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def nodes[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def nodes[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: CatNodes): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: CatNodes, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def nodes[TResponse, TContext](params: CatNodes, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: CatNodes, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: CatPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: CatPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: CatPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](
    params: CatPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pending_tasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: CatPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: CatPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: CatPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](
    params: CatPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def plugins[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def plugins[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: CatPlugins): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: CatPlugins, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def plugins[TResponse, TContext](params: CatPlugins, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: CatPlugins, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def recovery[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def recovery[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: CatRecovery): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: CatRecovery, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def recovery[TResponse, TContext](params: CatRecovery, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: CatRecovery, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def repositories[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repositories[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](params: CatRepositories): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](params: CatRepositories, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repositories[TResponse, TContext](params: CatRepositories, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](
    params: CatRepositories,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def segments[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def segments[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: CatSegments): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: CatSegments, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def segments[TResponse, TContext](params: CatSegments, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: CatSegments, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def shards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def shards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: CatShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: CatShards, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def shards[TResponse, TContext](params: CatShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: CatShards, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def snapshots[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def snapshots[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def tasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def tasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: CatTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: CatTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def tasks[TResponse, TContext](params: CatTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: CatTasks, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def templates[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def templates[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: CatTemplates): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: CatTemplates, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def templates[TResponse, TContext](params: CatTemplates, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: CatTemplates, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def threadPool[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def threadPool[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def thread_pool[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def thread_pool[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def thread_pool[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def thread_pool[TResponse, TContext](params: CatThreadPool): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def thread_pool[TResponse, TContext](params: CatThreadPool, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def thread_pool[TResponse, TContext](params: CatThreadPool, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def thread_pool[TResponse, TContext](params: CatThreadPool, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def transforms[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def transforms[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: CatTransforms): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: CatTransforms, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def transforms[TResponse, TContext](params: CatTransforms, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: CatTransforms, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
