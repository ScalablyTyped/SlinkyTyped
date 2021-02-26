package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetViolationDetailsResponse extends StObject {
  
  /**
    * Violation detail for a resource.
    */
  var ViolationDetail: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ViolationDetail] = js.native
}
object GetViolationDetailsResponse {
  
  @scala.inline
  def apply(): GetViolationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetViolationDetailsResponse]
  }
  
  @scala.inline
  implicit class GetViolationDetailsResponseMutableBuilder[Self <: GetViolationDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViolationDetail(value: ViolationDetail): Self = StObject.set(x, "ViolationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationDetailUndefined: Self = StObject.set(x, "ViolationDetail", js.undefined)
  }
}
