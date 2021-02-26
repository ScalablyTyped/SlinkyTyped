package typingsSlinky.elasticElasticsearch.anon

import typingsSlinky.elasticElasticsearch.mod.callbackFn
import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesDeleteDanglingIndex
import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesImportDanglingIndex
import typingsSlinky.elasticElasticsearch.requestParamsMod.DanglingIndicesListDanglingIndices
import typingsSlinky.elasticElasticsearch.transportMod.ApiResponse
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletedanglingindex extends StObject {
  
  def deleteDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDanglingIndex[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteDanglingIndex[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteDanglingIndex[TResponse, TContext](
    params: DanglingIndicesDeleteDanglingIndex,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_dangling_index[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_dangling_index[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_dangling_index[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_dangling_index[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_dangling_index[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_dangling_index[TResponse, TContext](params: DanglingIndicesDeleteDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_dangling_index[TResponse, TContext](
    params: DanglingIndicesDeleteDanglingIndex,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def importDanglingIndex[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def importDanglingIndex[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def importDanglingIndex[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def importDanglingIndex[TResponse, TContext](
    params: DanglingIndicesImportDanglingIndex,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def import_dangling_index[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def import_dangling_index[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def import_dangling_index[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def import_dangling_index[TResponse, TContext](params: DanglingIndicesImportDanglingIndex): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def import_dangling_index[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def import_dangling_index[TResponse, TContext](params: DanglingIndicesImportDanglingIndex, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def import_dangling_index[TResponse, TContext](
    params: DanglingIndicesImportDanglingIndex,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def listDanglingIndices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def listDanglingIndices[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def listDanglingIndices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def listDanglingIndices[TResponse, TContext](
    params: DanglingIndicesListDanglingIndices,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def list_dangling_indices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def list_dangling_indices[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def list_dangling_indices[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def list_dangling_indices[TResponse, TContext](params: DanglingIndicesListDanglingIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def list_dangling_indices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def list_dangling_indices[TResponse, TContext](params: DanglingIndicesListDanglingIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def list_dangling_indices[TResponse, TContext](
    params: DanglingIndicesListDanglingIndices,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
