package typingsSlinky.ipp.mod

import typingsSlinky.ipp.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobsRequest extends StObject {
  
  var `operation-attributes-tag`: Limit = js.native
}
object GetJobsRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Limit): GetJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsRequest]
  }
  
  @scala.inline
  implicit class GetJobsRequestMutableBuilder[Self <: GetJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Limit): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
