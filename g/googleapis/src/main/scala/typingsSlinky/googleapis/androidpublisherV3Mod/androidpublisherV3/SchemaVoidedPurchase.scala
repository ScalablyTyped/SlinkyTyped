package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VoidedPurchase resource indicates a purchase that was either
  * canceled/refunded/charged-back.
  */
@js.native
trait SchemaVoidedPurchase extends js.Object {
  
  /**
    * This kind represents a voided purchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The time at which the purchase was made, in milliseconds since the epoch
    * (Jan 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * The token that was generated when a purchase was made. This uniquely
    * identifies a purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.native
  
  /**
    * The time at which the purchase was canceled/refunded/charged-back, in
    * milliseconds since the epoch (Jan 1, 1970).
    */
  var voidedTimeMillis: js.UndefOr[String] = js.native
}
object SchemaVoidedPurchase {
  
  @scala.inline
  def apply(): SchemaVoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchase]
  }
  
  @scala.inline
  implicit class SchemaVoidedPurchaseOps[Self <: SchemaVoidedPurchase] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = this.set("purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseTimeMillis: Self = this.set("purchaseTimeMillis", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseToken: Self = this.set("purchaseToken", js.undefined)
    
    @scala.inline
    def setVoidedTimeMillis(value: String): Self = this.set("voidedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedTimeMillis: Self = this.set("voidedTimeMillis", js.undefined)
  }
}
