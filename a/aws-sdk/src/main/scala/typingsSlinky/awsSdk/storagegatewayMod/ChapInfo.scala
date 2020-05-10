package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChapInfo extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
    */
  var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.native
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object ChapInfo {
  @scala.inline
  def apply(): ChapInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChapInfo]
  }
  @scala.inline
  implicit class ChapInfoOps[Self <: ChapInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitiatorName(value: IqnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitiatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitiatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretToAuthenticateInitiator(value: ChapSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToAuthenticateInitiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretToAuthenticateInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToAuthenticateInitiator")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretToAuthenticateTarget(value: ChapSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToAuthenticateTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretToAuthenticateTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToAuthenticateTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(js.undefined)
        ret
    }
  }
  
}

