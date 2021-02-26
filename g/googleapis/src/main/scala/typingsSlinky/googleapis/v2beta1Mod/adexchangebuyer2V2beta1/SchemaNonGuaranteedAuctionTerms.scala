package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Private Auctions. Note that Private Auctions can be created only
  * by the seller, but they can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedAuctionTerms extends StObject {
  
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction.
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricesPerBuyer: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}
object SchemaNonGuaranteedAuctionTerms {
  
  @scala.inline
  def apply(): SchemaNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class SchemaNonGuaranteedAuctionTermsMutableBuilder[Self <: SchemaNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOptimizePrivateAuction(value: Boolean): Self = StObject.set(x, "autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOptimizePrivateAuctionUndefined: Self = StObject.set(x, "autoOptimizePrivateAuction", js.undefined)
    
    @scala.inline
    def setReservePricesPerBuyer(value: js.Array[SchemaPricePerBuyer]): Self = StObject.set(x, "reservePricesPerBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservePricesPerBuyerUndefined: Self = StObject.set(x, "reservePricesPerBuyer", js.undefined)
    
    @scala.inline
    def setReservePricesPerBuyerVarargs(value: SchemaPricePerBuyer*): Self = StObject.set(x, "reservePricesPerBuyer", js.Array(value :_*))
  }
}
