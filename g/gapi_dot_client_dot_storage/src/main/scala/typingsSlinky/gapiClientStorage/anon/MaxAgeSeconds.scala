package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAgeSeconds extends js.Object {
  
  /** The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses. */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "&#42;" is permitted in the list of methods, and means
    * "any method".
    */
  var method: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of Origins eligible to receive CORS response headers. Note: "&#42;" is permitted in the list of origins, and means "any Origin". */
  var origin: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains. */
  var responseHeader: js.UndefOr[js.Array[String]] = js.native
}
object MaxAgeSeconds {
  
  @scala.inline
  def apply(): MaxAgeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAgeSeconds]
  }
  
  @scala.inline
  implicit class MaxAgeSecondsOps[Self <: MaxAgeSeconds] (val x: Self) extends AnyVal {
    
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
    def setMaxAgeSeconds(value: Double): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: String*): Self = this.set("origin", js.Array(value :_*))
    
    @scala.inline
    def setOrigin(value: js.Array[String]): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setResponseHeaderVarargs(value: String*): Self = this.set("responseHeader", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeader(value: js.Array[String]): Self = this.set("responseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeader: Self = this.set("responseHeader", js.undefined)
  }
}
