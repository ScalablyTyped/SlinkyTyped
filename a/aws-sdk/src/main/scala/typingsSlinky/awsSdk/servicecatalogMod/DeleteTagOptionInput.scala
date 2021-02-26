package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTagOptionInput extends StObject {
  
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
}
object DeleteTagOptionInput {
  
  @scala.inline
  def apply(Id: TagOptionId): DeleteTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagOptionInput]
  }
  
  @scala.inline
  implicit class DeleteTagOptionInputMutableBuilder[Self <: DeleteTagOptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
