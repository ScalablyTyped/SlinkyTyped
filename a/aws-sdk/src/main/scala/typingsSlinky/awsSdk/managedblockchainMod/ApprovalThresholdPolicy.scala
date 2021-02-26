package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalThresholdPolicy extends StObject {
  
  /**
    * The duration from the time that a proposal is created until it expires. If members cast neither the required number of YES votes to approve the proposal nor the number of NO votes required to reject it before the duration expires, the proposal is EXPIRED and ProposalActions are not carried out.
    */
  var ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.native
  
  /**
    * Determines whether the vote percentage must be greater than the ThresholdPercentage or must be greater than or equal to the ThreholdPercentage to be approved.
    */
  var ThresholdComparator: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.ThresholdComparator] = js.native
  
  /**
    * The percentage of votes among all members that must be YES for a proposal to be approved. For example, a ThresholdPercentage value of 50 indicates 50%. The ThresholdComparator determines the precise comparison. If a ThresholdPercentage value of 50 is specified on a network with 10 members, along with a ThresholdComparator value of GREATER_THAN, this indicates that 6 YES votes are required for the proposal to be approved.
    */
  var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.native
}
object ApprovalThresholdPolicy {
  
  @scala.inline
  def apply(): ApprovalThresholdPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalThresholdPolicy]
  }
  
  @scala.inline
  implicit class ApprovalThresholdPolicyMutableBuilder[Self <: ApprovalThresholdPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposalDurationInHours(value: ProposalDurationInt): Self = StObject.set(x, "ProposalDurationInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalDurationInHoursUndefined: Self = StObject.set(x, "ProposalDurationInHours", js.undefined)
    
    @scala.inline
    def setThresholdComparator(value: ThresholdComparator): Self = StObject.set(x, "ThresholdComparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdComparatorUndefined: Self = StObject.set(x, "ThresholdComparator", js.undefined)
    
    @scala.inline
    def setThresholdPercentage(value: ThresholdPercentageInt): Self = StObject.set(x, "ThresholdPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdPercentageUndefined: Self = StObject.set(x, "ThresholdPercentage", js.undefined)
  }
}
