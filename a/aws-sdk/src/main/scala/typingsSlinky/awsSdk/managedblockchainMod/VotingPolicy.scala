package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VotingPolicy extends StObject {
  
  /**
    * Defines the rules for the network for voting on proposals, such as the percentage of YES votes required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals and is specified when the network is created.
    */
  var ApprovalThresholdPolicy: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.ApprovalThresholdPolicy] = js.native
}
object VotingPolicy {
  
  @scala.inline
  def apply(): VotingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VotingPolicy]
  }
  
  @scala.inline
  implicit class VotingPolicyMutableBuilder[Self <: VotingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalThresholdPolicy(value: ApprovalThresholdPolicy): Self = StObject.set(x, "ApprovalThresholdPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalThresholdPolicyUndefined: Self = StObject.set(x, "ApprovalThresholdPolicy", js.undefined)
  }
}
