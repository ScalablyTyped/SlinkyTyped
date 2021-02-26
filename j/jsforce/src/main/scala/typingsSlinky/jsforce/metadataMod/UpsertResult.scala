package typingsSlinky.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsertResult extends StObject {
  
  var created: Boolean = js.native
  
  var fullName: String = js.native
  
  var success: Boolean = js.native
}
object UpsertResult {
  
  @scala.inline
  def apply(created: Boolean, fullName: String, success: Boolean): UpsertResult = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertResult]
  }
  
  @scala.inline
  implicit class UpsertResultMutableBuilder[Self <: UpsertResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
