package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesDeleteDanglingIndex
import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesImportDanglingIndex
import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesListDanglingIndices
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDanglingIndex_ extends js.Object {
  
  def deleteDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def importDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def listDanglingIndices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
