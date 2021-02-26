package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filtering extends StObject {
  
  var filtering: js.UndefOr[Boolean] = js.native
  
  var groupPaging: js.UndefOr[Boolean] = js.native
  
  var grouping: js.UndefOr[Boolean] = js.native
  
  var paging: js.UndefOr[Boolean] = js.native
  
  var sorting: js.UndefOr[Boolean] = js.native
  
  var summary: js.UndefOr[Boolean] = js.native
}
object Filtering {
  
  @scala.inline
  def apply(): Filtering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filtering]
  }
  
  @scala.inline
  implicit class FilteringMutableBuilder[Self <: Filtering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiltering(value: Boolean): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    @scala.inline
    def setGroupPaging(value: Boolean): Self = StObject.set(x, "groupPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupPagingUndefined: Self = StObject.set(x, "groupPaging", js.undefined)
    
    @scala.inline
    def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setSorting(value: Boolean): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
