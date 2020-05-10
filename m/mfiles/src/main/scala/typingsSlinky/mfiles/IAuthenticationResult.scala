package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthenticationResult extends js.Object {
  val Intermediate: IAuthenticationResultIntermediate = js.native
  val ServerFinal: IAuthenticationResultServerFinal = js.native
  val VaultFinal: IAuthenticationResultVaultFinal = js.native
}

object IAuthenticationResult {
  @scala.inline
  def apply(
    Intermediate: IAuthenticationResultIntermediate,
    ServerFinal: IAuthenticationResultServerFinal,
    VaultFinal: IAuthenticationResultVaultFinal
  ): IAuthenticationResult = {
    val __obj = js.Dynamic.literal(Intermediate = Intermediate.asInstanceOf[js.Any], ServerFinal = ServerFinal.asInstanceOf[js.Any], VaultFinal = VaultFinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResult]
  }
  @scala.inline
  implicit class IAuthenticationResultOps[Self <: IAuthenticationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntermediate(value: IAuthenticationResultIntermediate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Intermediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerFinal(value: IAuthenticationResultServerFinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerFinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultFinal(value: IAuthenticationResultVaultFinal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultFinal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

