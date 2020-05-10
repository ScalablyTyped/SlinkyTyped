package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption extends js.Object {
  /**
    * Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
    */
  var jobBookmarksEncryptionMode: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
}

object SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption {
  @scala.inline
  def apply(): SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption]
  }
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionOps[Self <: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobBookmarksEncryptionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobBookmarksEncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBookmarksEncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobBookmarksEncryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyArn")(js.undefined)
        ret
    }
  }
  
}

