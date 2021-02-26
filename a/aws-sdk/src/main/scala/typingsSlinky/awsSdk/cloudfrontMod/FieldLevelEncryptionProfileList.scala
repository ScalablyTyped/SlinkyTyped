package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionProfileList extends StObject {
  
  /**
    * The field-level encryption profile items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.native
  
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: integer = js.native
  
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your profiles where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * The number of field-level encryption profiles.
    */
  var Quantity: integer = js.native
}
object FieldLevelEncryptionProfileList {
  
  @scala.inline
  def apply(MaxItems: integer, Quantity: integer): FieldLevelEncryptionProfileList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileList]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionProfileListMutableBuilder[Self <: FieldLevelEncryptionProfileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: FieldLevelEncryptionProfileSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FieldLevelEncryptionProfileSummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
