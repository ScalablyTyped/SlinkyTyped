package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPRequest extends StObject {
  
  /**
    * The IP address that the request originated from. If the WebACL is associated with a CloudFront distribution, this is the value of one of the following fields in CloudFront access logs:    c-ip, if the viewer did not use an HTTP proxy or a load balancer to send the request    x-forwarded-for, if the viewer did use an HTTP proxy or a load balancer to send the request  
    */
  var ClientIP: js.UndefOr[IPString] = js.native
  
  /**
    * The two-letter country code for the country that the request originated from. For a current list of country codes, see the Wikipedia entry ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[typingsSlinky.awsSdk.wafMod.Country] = js.native
  
  /**
    * The HTTP version specified in the sampled web request, for example, HTTP/1.1.
    */
  var HTTPVersion: js.UndefOr[typingsSlinky.awsSdk.wafMod.HTTPVersion] = js.native
  
  /**
    * A complex type that contains two values for each header in the sampled web request: the name of the header and the value of the header.
    */
  var Headers: js.UndefOr[HTTPHeaders] = js.native
  
  /**
    * The HTTP method specified in the sampled web request. CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT. 
    */
  var Method: js.UndefOr[HTTPMethod] = js.native
  
  /**
    * The part of a web request that identifies the resource, for example, /images/daily-ad.jpg.
    */
  var URI: js.UndefOr[URIString] = js.native
}
object HTTPRequest {
  
  @scala.inline
  def apply(): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPRequest]
  }
  
  @scala.inline
  implicit class HTTPRequestMutableBuilder[Self <: HTTPRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientIP(value: IPString): Self = StObject.set(x, "ClientIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIPUndefined: Self = StObject.set(x, "ClientIP", js.undefined)
    
    @scala.inline
    def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setHTTPVersion(value: HTTPVersion): Self = StObject.set(x, "HTTPVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPVersionUndefined: Self = StObject.set(x, "HTTPVersion", js.undefined)
    
    @scala.inline
    def setHeaders(value: HTTPHeaders): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HTTPHeader*): Self = StObject.set(x, "Headers", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: HTTPMethod): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "Method", js.undefined)
    
    @scala.inline
    def setURI(value: URIString): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
