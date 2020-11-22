package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.LicenseDelete
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicenseGet
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicenseGetBasicStatus
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicenseGetTrialStatus
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicensePost
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicensePostStartBasic
import typingsSlinky.elasticElasticsearch.requestParamsMod.LicensePostStartTrial
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.RequestBody
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBasicStatus extends js.Object {
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: LicenseDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: LicenseDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: LicenseGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: LicenseGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getBasicStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](params: LicenseGetBasicStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](params: LicenseGetBasicStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getTrialStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](params: LicenseGetTrialStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](params: LicenseGetTrialStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: LicensePost[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: LicensePost[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def postStartBasic[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](params: LicensePostStartBasic): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](params: LicensePostStartBasic, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def postStartTrial[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](params: LicensePostStartTrial): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](params: LicensePostStartTrial, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
