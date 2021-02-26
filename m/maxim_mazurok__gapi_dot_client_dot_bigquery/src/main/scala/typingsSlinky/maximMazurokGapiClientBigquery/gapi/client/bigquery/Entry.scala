package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends StObject {
  
  /** Number of items being predicted as this label. */
  var itemCount: js.UndefOr[String] = js.native
  
  /** The predicted label. For confidence_threshold > 0, we will also add an entry indicating the number of items under the confidence threshold. */
  var predictedLabel: js.UndefOr[String] = js.native
}
object Entry {
  
  @scala.inline
  def apply(): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setPredictedLabel(value: String): Self = StObject.set(x, "predictedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictedLabelUndefined: Self = StObject.set(x, "predictedLabel", js.undefined)
  }
}
