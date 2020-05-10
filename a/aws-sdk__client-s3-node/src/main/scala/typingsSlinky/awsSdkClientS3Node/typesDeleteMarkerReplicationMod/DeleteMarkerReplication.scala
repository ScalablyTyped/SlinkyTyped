package typingsSlinky.awsSdkClientS3Node.typesDeleteMarkerReplicationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerReplication extends js.Object {
  /**
    * <p>The status of the delete marker replication.</p> <note> <p> In the current implementation, Amazon S3 does not replicate the delete markers. Therefore, the status must be <code>Disabled</code>. </p> </note>
    */
  var Status: js.UndefOr[Enabled | Disabled | String] = js.native
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
    def withStatus(value: Enabled | Disabled | String): Self = {
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

