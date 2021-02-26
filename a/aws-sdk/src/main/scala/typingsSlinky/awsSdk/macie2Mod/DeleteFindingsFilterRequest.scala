package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFindingsFilterRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string = js.native
}
object DeleteFindingsFilterRequest {
  
  @scala.inline
  def apply(id: string): DeleteFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFindingsFilterRequest]
  }
  
  @scala.inline
  implicit class DeleteFindingsFilterRequestMutableBuilder[Self <: DeleteFindingsFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
