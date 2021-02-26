package typingsSlinky.atlassianConnectJs.anon

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.CONNECT
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.DELETE
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.GET
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.HEAD
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.OPTIONS
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.PATCH
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.POST
import typingsSlinky.atlassianConnectJs.atlassianConnectJsStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<atlassian-connect-js.AP.RequestOptions> */
@js.native
trait PartialRequestOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[String | js.Object] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any, Unit]
  ] = js.native
  
  var experimental: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[Accept] = js.native
  
  var success: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
  
  var `type`: js.UndefOr[GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH] = js.native
}
object PartialRequestOptions {
  
  @scala.inline
  def apply(): PartialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestOptions]
  }
  
  @scala.inline
  implicit class PartialRequestOptionsMutableBuilder[Self <: PartialRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: (/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setHeaders(value: Accept): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* response */ String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setType(value: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
