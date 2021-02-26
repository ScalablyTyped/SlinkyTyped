package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectorProfilesResponse extends StObject {
  
  /**
    *  Returns information about the connector profiles associated with the flow. 
    */
  var connectorProfileDetails: js.UndefOr[ConnectorProfileDetailList] = js.native
  
  /**
    *  The pagination token for the next page of data. If nextToken=null, this means that all records have been fetched. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeConnectorProfilesResponse {
  
  @scala.inline
  def apply(): DescribeConnectorProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorProfilesResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectorProfilesResponseMutableBuilder[Self <: DescribeConnectorProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileDetails(value: ConnectorProfileDetailList): Self = StObject.set(x, "connectorProfileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileDetailsUndefined: Self = StObject.set(x, "connectorProfileDetails", js.undefined)
    
    @scala.inline
    def setConnectorProfileDetailsVarargs(value: ConnectorProfile*): Self = StObject.set(x, "connectorProfileDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
