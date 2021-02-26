package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheKeyPolicy extends StObject {
  
  /** If true, requests to different hosts will be cached separately. */
  var includeHost: js.UndefOr[Boolean] = js.native
  
  /** If true, http and https requests will be cached separately. */
  var includeProtocol: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be
    * included. If false, the query string will be excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.native
  
  /**
    * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
    * '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
    * '=' will be percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.native
}
object CacheKeyPolicy {
  
  @scala.inline
  def apply(): CacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheKeyPolicy]
  }
  
  @scala.inline
  implicit class CacheKeyPolicyMutableBuilder[Self <: CacheKeyPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeHost(value: Boolean): Self = StObject.set(x, "includeHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHostUndefined: Self = StObject.set(x, "includeHost", js.undefined)
    
    @scala.inline
    def setIncludeProtocol(value: Boolean): Self = StObject.set(x, "includeProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeProtocolUndefined: Self = StObject.set(x, "includeProtocol", js.undefined)
    
    @scala.inline
    def setIncludeQueryString(value: Boolean): Self = StObject.set(x, "includeQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeQueryStringUndefined: Self = StObject.set(x, "includeQueryString", js.undefined)
    
    @scala.inline
    def setQueryStringBlacklist(value: js.Array[String]): Self = StObject.set(x, "queryStringBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringBlacklistUndefined: Self = StObject.set(x, "queryStringBlacklist", js.undefined)
    
    @scala.inline
    def setQueryStringBlacklistVarargs(value: String*): Self = StObject.set(x, "queryStringBlacklist", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringWhitelist(value: js.Array[String]): Self = StObject.set(x, "queryStringWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringWhitelistUndefined: Self = StObject.set(x, "queryStringWhitelist", js.undefined)
    
    @scala.inline
    def setQueryStringWhitelistVarargs(value: String*): Self = StObject.set(x, "queryStringWhitelist", js.Array(value :_*))
  }
}
