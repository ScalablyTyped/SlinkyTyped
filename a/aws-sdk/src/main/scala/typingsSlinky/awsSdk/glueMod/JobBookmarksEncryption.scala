package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobBookmarksEncryption extends js.Object {
  /**
    * The encryption mode to use for job bookmarks data.
    */
  var JobBookmarksEncryptionMode: js.UndefOr[typingsSlinky.awsSdk.glueMod.JobBookmarksEncryptionMode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typingsSlinky.awsSdk.glueMod.KmsKeyArn] = js.native
}

object JobBookmarksEncryption {
  @scala.inline
  def apply(): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
  @scala.inline
  implicit class JobBookmarksEncryptionOps[Self <: JobBookmarksEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobBookmarksEncryptionMode(value: JobBookmarksEncryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarksEncryptionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobBookmarksEncryptionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobBookmarksEncryptionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyArn(value: KmsKeyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyArn")(js.undefined)
        ret
    }
  }
  
}

