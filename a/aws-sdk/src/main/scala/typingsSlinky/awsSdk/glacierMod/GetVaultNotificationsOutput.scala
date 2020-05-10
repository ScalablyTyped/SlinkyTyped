package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultNotificationsOutput extends js.Object {
  /**
    * Returns the notification configuration set on the vault.
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.native
}

object GetVaultNotificationsOutput {
  @scala.inline
  def apply(): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
  @scala.inline
  implicit class GetVaultNotificationsOutputOps[Self <: GetVaultNotificationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVaultNotificationConfig(value: VaultNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultNotificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultNotificationConfig")(js.undefined)
        ret
    }
  }
  
}

