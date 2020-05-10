package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRestOptions extends js.Object {
  /**
    * Specifies the option to enable Encryption At Rest.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    *  Specifies the KMS Key ID for Encryption At Rest options.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.esMod.KmsKeyId] = js.native
}

object EncryptionAtRestOptions {
  @scala.inline
  def apply(): EncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAtRestOptions]
  }
  @scala.inline
  implicit class EncryptionAtRestOptionsOps[Self <: EncryptionAtRestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
  }
  
}

