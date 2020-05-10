package typingsSlinky.awsSdkClientGlacierNode.typesVaultLockPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
  }
  
}

