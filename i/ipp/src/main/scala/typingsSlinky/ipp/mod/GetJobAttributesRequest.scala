package typingsSlinky.ipp.mod

import typingsSlinky.ipp.anon.Requestedattributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobAttributesRequest extends StObject {
  
  var `operation-attributes-tag`: Requestedattributes = js.native
}
object GetJobAttributesRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Requestedattributes): GetJobAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobAttributesRequest]
  }
  
  @scala.inline
  implicit class GetJobAttributesRequestMutableBuilder[Self <: GetJobAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Requestedattributes): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
