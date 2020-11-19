package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByOriginRequestPolicyIdResult extends js.Object {
  
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
  implicit class ListDistributionsByOriginRequestPolicyIdResultOps[Self <: ListDistributionsByOriginRequestPolicyIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistributionIdList(value: DistributionIdList): Self = this.set("DistributionIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionIdList: Self = this.set("DistributionIdList", js.undefined)
  }
}
