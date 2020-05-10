package typingsSlinky.awsSdkClientXrayNode.typesEncryptionConfigMod

import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ACTIVE
import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.UPDATING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfig extends js.Object {
  /**
    * <p>The ID of the customer master key (CMK) used for encryption, if applicable.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
  /**
    * <p>The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of the new and old settings.</p>
    */
  var Status: js.UndefOr[UPDATING | ACTIVE | String] = js.native
  /**
    * <p>The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default encryption.</p>
    */
  var Type: js.UndefOr[NONE | KMS | String] = js.native
}

object EncryptionConfig {
  @scala.inline
  def apply(): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfig]
  }
  @scala.inline
  implicit class EncryptionConfigOps[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: UPDATING | ACTIVE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NONE | KMS | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

