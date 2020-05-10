package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecoverySettingType extends js.Object {
  /**
    * The list of RecoveryOptionTypes.
    */
  var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.native
}

object AccountRecoverySettingType {
  @scala.inline
  def apply(): AccountRecoverySettingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRecoverySettingType]
  }
  @scala.inline
  implicit class AccountRecoverySettingTypeOps[Self <: AccountRecoverySettingType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecoveryMechanisms(value: RecoveryMechanismsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryMechanisms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryMechanisms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryMechanisms")(js.undefined)
        ret
    }
  }
  
}

