package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClustersRequest extends StObject {
  
  /**
    * One or more filters to limit the items returned in the response. Use the clusterIds filter to return only the specified clusters. Specify clusters by their cluster identifier (ID). Use the vpcIds filter to return only the clusters in the specified virtual private clouds (VPCs). Specify VPCs by their VPC identifier (ID). Use the states filter to return only clusters that match the specified state.
    */
  var Filters: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Filters] = js.native
  
  /**
    * The maximum number of clusters to return in the response. When there are more clusters than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[ClustersMaxSize] = js.native
  
  /**
    * The NextToken value that you received in the previous response. Use this value to get more clusters.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.NextToken] = js.native
}
object DescribeClustersRequest {
  
  @scala.inline
  def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  
  @scala.inline
  implicit class DescribeClustersRequestMutableBuilder[Self <: DescribeClustersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ClustersMaxSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
