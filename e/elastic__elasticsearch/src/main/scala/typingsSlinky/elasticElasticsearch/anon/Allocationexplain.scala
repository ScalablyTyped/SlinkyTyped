package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterAllocationExplain
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterDeleteComponentTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterDeleteVotingConfigExclusions
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterExistsComponentTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterGetComponentTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterGetSettings
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterHealth
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterPendingTasks
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterPostVotingConfigExclusions
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterPutComponentTemplate
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterPutSettings
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterRemoteInfo
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterReroute
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterState
import typingsSlinky.elasticElasticsearch.requestParamsMod.ClusterStats
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allocationexplain extends StObject {
  
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterAllocationExplain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterAllocationExplain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](
    params: ClusterDeleteComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](
    params: ClusterDeleteVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_component_template[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](
    params: ClusterDeleteComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_voting_config_exclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](
    params: ClusterDeleteVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def existsComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](
    params: ClusterExistsComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def exists_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_component_template[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](
    params: ClusterExistsComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](
    params: ClusterGetComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getSettings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSettings[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](
    params: ClusterGetSettings,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_component_template[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](
    params: ClusterGetComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_settings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_settings[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](
    params: ClusterGetSettings,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](
    params: ClusterPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pending_tasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](
    params: ClusterPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def postVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](
    params: ClusterPostVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_voting_config_exclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](
    params: ClusterPostVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterPutComponentTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterPutSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterPutComponentTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterPutSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def remoteInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remoteInfo[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](
    params: ClusterRemoteInfo,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def remote_info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remote_info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](
    params: ClusterRemoteInfo,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClusterReroute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def state[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def state[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
