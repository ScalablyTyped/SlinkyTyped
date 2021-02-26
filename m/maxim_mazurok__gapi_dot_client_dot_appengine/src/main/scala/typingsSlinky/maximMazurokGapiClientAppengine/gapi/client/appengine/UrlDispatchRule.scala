package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlDispatchRule extends StObject {
  
  /** Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*". */
  var domain: js.UndefOr[String] = js.native
  
  /** Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters. */
  var path: js.UndefOr[String] = js.native
  
  /** Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default. */
  var service: js.UndefOr[String] = js.native
}
object UrlDispatchRule {
  
  @scala.inline
  def apply(): UrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDispatchRule]
  }
  
  @scala.inline
  implicit class UrlDispatchRuleMutableBuilder[Self <: UrlDispatchRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
