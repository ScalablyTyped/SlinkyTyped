package typingsSlinky.pulumiAws.vaultLockMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultLockState extends js.Object {
  /**
    * Boolean whether to permanently apply this Glacier Lock Policy. Once completed, this cannot be undone. If set to `false`, the Glacier Lock Policy remains in a testing mode for 24 hours. After that time, the Glacier Lock Policy is automatically removed by Glacier and the this provider resource will show as needing recreation. Changing this from `false` to `true` will show as resource recreation, which is expected. Changing this from `true` to `false` is not possible unless the Glacier Vault is recreated at the same time.
    */
  val completeLock: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Allow this provider to ignore the error returned when attempting to delete the Glacier Lock Policy. This can be used to delete or recreate the Glacier Vault via this provider, for example, if the Glacier Vault Lock policy permits that action. This should only be used in conjunction with `completeLock` being set to `true`.
    */
  val ignoreDeletionError: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: js.UndefOr[Input[String]] = js.native
}

object VaultLockState {
  @scala.inline
  def apply(): VaultLockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultLockState]
  }
  @scala.inline
  implicit class VaultLockStateOps[Self <: VaultLockState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteLock(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeLock")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDeletionError(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeletionError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDeletionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeletionError")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultName")(js.undefined)
        ret
    }
  }
  
}

