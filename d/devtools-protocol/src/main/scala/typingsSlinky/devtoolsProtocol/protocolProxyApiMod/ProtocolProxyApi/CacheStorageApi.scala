package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteCacheRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteEntryRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheStorageApi extends StObject {
  
  /**
    * Deletes a cache.
    */
  def deleteCache(params: DeleteCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes a cache entry.
    */
  def deleteEntry(params: DeleteEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests cache names.
    */
  def requestCacheNames(params: RequestCacheNamesRequest): js.Promise[RequestCacheNamesResponse] = js.native
  
  /**
    * Fetches cache entry.
    */
  def requestCachedResponse(params: RequestCachedResponseRequest): js.Promise[RequestCachedResponseResponse] = js.native
  
  /**
    * Requests data from cache.
    */
  def requestEntries(params: RequestEntriesRequest): js.Promise[RequestEntriesResponse] = js.native
}
object CacheStorageApi {
  
  @scala.inline
  def apply(
    deleteCache: DeleteCacheRequest => js.Promise[Unit],
    deleteEntry: DeleteEntryRequest => js.Promise[Unit],
    requestCacheNames: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse],
    requestCachedResponse: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse],
    requestEntries: RequestEntriesRequest => js.Promise[RequestEntriesResponse]
  ): CacheStorageApi = {
    val __obj = js.Dynamic.literal(deleteCache = js.Any.fromFunction1(deleteCache), deleteEntry = js.Any.fromFunction1(deleteEntry), requestCacheNames = js.Any.fromFunction1(requestCacheNames), requestCachedResponse = js.Any.fromFunction1(requestCachedResponse), requestEntries = js.Any.fromFunction1(requestEntries))
    __obj.asInstanceOf[CacheStorageApi]
  }
  
  @scala.inline
  implicit class CacheStorageApiMutableBuilder[Self <: CacheStorageApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteCache(value: DeleteCacheRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteEntry(value: DeleteEntryRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestCacheNames(value: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse]): Self = StObject.set(x, "requestCacheNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestCachedResponse(value: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse]): Self = StObject.set(x, "requestCachedResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestEntries(value: RequestEntriesRequest => js.Promise[RequestEntriesResponse]): Self = StObject.set(x, "requestEntries", js.Any.fromFunction1(value))
  }
}
