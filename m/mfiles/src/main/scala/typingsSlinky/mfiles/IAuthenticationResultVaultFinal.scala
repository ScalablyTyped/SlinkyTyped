package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthenticationResultVaultFinal extends js.Object {
  val Vault: IVault = js.native
}

object IAuthenticationResultVaultFinal {
  @scala.inline
  def apply(Vault: IVault): IAuthenticationResultVaultFinal = {
    val __obj = js.Dynamic.literal(Vault = Vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultVaultFinal]
  }
  @scala.inline
  implicit class IAuthenticationResultVaultFinalOps[Self <: IAuthenticationResultVaultFinal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVault(value: IVault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

