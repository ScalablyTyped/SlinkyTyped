package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption configuration for Amazon CloudWatch.
    */
  var CloudWatchEncryption: js.UndefOr[typingsSlinky.awsSdk.glueMod.CloudWatchEncryption] = js.native
  /**
    * The encryption configuration for job bookmarks.
    */
  var JobBookmarksEncryption: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobBookmarksEncryption] = js.native
  /**
    * The encryption configuration for Amazon Simple Storage Service (Amazon S3) data.
    */
  var S3Encryption: js.UndefOr[S3EncryptionList] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchEncryption(value: CloudWatchEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withJobBookmarksEncryption(value: JobBookmarksEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarksEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBookmarksEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarksEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Encryption(value: S3EncryptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Encryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Encryption")(js.undefined)
        ret
    }
  }
  
}

