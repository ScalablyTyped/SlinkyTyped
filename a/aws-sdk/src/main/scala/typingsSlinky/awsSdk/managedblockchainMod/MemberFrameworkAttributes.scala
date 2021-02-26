package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFrameworkAttributes extends StObject {
  
  /**
    * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[MemberFabricAttributes] = js.native
}
object MemberFrameworkAttributes {
  
  @scala.inline
  def apply(): MemberFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFrameworkAttributes]
  }
  
  @scala.inline
  implicit class MemberFrameworkAttributesMutableBuilder[Self <: MemberFrameworkAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: MemberFabricAttributes): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
