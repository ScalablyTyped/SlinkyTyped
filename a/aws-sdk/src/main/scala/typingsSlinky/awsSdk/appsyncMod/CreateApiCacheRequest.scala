package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiCacheRequest extends StObject {
  
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resolvers that you specify are cached.  
    */
  var apiCachingBehavior: ApiCachingBehavior = js.native
  
  /**
    * The GraphQL API Id.
    */
  var apiId: String = js.native
  
  /**
    * At rest encryption flag for cache. This setting cannot be updated after creation.
    */
  var atRestEncryptionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
    */
  var transitEncryptionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * TTL in seconds for cache entries. Valid values are between 1 and 3600 seconds.
    */
  var ttl: Long = js.native
  
  /**
    * The cache instance type. Valid values are     SMALL     MEDIUM     LARGE     XLARGE     LARGE_2X     LARGE_4X     LARGE_8X (not available in all regions)    LARGE_12X    Historically, instance types were identified by an EC2-style value. As of July 2020, this is deprecated, and the generic identifiers above should be used. The following legacy instance types are available, but their use is discouraged:    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: ApiCacheType = js.native
}
object CreateApiCacheRequest {
  
  @scala.inline
  def apply(apiCachingBehavior: ApiCachingBehavior, apiId: String, ttl: Long, `type`: ApiCacheType): CreateApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiCachingBehavior = apiCachingBehavior.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiCacheRequest]
  }
  
  @scala.inline
  implicit class CreateApiCacheRequestMutableBuilder[Self <: CreateApiCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiCachingBehavior(value: ApiCachingBehavior): Self = StObject.set(x, "apiCachingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: Boolean): Self = StObject.set(x, "atRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "atRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: Boolean): Self = StObject.set(x, "transitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "transitEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setTtl(value: Long): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApiCacheType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
