package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLabelsResponse extends StObject {
  
  /**
    * List of labels. Note that each label resource only contains an `id`, `name`, `messageListVisibility`, `labelListVisibility`, and `type`. The labels.get method can fetch additional
    * label details.
    */
  var labels: js.UndefOr[js.Array[Label]] = js.native
}
object ListLabelsResponse {
  
  @scala.inline
  def apply(): ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelsResponse]
  }
  
  @scala.inline
  implicit class ListLabelsResponseMutableBuilder[Self <: ListLabelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
