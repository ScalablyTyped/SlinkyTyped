package typingsSlinky.restifyErrors.mod

import typingsSlinky.verror.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestifyHttpErrorOptions extends Options {
  
  var code: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[js.Any] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object RestifyHttpErrorOptions {
  
  @scala.inline
  def apply(): RestifyHttpErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyHttpErrorOptions]
  }
  
  @scala.inline
  implicit class RestifyHttpErrorOptionsMutableBuilder[Self <: RestifyHttpErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
