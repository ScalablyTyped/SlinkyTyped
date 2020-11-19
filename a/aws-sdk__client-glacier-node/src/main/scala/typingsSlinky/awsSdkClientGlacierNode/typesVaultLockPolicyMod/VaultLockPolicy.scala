package typingsSlinky.awsSdkClientGlacierNode.typesVaultLockPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultLockPolicy extends js.Object {
  
  /**
    * <p>The vault lock policy.</p>
    */
  var Policy: js.UndefOr[String] = js.native
}
object VaultLockPolicy {
  
  @scala.inline
  def apply(): VaultLockPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultLockPolicy]
  }
  
  @scala.inline
  implicit class VaultLockPolicyOps[Self <: VaultLockPolicy] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
