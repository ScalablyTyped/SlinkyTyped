package typingsSlinky.googleCloudStorage.bucketMod

import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.list
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v2
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v4
import typingsSlinky.googleCloudStorage.signerMod.Query
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketSignedUrlConfig extends StObject {
  
  var action: list = js.native
  
  var cname: js.UndefOr[String] = js.native
  
  var expires: String | Double | js.Date = js.native
  
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var queryParams: js.UndefOr[Query] = js.native
  
  var version: js.UndefOr[v2 | v4] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object GetBucketSignedUrlConfig {
  
  @scala.inline
  def apply(action: list, expires: String | Double | js.Date): GetBucketSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketSignedUrlConfig]
  }
  
  @scala.inline
  implicit class GetBucketSignedUrlConfigMutableBuilder[Self <: GetBucketSignedUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: list): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresDate(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
    
    @scala.inline
    def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    @scala.inline
    def setVersion(value: v2 | v4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVirtualHostedStyle(value: Boolean): Self = StObject.set(x, "virtualHostedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualHostedStyleUndefined: Self = StObject.set(x, "virtualHostedStyle", js.undefined)
  }
}
