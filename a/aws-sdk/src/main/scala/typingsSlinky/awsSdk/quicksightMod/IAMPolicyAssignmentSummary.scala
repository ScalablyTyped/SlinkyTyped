package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAMPolicyAssignmentSummary extends StObject {
  
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AssignmentStatus] = js.native
}
object IAMPolicyAssignmentSummary {
  
  @scala.inline
  def apply(): IAMPolicyAssignmentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAMPolicyAssignmentSummary]
  }
  
  @scala.inline
  implicit class IAMPolicyAssignmentSummaryMutableBuilder[Self <: IAMPolicyAssignmentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
  }
}
