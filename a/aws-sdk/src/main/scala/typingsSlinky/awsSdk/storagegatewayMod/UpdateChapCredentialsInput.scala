package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName = js.native
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateInitiator: ChapSecret = js.native
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client). Byte constraints: Minimum bytes of 12. Maximum bytes of 16.  The secret key must be between 12 and 16 bytes when encoded in UTF-8. 
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return the TargetARN for specified VolumeARN.
    */
  var TargetARN: typingsSlinky.awsSdk.storagegatewayMod.TargetARN = js.native
}

object UpdateChapCredentialsInput {
  @scala.inline
  def apply(InitiatorName: IqnName, SecretToAuthenticateInitiator: ChapSecret, TargetARN: TargetARN): UpdateChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], SecretToAuthenticateInitiator = SecretToAuthenticateInitiator.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChapCredentialsInput]
  }
  @scala.inline
  implicit class UpdateChapCredentialsInputOps[Self <: UpdateChapCredentialsInput] (val x: Self) extends AnyVal {
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
    def withSecretToAuthenticateInitiator(value: ChapSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToAuthenticateInitiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
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
  }
  
}

