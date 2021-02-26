package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination request.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
@js.native
trait PaginationRequest extends StObject {
  
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var ending_before: js.UndefOr[String | Null] = js.native
  
  /**
    * Number of results per call.
    *
    * Accepted values: 0 - 100
    * Default: 25
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Order of resources in the response.
    *
    * default: desc
    */
  var order: js.UndefOr[asc | desc] = js.native
  
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var starting_after: js.UndefOr[String | Null] = js.native
}
object PaginationRequest {
  
  @scala.inline
  def apply(): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationRequest]
  }
  
  @scala.inline
  implicit class PaginationRequestMutableBuilder[Self <: PaginationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnding_beforeNull: Self = StObject.set(x, "ending_before", null)
    
    @scala.inline
    def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting_afterNull: Self = StObject.set(x, "starting_after", null)
    
    @scala.inline
    def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
  }
}
