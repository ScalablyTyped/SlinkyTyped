package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSnapshotRequest. */
@js.native
trait IGetSnapshotRequest extends js.Object {
  /** GetSnapshotRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.native
}

object IGetSnapshotRequest {
  @scala.inline
  def apply(): IGetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSnapshotRequest]
  }
  @scala.inline
  implicit class IGetSnapshotRequestOps[Self <: IGetSnapshotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(null)
        ret
    }
  }
  
}

