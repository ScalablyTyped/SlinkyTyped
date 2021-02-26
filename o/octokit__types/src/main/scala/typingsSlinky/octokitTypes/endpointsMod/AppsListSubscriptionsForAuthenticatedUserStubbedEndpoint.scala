package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint extends StObject {
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
}
object AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint {
  
  @scala.inline
  def apply(): AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint]
  }
  
  @scala.inline
  implicit class AppsListSubscriptionsForAuthenticatedUserStubbedEndpointMutableBuilder[Self <: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
