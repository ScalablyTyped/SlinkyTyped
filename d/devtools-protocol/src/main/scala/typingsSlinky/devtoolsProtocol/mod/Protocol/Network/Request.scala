package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer-when-downgrade`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`no-referrer`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`origin-when-cross-origin`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`same-origin`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin-when-cross-origin`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`strict-origin`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`unsafe-url`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.origin
import typingsSlinky.devtoolsProtocol.mod.Protocol.Security.MixedContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /**
    * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
    */
  var hasPostData: js.UndefOr[Boolean] = js.native
  
  /**
    * HTTP request headers.
    */
  var headers: Headers = js.native
  
  /**
    * Priority of the resource request at the time request is sent.
    */
  var initialPriority: ResourcePriority = js.native
  
  /**
    * Whether is loaded via link preload.
    */
  var isLinkPreload: js.UndefOr[Boolean] = js.native
  
  /**
    * HTTP request method.
    */
  var method: String = js.native
  
  /**
    * The mixed content type of the request.
    */
  var mixedContentType: js.UndefOr[MixedContentType] = js.native
  
  /**
    * HTTP POST request data.
    */
  var postData: js.UndefOr[String] = js.native
  
  /**
    * Request body elements. This will be converted from base64 to binary
    */
  var postDataEntries: js.UndefOr[js.Array[PostDataEntry]] = js.native
  
  /**
    * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/ (RequestReferrerPolicy enum)
    */
  var referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` = js.native
  
  /**
    * Set for requests when the TrustToken API is used. Contains the parameters
    * passed by the developer (e.g. via "fetch") as understood by the backend.
    */
  var trustTokenParams: js.UndefOr[TrustTokenParams] = js.native
  
  /**
    * Request URL (without fragment).
    */
  var url: String = js.native
  
  /**
    * Fragment of the requested URL starting with hash, if present.
    */
  var urlFragment: js.UndefOr[String] = js.native
}
object Request {
  
  @scala.inline
  def apply(
    headers: Headers,
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasPostData(value: Boolean): Self = StObject.set(x, "hasPostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPostDataUndefined: Self = StObject.set(x, "hasPostData", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPriority(value: ResourcePriority): Self = StObject.set(x, "initialPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkPreload(value: Boolean): Self = StObject.set(x, "isLinkPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkPreloadUndefined: Self = StObject.set(x, "isLinkPreload", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentTypeUndefined: Self = StObject.set(x, "mixedContentType", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataEntries(value: js.Array[PostDataEntry]): Self = StObject.set(x, "postDataEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataEntriesUndefined: Self = StObject.set(x, "postDataEntries", js.undefined)
    
    @scala.inline
    def setPostDataEntriesVarargs(value: PostDataEntry*): Self = StObject.set(x, "postDataEntries", js.Array(value :_*))
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(
      value: `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustTokenParams(value: TrustTokenParams): Self = StObject.set(x, "trustTokenParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustTokenParamsUndefined: Self = StObject.set(x, "trustTokenParams", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragment(value: String): Self = StObject.set(x, "urlFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlFragmentUndefined: Self = StObject.set(x, "urlFragment", js.undefined)
  }
}
