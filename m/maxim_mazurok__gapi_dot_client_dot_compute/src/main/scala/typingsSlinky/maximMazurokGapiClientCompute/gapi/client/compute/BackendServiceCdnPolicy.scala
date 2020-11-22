package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServiceCdnPolicy extends js.Object {
  
  /** The CacheKeyPolicy for this CdnPolicy. */
  var cacheKeyPolicy: js.UndefOr[CacheKeyPolicy] = js.native
  
  /**
    * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to
    * 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]"
    * header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
    */
  var signedUrlCacheMaxAgeSec: js.UndefOr[String] = js.native
  
  /** [Output Only] Names of the keys for signing request URLs. */
  var signedUrlKeyNames: js.UndefOr[js.Array[String]] = js.native
}
object BackendServiceCdnPolicy {
  
  @scala.inline
  def apply(): BackendServiceCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceCdnPolicy]
  }
  
  @scala.inline
  implicit class BackendServiceCdnPolicyOps[Self <: BackendServiceCdnPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheKeyPolicy(value: CacheKeyPolicy): Self = this.set("cacheKeyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheKeyPolicy: Self = this.set("cacheKeyPolicy", js.undefined)
    
    @scala.inline
    def setSignedUrlCacheMaxAgeSec(value: String): Self = this.set("signedUrlCacheMaxAgeSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUrlCacheMaxAgeSec: Self = this.set("signedUrlCacheMaxAgeSec", js.undefined)
    
    @scala.inline
    def setSignedUrlKeyNamesVarargs(value: String*): Self = this.set("signedUrlKeyNames", js.Array(value :_*))
    
    @scala.inline
    def setSignedUrlKeyNames(value: js.Array[String]): Self = this.set("signedUrlKeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUrlKeyNames: Self = this.set("signedUrlKeyNames", js.undefined)
  }
}
