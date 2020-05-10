package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerReplication extends js.Object {
  /**
    * Indicates whether to replicate delete markers.   In the current implementation, Amazon S3 doesn't replicate the delete markers. The status must be Disabled.  
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.native
}

object DeleteMarkerReplication {
  @scala.inline
  def apply(): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
  @scala.inline
  implicit class DeleteMarkerReplicationOps[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: DeleteMarkerReplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

