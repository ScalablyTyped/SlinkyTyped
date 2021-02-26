package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductEventDetail extends StObject {
  
  /**
    * Optional. The id or name of the associated shopping cart. This id is used to associate multiple items added or present in the cart before purchase. This can only be set for
    * `add-to-cart`, `remove-from-cart`, `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
    */
  var cartId: js.UndefOr[String] = js.native
  
  /** Required for `add-to-list` and `remove-from-list` events. The id or name of the list that the item is being added to or removed from. Other event types should not set this field. */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * Required for `category-page-view` events. Other event types should not set this field. The categories associated with a category page. Category pages include special pages such as
    * sales or promotions. For instance, a special sale page may have the category hierarchy: categories : ["Sales", "2017 Black Friday Deals"].
    */
  var pageCategories: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]] = js.native
  
  /**
    * The main product details related to the event. This field is required for the following event types: * `add-to-cart` * `add-to-list` * `checkout-start` * `detail-page-view` *
    * `purchase-complete` * `refund` * `remove-from-cart` * `remove-from-list` This field is optional for the following event types: * `page-visit` * `shopping-cart-page-view` - note that
    * 'product_details' should be set for this unless the shopping cart is empty. * `search` (highly encouraged) In a `search` event, this field represents the products returned to the
    * end user on the current page (the end user may have not finished broswing the whole page yet). When a new page is returned to the end user, after pagination/filtering/ordering even
    * for the same query, a new SEARCH event with different product_details is desired. The end user may have not finished broswing the whole page yet. This field is not allowed for the
    * following event types: * `category-page-view` * `home-page-view`
    */
  var productDetails: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1ProductDetail]] = js.native
  
  /**
    * Optional. A transaction represents the entire purchase transaction. Required for `purchase-complete` events. Optional for `checkout-start` events. Other event types should not set
    * this field.
    */
  var purchaseTransaction: js.UndefOr[GoogleCloudRecommendationengineV1beta1PurchaseTransaction] = js.native
  
  /** Required for `search` events. Other event types should not set this field. The user's search query as UTF-8 encoded text with a length limit of 5 KiB. */
  var searchQuery: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ProductEventDetail {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductEventDetail]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductEventDetailMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ProductEventDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCartId(value: String): Self = StObject.set(x, "cartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCartIdUndefined: Self = StObject.set(x, "cartId", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setPageCategories(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]): Self = StObject.set(x, "pageCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCategoriesUndefined: Self = StObject.set(x, "pageCategories", js.undefined)
    
    @scala.inline
    def setPageCategoriesVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy*): Self = StObject.set(x, "pageCategories", js.Array(value :_*))
    
    @scala.inline
    def setProductDetails(value: js.Array[GoogleCloudRecommendationengineV1beta1ProductDetail]): Self = StObject.set(x, "productDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDetailsUndefined: Self = StObject.set(x, "productDetails", js.undefined)
    
    @scala.inline
    def setProductDetailsVarargs(value: GoogleCloudRecommendationengineV1beta1ProductDetail*): Self = StObject.set(x, "productDetails", js.Array(value :_*))
    
    @scala.inline
    def setPurchaseTransaction(value: GoogleCloudRecommendationengineV1beta1PurchaseTransaction): Self = StObject.set(x, "purchaseTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTransactionUndefined: Self = StObject.set(x, "purchaseTransaction", js.undefined)
    
    @scala.inline
    def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
  }
}
