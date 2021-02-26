package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeDBSecurityGroupIngressResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBSecurityGroup] = js.native
}
object RevokeDBSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeDBSecurityGroupIngressResultMutableBuilder[Self <: RevokeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
