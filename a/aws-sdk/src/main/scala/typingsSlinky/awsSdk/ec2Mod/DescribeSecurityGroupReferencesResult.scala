package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityGroupReferencesResult extends StObject {
  
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.native
}
object DescribeSecurityGroupReferencesResult {
  
  @scala.inline
  def apply(): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
  
  @scala.inline
  implicit class DescribeSecurityGroupReferencesResultMutableBuilder[Self <: DescribeSecurityGroupReferencesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupReferenceSet(value: SecurityGroupReferences): Self = StObject.set(x, "SecurityGroupReferenceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupReferenceSetUndefined: Self = StObject.set(x, "SecurityGroupReferenceSet", js.undefined)
    
    @scala.inline
    def setSecurityGroupReferenceSetVarargs(value: SecurityGroupReference*): Self = StObject.set(x, "SecurityGroupReferenceSet", js.Array(value :_*))
  }
}
