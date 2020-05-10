package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBlobOptions extends BlobSnapshotOptions {
  var sourceAccessConditions: StorageAccessCondition = js.native
  var sourceLeaseId: js.UndefOr[String] = js.native
}

object CopyBlobOptions {
  @scala.inline
  def apply(sourceAccessConditions: StorageAccessCondition): CopyBlobOptions = {
    val __obj = js.Dynamic.literal(sourceAccessConditions = sourceAccessConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBlobOptions]
  }
  @scala.inline
  implicit class CopyBlobOptionsOps[Self <: CopyBlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceAccessConditions(value: StorageAccessCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAccessConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLeaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLeaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLeaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLeaseId")(js.undefined)
        ret
    }
  }
  
}

