package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends js.Object {
  /**
    * Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
    * in `destination` must be specified as well.
    */
  var sseKmsEncryptedObjects: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] = js.native
}

object BucketReplicationConfigurationRuleSourceSelectionCriteria {
  @scala.inline
  def apply(): BucketReplicationConfigurationRuleSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteria]
  }
  @scala.inline
  implicit class BucketReplicationConfigurationRuleSourceSelectionCriteriaOps[Self <: BucketReplicationConfigurationRuleSourceSelectionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSseKmsEncryptedObjects(value: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseKmsEncryptedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSseKmsEncryptedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sseKmsEncryptedObjects")(js.undefined)
        ret
    }
  }
  
}

