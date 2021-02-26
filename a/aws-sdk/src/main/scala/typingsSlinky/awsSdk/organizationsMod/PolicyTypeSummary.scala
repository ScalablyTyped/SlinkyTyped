package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTypeSummary extends StObject {
  
  /**
    * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a root or to an OU or account in that root, it must be available in the organization and enabled for that root.
    */
  var Status: js.UndefOr[PolicyTypeStatus] = js.native
  
  /**
    * The name of the policy type.
    */
  var Type: js.UndefOr[PolicyType] = js.native
}
object PolicyTypeSummary {
  
  @scala.inline
  def apply(): PolicyTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeSummary]
  }
  
  @scala.inline
  implicit class PolicyTypeSummaryMutableBuilder[Self <: PolicyTypeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: PolicyTypeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: PolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
