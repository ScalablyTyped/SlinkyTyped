package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyLink extends js.Object {
  
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[String] = js.native
  
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.native
  
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[Boolean] = js.native
  
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Amount] = js.native
  
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.native
  
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[String] = js.native
  
  /**
    * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In
    * LITE projection.)
    */
  var retailPrice: js.UndefOr[Amount] = js.native
  
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE,
    * FOR_RENTAL_ONLY, FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[String] = js.native
}
object BuyLink {
  
  @scala.inline
  def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  
  @scala.inline
  implicit class BuyLinkOps[Self <: BuyLink] (val x: Self) extends AnyVal {
    
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
    def setBuyLink(value: String): Self = this.set("buyLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyLink: Self = this.set("buyLink", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setIsEbook(value: Boolean): Self = this.set("isEbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEbook: Self = this.set("isEbook", js.undefined)
    
    @scala.inline
    def setListPrice(value: Amount): Self = this.set("listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPrice: Self = this.set("listPrice", js.undefined)
    
    @scala.inline
    def setOffersVarargs(value: FinskyOfferType*): Self = this.set("offers", js.Array(value :_*))
    
    @scala.inline
    def setOffers(value: js.Array[FinskyOfferType]): Self = this.set("offers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffers: Self = this.set("offers", js.undefined)
    
    @scala.inline
    def setOnSaleDate(value: String): Self = this.set("onSaleDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSaleDate: Self = this.set("onSaleDate", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: Amount): Self = this.set("retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetailPrice: Self = this.set("retailPrice", js.undefined)
    
    @scala.inline
    def setSaleability(value: String): Self = this.set("saleability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleability: Self = this.set("saleability", js.undefined)
  }
}
