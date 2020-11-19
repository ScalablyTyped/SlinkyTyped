package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.anon.Action
import typingsSlinky.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFrontRequest extends _CloudFrontRequestResult {
  
  var body: js.UndefOr[Action] = js.native
  
  val clientIp: String = js.native
  
  var headers: CloudFrontHeaders = js.native
  
  val method: String = js.native
  
  var origin: js.UndefOr[CloudFrontOrigin] = js.native
  
  var querystring: String = js.native
  
  var uri: String = js.native
}
object CloudFrontRequest {
  
  @scala.inline
  def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequest]
  }
  
  @scala.inline
  implicit class CloudFrontRequestOps[Self <: CloudFrontRequest] (val x: Self) extends AnyVal {
    
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
    def setClientIp(value: String): Self = this.set("clientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: CloudFrontHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystring(value: String): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Action): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setOrigin(value: CloudFrontOrigin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
