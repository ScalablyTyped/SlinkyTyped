package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.asc
import typingsSlinky.octokitTypes.octokitTypesStrings.created
import typingsSlinky.octokitTypes.octokitTypesStrings.desc
import typingsSlinky.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListAccountsForPlanStubbedEndpoint extends StObject {
  
  /**
    * To return the oldest accounts first, set to `asc`. Can be one of `asc` or `desc`. Ignored without the `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  var plan_id: Double = js.native
  
  /**
    * Sorts the GitHub accounts by the date they were created or last updated. Can be one of `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.native
}
object AppsListAccountsForPlanStubbedEndpoint {
  
  @scala.inline
  def apply(plan_id: Double): AppsListAccountsForPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsForPlanStubbedEndpoint]
  }
  
  @scala.inline
  implicit class AppsListAccountsForPlanStubbedEndpointMutableBuilder[Self <: AppsListAccountsForPlanStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setPlan_id(value: Double): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: created | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
