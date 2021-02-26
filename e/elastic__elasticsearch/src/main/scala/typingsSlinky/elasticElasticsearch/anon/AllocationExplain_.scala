package typingsSlinky.elasticElasticsearch.anon

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
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocationExplain_ extends StObject {
  
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getSettings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def postVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def remoteInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def state[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
