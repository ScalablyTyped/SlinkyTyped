package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSnapshotsResponse. */
@js.native
trait IListSnapshotsResponse extends js.Object {
  /** ListSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  /** ListSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[ISnapshot] | Null] = js.native
}

object IListSnapshotsResponse {
  @scala.inline
  def apply(): IListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSnapshotsResponse]
  }
  @scala.inline
  implicit class IListSnapshotsResponseOps[Self <: IListSnapshotsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
    @scala.inline
    def withSnapshots(value: js.Array[ISnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(null)
        ret
    }
  }
  
}

