package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionList extends js.Object {
  
  /**
    * An array of field-level encryption items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.native
  
  /**
    * The maximum number of elements you want in the response body. 
    */
  var MaxItems: integer = js.native
  
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your configurations where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * The number of field-level encryption items.
    */
  var Quantity: integer = js.native
}
object FieldLevelEncryptionList {
  
  @scala.inline
  def apply(MaxItems: integer, Quantity: integer): FieldLevelEncryptionList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionList]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionListOps[Self <: FieldLevelEncryptionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxItems(value: integer): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: FieldLevelEncryptionSummary*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: FieldLevelEncryptionSummaryList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
