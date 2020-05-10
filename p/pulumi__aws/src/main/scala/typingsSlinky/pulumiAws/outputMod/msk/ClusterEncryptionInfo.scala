package typingsSlinky.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfo extends js.Object {
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: String = js.native
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[ClusterEncryptionInfoEncryptionInTransit] = js.native
}

object ClusterEncryptionInfo {
  @scala.inline
  def apply(encryptionAtRestKmsKeyArn: String): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal(encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
  @scala.inline
  implicit class ClusterEncryptionInfoOps[Self <: ClusterEncryptionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionAtRestKmsKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAtRestKmsKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionInTransit(value: ClusterEncryptionInfoEncryptionInTransit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInTransit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInTransit")(js.undefined)
        ret
    }
  }
  
}

