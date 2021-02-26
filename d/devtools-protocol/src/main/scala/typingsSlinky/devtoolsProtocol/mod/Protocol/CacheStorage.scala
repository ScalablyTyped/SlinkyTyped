package typingsSlinky.devtoolsProtocol.mod.Protocol

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CacheStorage {
  
  @js.native
  trait Cache extends StObject {
    
    /**
      * An opaque unique id of the cache.
      */
    var cacheId: CacheId = js.native
    
    /**
      * The name of the cache.
      */
    var cacheName: String = js.native
    
    /**
      * Security origin of the cache.
      */
    var securityOrigin: String = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(cacheId: CacheId, cacheName: String, securityOrigin: String): Cache = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], cacheName = cacheName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheId = String
  
  @js.native
  trait CachedResponse extends StObject {
    
    /**
      * Entry content, base64-encoded.
      */
    var body: String = js.native
  }
  object CachedResponse {
    
    @scala.inline
    def apply(body: String): CachedResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedResponse]
    }
    
    @scala.inline
    implicit class CachedResponseMutableBuilder[Self <: CachedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.basic
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.cors
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.default_
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect
  */
  trait CachedResponseType extends StObject
  object CachedResponseType {
    
    @scala.inline
    def default: default_ = "default".asInstanceOf[default_]
    
    @scala.inline
    def basic: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.basic = "basic".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.basic]
    
    @scala.inline
    def cors: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.cors = "cors".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.cors]
    
    @scala.inline
    def error: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error = "error".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error]
    
    @scala.inline
    def opaqueRedirect: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect = "opaqueRedirect".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect]
    
    @scala.inline
    def opaqueResponse: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse = "opaqueResponse".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse]
  }
  
  @js.native
  trait DataEntry extends StObject {
    
    /**
      * Request headers
      */
    var requestHeaders: js.Array[Header] = js.native
    
    /**
      * Request method.
      */
    var requestMethod: String = js.native
    
    /**
      * Request URL.
      */
    var requestURL: String = js.native
    
    /**
      * Response headers
      */
    var responseHeaders: js.Array[Header] = js.native
    
    /**
      * HTTP response status code.
      */
    var responseStatus: integer = js.native
    
    /**
      * HTTP response status text.
      */
    var responseStatusText: String = js.native
    
    /**
      * Number of seconds since epoch.
      */
    var responseTime: Double = js.native
    
    /**
      * HTTP response type
      */
    var responseType: CachedResponseType = js.native
  }
  object DataEntry {
    
    @scala.inline
    def apply(
      requestHeaders: js.Array[Header],
      requestMethod: String,
      requestURL: String,
      responseHeaders: js.Array[Header],
      responseStatus: integer,
      responseStatusText: String,
      responseTime: Double,
      responseType: CachedResponseType
    ): DataEntry = {
      val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseStatusText = responseStatusText.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntry]
    }
    
    @scala.inline
    implicit class DataEntryMutableBuilder[Self <: DataEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHeaders(value: js.Array[Header]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersVarargs(value: Header*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeaders(value: js.Array[Header]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeadersVarargs(value: Header*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
      
      @scala.inline
      def setResponseStatus(value: integer): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseStatusText(value: String): Self = StObject.set(x, "responseStatusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: CachedResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteCacheRequest extends StObject {
    
    /**
      * Id of cache for deletion.
      */
    var cacheId: CacheId = js.native
  }
  object DeleteCacheRequest {
    
    @scala.inline
    def apply(cacheId: CacheId): DeleteCacheRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCacheRequest]
    }
    
    @scala.inline
    implicit class DeleteCacheRequestMutableBuilder[Self <: DeleteCacheRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteEntryRequest extends StObject {
    
    /**
      * Id of cache where the entry will be deleted.
      */
    var cacheId: CacheId = js.native
    
    /**
      * URL spec of the request.
      */
    var request: String = js.native
  }
  object DeleteEntryRequest {
    
    @scala.inline
    def apply(cacheId: CacheId, request: String): DeleteEntryRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEntryRequest]
    }
    
    @scala.inline
    implicit class DeleteEntryRequestMutableBuilder[Self <: DeleteEntryRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Header extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object Header {
    
    @scala.inline
    def apply(name: String, value: String): Header = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestCacheNamesRequest extends StObject {
    
    /**
      * Security origin.
      */
    var securityOrigin: String = js.native
  }
  object RequestCacheNamesRequest {
    
    @scala.inline
    def apply(securityOrigin: String): RequestCacheNamesRequest = {
      val __obj = js.Dynamic.literal(securityOrigin = securityOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCacheNamesRequest]
    }
    
    @scala.inline
    implicit class RequestCacheNamesRequestMutableBuilder[Self <: RequestCacheNamesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestCacheNamesResponse extends StObject {
    
    /**
      * Caches for the security origin.
      */
    var caches: js.Array[Cache] = js.native
  }
  object RequestCacheNamesResponse {
    
    @scala.inline
    def apply(caches: js.Array[Cache]): RequestCacheNamesResponse = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCacheNamesResponse]
    }
    
    @scala.inline
    implicit class RequestCacheNamesResponseMutableBuilder[Self <: RequestCacheNamesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: js.Array[Cache]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachesVarargs(value: Cache*): Self = StObject.set(x, "caches", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RequestCachedResponseRequest extends StObject {
    
    /**
      * Id of cache that contains the entry.
      */
    var cacheId: CacheId = js.native
    
    /**
      * headers of the request.
      */
    var requestHeaders: js.Array[Header] = js.native
    
    /**
      * URL spec of the request.
      */
    var requestURL: String = js.native
  }
  object RequestCachedResponseRequest {
    
    @scala.inline
    def apply(cacheId: CacheId, requestHeaders: js.Array[Header], requestURL: String): RequestCachedResponseRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCachedResponseRequest]
    }
    
    @scala.inline
    implicit class RequestCachedResponseRequestMutableBuilder[Self <: RequestCachedResponseRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeaders(value: js.Array[Header]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersVarargs(value: Header*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestCachedResponseResponse extends StObject {
    
    /**
      * Response read from the cache.
      */
    var response: CachedResponse = js.native
  }
  object RequestCachedResponseResponse {
    
    @scala.inline
    def apply(response: CachedResponse): RequestCachedResponseResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCachedResponseResponse]
    }
    
    @scala.inline
    implicit class RequestCachedResponseResponseMutableBuilder[Self <: RequestCachedResponseResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: CachedResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestEntriesRequest extends StObject {
    
    /**
      * ID of cache to get entries from.
      */
    var cacheId: CacheId = js.native
    
    /**
      * Number of records to fetch.
      */
    var pageSize: js.UndefOr[integer] = js.native
    
    /**
      * If present, only return the entries containing this substring in the path
      */
    var pathFilter: js.UndefOr[String] = js.native
    
    /**
      * Number of records to skip.
      */
    var skipCount: js.UndefOr[integer] = js.native
  }
  object RequestEntriesRequest {
    
    @scala.inline
    def apply(cacheId: CacheId): RequestEntriesRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEntriesRequest]
    }
    
    @scala.inline
    implicit class RequestEntriesRequestMutableBuilder[Self <: RequestEntriesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: integer): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPathFilter(value: String): Self = StObject.set(x, "pathFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      @scala.inline
      def setSkipCount(value: integer): Self = StObject.set(x, "skipCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipCountUndefined: Self = StObject.set(x, "skipCount", js.undefined)
    }
  }
  
  @js.native
  trait RequestEntriesResponse extends StObject {
    
    /**
      * Array of object store data entries.
      */
    var cacheDataEntries: js.Array[DataEntry] = js.native
    
    /**
      * Count of returned entries from this storage. If pathFilter is empty, it
      * is the count of all entries from this storage.
      */
    var returnCount: Double = js.native
  }
  object RequestEntriesResponse {
    
    @scala.inline
    def apply(cacheDataEntries: js.Array[DataEntry], returnCount: Double): RequestEntriesResponse = {
      val __obj = js.Dynamic.literal(cacheDataEntries = cacheDataEntries.asInstanceOf[js.Any], returnCount = returnCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEntriesResponse]
    }
    
    @scala.inline
    implicit class RequestEntriesResponseMutableBuilder[Self <: RequestEntriesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDataEntries(value: js.Array[DataEntry]): Self = StObject.set(x, "cacheDataEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDataEntriesVarargs(value: DataEntry*): Self = StObject.set(x, "cacheDataEntries", js.Array(value :_*))
      
      @scala.inline
      def setReturnCount(value: Double): Self = StObject.set(x, "returnCount", value.asInstanceOf[js.Any])
    }
  }
}
