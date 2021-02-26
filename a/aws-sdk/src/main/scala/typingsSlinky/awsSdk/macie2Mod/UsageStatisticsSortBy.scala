package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageStatisticsSortBy extends StObject {
  
  /**
    * The field to sort the results by.
    */
  var key: js.UndefOr[UsageStatisticsSortKey] = js.native
  
  /**
    * The sort order to apply to the results, based on the value for the field specified by the key property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}
object UsageStatisticsSortBy {
  
  @scala.inline
  def apply(): UsageStatisticsSortBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsSortBy]
  }
  
  @scala.inline
  implicit class UsageStatisticsSortByMutableBuilder[Self <: UsageStatisticsSortBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: UsageStatisticsSortKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
