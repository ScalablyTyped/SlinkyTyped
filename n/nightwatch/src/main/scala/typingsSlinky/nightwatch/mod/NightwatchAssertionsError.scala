package typingsSlinky.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchAssertionsError extends StObject {
  
  var message: String = js.native
  
  var name: String = js.native
  
  var showDiff: Boolean = js.native
  
  var stack: String = js.native
}
object NightwatchAssertionsError {
  
  @scala.inline
  def apply(message: String, name: String, showDiff: Boolean, stack: String): NightwatchAssertionsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchAssertionsError]
  }
  
  @scala.inline
  implicit class NightwatchAssertionsErrorMutableBuilder[Self <: NightwatchAssertionsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
