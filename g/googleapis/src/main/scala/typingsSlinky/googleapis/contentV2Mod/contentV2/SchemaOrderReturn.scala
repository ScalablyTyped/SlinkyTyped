package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderReturn extends js.Object {
  
  /**
    * The actor that created the refund.
    */
  var actor: js.UndefOr[String] = js.native
  
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}
object SchemaOrderReturn {
  
  @scala.inline
  def apply(): SchemaOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReturn]
  }
  
  @scala.inline
  implicit class SchemaOrderReturnOps[Self <: SchemaOrderReturn] (val x: Self) extends AnyVal {
    
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
    def setActor(value: String): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
  }
}
