package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkAclResult extends StObject {
  
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkAcl] = js.native
}
object CreateNetworkAclResult {
  
  @scala.inline
  def apply(): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
  
  @scala.inline
  implicit class CreateNetworkAclResultMutableBuilder[Self <: CreateNetworkAclResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAcl(value: NetworkAcl): Self = StObject.set(x, "NetworkAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAclUndefined: Self = StObject.set(x, "NetworkAcl", js.undefined)
  }
}
