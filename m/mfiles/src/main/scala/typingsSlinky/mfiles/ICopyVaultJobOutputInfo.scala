package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyVaultJobOutputInfo extends js.Object {
  val VaultProperties: IVaultProperties = js.native
}

object ICopyVaultJobOutputInfo {
  @scala.inline
  def apply(VaultProperties: IVaultProperties): ICopyVaultJobOutputInfo = {
    val __obj = js.Dynamic.literal(VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJobOutputInfo]
  }
  @scala.inline
  implicit class ICopyVaultJobOutputInfoOps[Self <: ICopyVaultJobOutputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVaultProperties(value: IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

