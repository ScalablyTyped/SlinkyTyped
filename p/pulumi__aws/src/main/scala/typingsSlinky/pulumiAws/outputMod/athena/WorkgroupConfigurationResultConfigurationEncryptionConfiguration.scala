package typingsSlinky.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfigurationResultConfigurationEncryptionConfiguration extends js.Object {
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
    */
  var encryptionOption: js.UndefOr[String] = js.native
  /**
    * For SSE-KMS and CSE-KMS, this is the KMS key Amazon Resource Name (ARN).
    */
  var kmsKeyArn: js.UndefOr[String] = js.native
}

object WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
  @scala.inline
  def apply(): WorkgroupConfigurationResultConfigurationEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]
  }
  @scala.inline
  implicit class WorkgroupConfigurationResultConfigurationEncryptionConfigurationOps[Self <: WorkgroupConfigurationResultConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionOption")(js.undefined)
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

