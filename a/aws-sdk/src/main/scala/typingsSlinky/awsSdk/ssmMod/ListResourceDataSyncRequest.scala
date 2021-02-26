package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceDataSyncRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * View a list of resource data syncs according to the sync type. Specify SyncToDestination to view resource data syncs that synchronize data to an Amazon S3 bucket. Specify SyncFromSource to view resource data syncs from AWS Organizations or from multiple AWS Regions.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}
object ListResourceDataSyncRequest {
  
  @scala.inline
  def apply(): ListResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDataSyncRequest]
  }
  
  @scala.inline
  implicit class ListResourceDataSyncRequestMutableBuilder[Self <: ListResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTypeUndefined: Self = StObject.set(x, "SyncType", js.undefined)
  }
}
