package typingsSlinky.postmanCollection.anon

import typingsSlinky.node.Buffer
import typingsSlinky.postmanCollection.mod.HeaderDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: String | Buffer | js.typedarray.Uint8Array = js.native
  
  var elapsedTime: Double = js.native
  
  var headers: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: js.UndefOr[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(body: String | Buffer | js.typedarray.Uint8Array, elapsedTime: Double, statusCode: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String | Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Array[HeaderDefinition]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HeaderDefinition*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
