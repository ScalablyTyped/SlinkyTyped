package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverConfigSnapshotResponse extends js.Object {
  /**
    * The ID of the snapshot that is being created.
    */
  var configSnapshotId: js.UndefOr[String] = js.native
}

object DeliverConfigSnapshotResponse {
  @scala.inline
  def apply(): DeliverConfigSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverConfigSnapshotResponse]
  }
  @scala.inline
  implicit class DeliverConfigSnapshotResponseOps[Self <: DeliverConfigSnapshotResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigSnapshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSnapshotId")(js.undefined)
        ret
    }
  }
  
}

