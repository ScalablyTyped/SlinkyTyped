package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByOriginRequestPolicyIdResult extends StObject {
  
  /**
    * A list of distribution IDs.
    */
  var DistributionIdList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.DistributionIdList] = js.native
}
object ListDistributionsByOriginRequestPolicyIdResult {
  
  @scala.inline
  def apply(): ListDistributionsByOriginRequestPolicyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByOriginRequestPolicyIdResult]
  }
  
  @scala.inline
  implicit class ListDistributionsByOriginRequestPolicyIdResultMutableBuilder[Self <: ListDistributionsByOriginRequestPolicyIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionIdList(value: DistributionIdList): Self = StObject.set(x, "DistributionIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionIdListUndefined: Self = StObject.set(x, "DistributionIdList", js.undefined)
  }
}
