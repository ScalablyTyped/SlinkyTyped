package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParameterRequest extends StObject {
  
  /**
    * The name of the parameter to delete.
    */
  var Name: PSParameterName = js.native
}
object DeleteParameterRequest {
  
  @scala.inline
  def apply(Name: PSParameterName): DeleteParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameterRequest]
  }
  
  @scala.inline
  implicit class DeleteParameterRequestMutableBuilder[Self <: DeleteParameterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
