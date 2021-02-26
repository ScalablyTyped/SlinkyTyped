package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.delete_
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.read
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.resumable
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v2
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v4
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.write
import typingsSlinky.googleCloudStorage.signerMod.Query
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSignedUrlConfig extends StObject {
  
  var accessibleAt: js.UndefOr[String | Double | js.Date] = js.native
  
  var action: read | write | delete_ | resumable = js.native
  
  var cname: js.UndefOr[String] = js.native
  
  var contentMd5: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var expires: String | Double | js.Date = js.native
  
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var promptSaveAs: js.UndefOr[String] = js.native
  
  var queryParams: js.UndefOr[Query] = js.native
  
  var responseDisposition: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[v2 | v4] = js.native
  
  var virtualHostedStyle: js.UndefOr[Boolean] = js.native
}
object GetSignedUrlConfig {
  
  @scala.inline
  def apply(action: read | write | delete_ | resumable, expires: String | Double | js.Date): GetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedUrlConfig]
  }
  
  @scala.inline
  implicit class GetSignedUrlConfigMutableBuilder[Self <: GetSignedUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibleAt(value: String | Double | js.Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleAtDate(value: js.Date): Self = StObject.set(x, "accessibleAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleAtUndefined: Self = StObject.set(x, "accessibleAt", js.undefined)
    
    @scala.inline
    def setAction(value: read | write | delete_ | resumable): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setContentMd5(value: String): Self = StObject.set(x, "contentMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMd5Undefined: Self = StObject.set(x, "contentMd5", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setExpires(value: String | Double | js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresDate(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "extensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHeadersUndefined: Self = StObject.set(x, "extensionHeaders", js.undefined)
    
    @scala.inline
    def setPromptSaveAs(value: String): Self = StObject.set(x, "promptSaveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptSaveAsUndefined: Self = StObject.set(x, "promptSaveAs", js.undefined)
    
    @scala.inline
    def setQueryParams(value: Query): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    @scala.inline
    def setResponseDisposition(value: String): Self = StObject.set(x, "responseDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDispositionUndefined: Self = StObject.set(x, "responseDisposition", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
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
