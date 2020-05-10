package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTakeoverActionsType extends js.Object {
  /**
    * Action to take for a high risk.
    */
  var HighAction: js.UndefOr[AccountTakeoverActionType] = js.native
  /**
    * Action to take for a low risk.
    */
  var LowAction: js.UndefOr[AccountTakeoverActionType] = js.native
  /**
    * Action to take for a medium risk.
    */
  var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.native
}

object AccountTakeoverActionsType {
  @scala.inline
  def apply(): AccountTakeoverActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTakeoverActionsType]
  }
  @scala.inline
  implicit class AccountTakeoverActionsTypeOps[Self <: AccountTakeoverActionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighAction(value: AccountTakeoverActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLowAction(value: AccountTakeoverActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowAction")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumAction(value: AccountTakeoverActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumAction")(js.undefined)
        ret
    }
  }
  
}

