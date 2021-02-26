package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServicesRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the services to list. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * The launch type for the services to list.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  
  /**
    * The maximum number of service results returned by ListServices in paginated output. When this parameter is used, ListServices only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListServices request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListServices returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The nextToken value returned from a ListServices request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The scheduling strategy for services to list.
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.native
}
object ListServicesRequest {
  
  @scala.inline
  def apply(): ListServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesRequest]
  }
  
  @scala.inline
  implicit class ListServicesRequestMutableBuilder[Self <: ListServicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSchedulingStrategy(value: SchedulingStrategy): Self = StObject.set(x, "schedulingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingStrategyUndefined: Self = StObject.set(x, "schedulingStrategy", js.undefined)
  }
}
