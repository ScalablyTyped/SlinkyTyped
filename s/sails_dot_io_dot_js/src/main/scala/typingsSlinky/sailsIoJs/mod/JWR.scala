package typingsSlinky.sailsIoJs.mod

import typingsSlinky.sailsIoJs.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWR extends js.Object {
  
  var body: js.Any = js.native
  
  var error: js.UndefOr[js.Error] = js.native
  
  var headers: Headers = js.native
  
  def pipe(): js.Error = js.native
  
  var statusCode: Double = js.native
  
  def toPOJO(): Body = js.native
}
object JWR {
  
  @scala.inline
  def apply(body: js.Any, headers: Headers, pipe: () => js.Error, statusCode: Double, toPOJO: () => Body): JWR = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pipe = js.Any.fromFunction0(pipe), statusCode = statusCode.asInstanceOf[js.Any], toPOJO = js.Any.fromFunction0(toPOJO))
    __obj.asInstanceOf[JWR]
  }
  
  @scala.inline
  implicit class JWROps[Self <: JWR] (val x: Self) extends AnyVal {
    
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: () => js.Error): Self = this.set("pipe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPOJO(value: () => Body): Self = this.set("toPOJO", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
