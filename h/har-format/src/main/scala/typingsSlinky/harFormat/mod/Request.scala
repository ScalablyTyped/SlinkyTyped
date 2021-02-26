package typingsSlinky.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /**
    * Size of the request body (POST data payload) in bytes.
    *
    * Set to `-1` if the info is not available.
    */
  var bodySize: Double = js.native
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /** List of cookie objects. */
  var cookies: js.Array[Cookie] = js.native
  
  /** List of header objects. */
  var headers: js.Array[Header] = js.native
  
  /**
    * Total number of bytes from the start of the HTTP request message until
    * (and including) the double CRLF before the body.
    *
    * Set to `-1` if the info is not available.
    */
  var headersSize: Double = js.native
  
  /** Request HTTP Version. */
  var httpVersion: String = js.native
  
  /** Request method (`GET`, `POST`, ...). */
  var method: String = js.native
  
  /** Posted data info. */
  var postData: js.UndefOr[PostData] = js.native
  
  /** List of query parameter objects. */
  var queryString: js.Array[QueryString] = js.native
  
  /** Absolute URL of the request (fragments are not included). */
  var url: String = js.native
}
object Request {
  
  @scala.inline
  def apply(
    bodySize: Double,
    cookies: js.Array[Cookie],
    headers: js.Array[Header],
    headersSize: Double,
    httpVersion: String,
    method: String,
    queryString: js.Array[QueryString],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersSize(value: Double): Self = StObject.set(x, "headersSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostData(value: PostData): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setQueryString(value: js.Array[QueryString]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringVarargs(value: QueryString*): Self = StObject.set(x, "queryString", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
