package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSelectionCriteria extends js.Object {
  /**
    *  A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
    */
  var SseKmsEncryptedObjects: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SseKmsEncryptedObjects] = js.native
}

object SourceSelectionCriteria {
  @scala.inline
  def apply(): SourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSelectionCriteria]
  }
  @scala.inline
  implicit class SourceSelectionCriteriaOps[Self <: SourceSelectionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSseKmsEncryptedObjects(value: SseKmsEncryptedObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SseKmsEncryptedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSseKmsEncryptedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SseKmsEncryptedObjects")(js.undefined)
        ret
    }
  }
  
}

