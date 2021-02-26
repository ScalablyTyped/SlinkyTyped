package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1AddVisibilityLabelsResponse extends StObject {
  
  /** The updated set of visibility labels for this consumer on this service. */
  var labels: js.UndefOr[js.Array[String]] = js.native
}
object V1AddVisibilityLabelsResponse {
  
  @scala.inline
  def apply(): V1AddVisibilityLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1AddVisibilityLabelsResponse]
  }
  
  @scala.inline
  implicit class V1AddVisibilityLabelsResponseMutableBuilder[Self <: V1AddVisibilityLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
