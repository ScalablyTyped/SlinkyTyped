package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationEncryptionConfiguration extends js.Object {
  var cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption = js.native
  var jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption = js.native
  /**
    * A `s3Encryption ` block as described below, which contains encryption configuration for S3 data.
    */
  var s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption = js.native
}

object SecurityConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(
    cloudwatchEncryption: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption,
    jobBookmarksEncryption: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption,
    s3Encryption: SecurityConfigurationEncryptionConfigurationS3Encryption
  ): SecurityConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchEncryption = cloudwatchEncryption.asInstanceOf[js.Any], jobBookmarksEncryption = jobBookmarksEncryption.asInstanceOf[js.Any], s3Encryption = s3Encryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationEncryptionConfiguration]
  }
  @scala.inline
  implicit class SecurityConfigurationEncryptionConfigurationOps[Self <: SecurityConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudwatchEncryption(value: SecurityConfigurationEncryptionConfigurationCloudwatchEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobBookmarksEncryption(value: SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobBookmarksEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Encryption(value: SecurityConfigurationEncryptionConfigurationS3Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Encryption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

