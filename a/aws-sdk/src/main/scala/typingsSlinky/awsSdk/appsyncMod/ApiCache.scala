package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCache extends js.Object {
  /**
    * Caching behavior.    FULL_REQUEST_CACHING: All requests are fully cached.    PER_RESOLVER_CACHING: Individual resovlers that you specify are cached.  
    */
  var apiCachingBehavior: js.UndefOr[ApiCachingBehavior] = js.native
  /**
    * At rest encryption flag for cache. This setting cannot be updated after creation.
    */
  var atRestEncryptionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The cache instance status.    AVAILABLE: The instance is available for use.    CREATING: The instance is currently creating.    DELETING: The instance is currently deleting.    MODIFYING: The instance is currently modifying.    FAILED: The instance has failed creation.  
    */
  var status: js.UndefOr[ApiCacheStatus] = js.native
  /**
    * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
    */
  var transitEncryptionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * TTL in seconds for cache entries. Valid values are between 1 and 3600 seconds.
    */
  var ttl: js.UndefOr[Long] = js.native
  /**
    * The cache instance type.    T2_SMALL: A t2.small instance type.    T2_MEDIUM: A t2.medium instance type.    R4_LARGE: A r4.large instance type.    R4_XLARGE: A r4.xlarge instance type.    R4_2XLARGE: A r4.2xlarge instance type.    R4_4XLARGE: A r4.4xlarge instance type.    R4_8XLARGE: A r4.8xlarge instance type.  
    */
  var `type`: js.UndefOr[ApiCacheType] = js.native
}

object ApiCache {
  @scala.inline
  def apply(): ApiCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCache]
  }
  @scala.inline
  implicit class ApiCacheOps[Self <: ApiCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiCachingBehavior(value: ApiCachingBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCachingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiCachingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiCachingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withAtRestEncryptionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atRestEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtRestEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atRestEncryptionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ApiCacheStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitEncryptionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitEncryptionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ApiCacheType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

