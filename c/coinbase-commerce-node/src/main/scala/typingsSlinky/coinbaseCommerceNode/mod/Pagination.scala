package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination response.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
/* Inlined parent std.Pick<coinbase-commerce-node.coinbase-commerce-node.PaginationRequest, 'order' | 'starting_after' | 'ending_before' | 'limit'> */
@js.native
trait Pagination extends StObject {
  
  var cursor_range: js.Tuple2[String, String] = js.native
  
  var ending_before: js.UndefOr[String | Null] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var next_uri: Null | String = js.native
  
  var order: js.UndefOr[asc | desc] = js.native
  
  var previous_uri: Null | String = js.native
  
  var starting_after: js.UndefOr[String | Null] = js.native
  
  var total: Double = js.native
  
  var yielded: Double = js.native
}
object Pagination {
  
  @scala.inline
  def apply(cursor_range: js.Tuple2[String, String], total: Double, yielded: Double): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], yielded = yielded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  
  @scala.inline
  implicit class PaginationMutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor_range(value: js.Tuple2[String, String]): Self = StObject.set(x, "cursor_range", value.asInstanceOf[js.Any])
    
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
    def setNext_uri(value: String): Self = StObject.set(x, "next_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_uriNull: Self = StObject.set(x, "next_uri", null)
    
    @scala.inline
    def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPrevious_uri(value: String): Self = StObject.set(x, "previous_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_uriNull: Self = StObject.set(x, "previous_uri", null)
    
    @scala.inline
    def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting_afterNull: Self = StObject.set(x, "starting_after", null)
    
    @scala.inline
    def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYielded(value: Double): Self = StObject.set(x, "yielded", value.asInstanceOf[js.Any])
  }
}
