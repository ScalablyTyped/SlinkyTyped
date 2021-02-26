package typingsSlinky.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSurroundingTextParameters extends StObject {
  
  /** ID of the context where the surrounding text will be deleted. */
  var contextID: Double = js.native
  
  /** ID of the engine receiving the event. */
  var engineID: String = js.native
  
  /** The number of characters to be deleted */
  var length: Double = js.native
  
  /** The offset from the caret position where deletion will start. This value can be negative. */
  var offset: Double = js.native
}
object DeleteSurroundingTextParameters {
  
  @scala.inline
  def apply(contextID: Double, engineID: String, length: Double, offset: Double): DeleteSurroundingTextParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], engineID = engineID.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSurroundingTextParameters]
  }
  
  @scala.inline
  implicit class DeleteSurroundingTextParametersMutableBuilder[Self <: DeleteSurroundingTextParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineID(value: String): Self = StObject.set(x, "engineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
