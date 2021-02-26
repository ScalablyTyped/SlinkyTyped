package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldValue extends StObject {
  
  /** ID of this creative field value. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValue". */
  var kind: js.UndefOr[String] = js.native
  
  /** Value of this creative field value. It needs to be less than 256 characters in length and unique per creative field. */
  var value: js.UndefOr[String] = js.native
}
object CreativeFieldValue {
  
  @scala.inline
  def apply(): CreativeFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldValue]
  }
  
  @scala.inline
  implicit class CreativeFieldValueMutableBuilder[Self <: CreativeFieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
