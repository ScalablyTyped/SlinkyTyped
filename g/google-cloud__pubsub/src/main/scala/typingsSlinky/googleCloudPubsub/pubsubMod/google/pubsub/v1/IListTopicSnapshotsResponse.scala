package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSnapshotsResponse. */
@js.native
trait IListTopicSnapshotsResponse extends js.Object {
  /** ListTopicSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  /** ListTopicSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[String] | Null] = js.native
}

object IListTopicSnapshotsResponse {
  @scala.inline
  def apply(): IListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSnapshotsResponse]
  }
  @scala.inline
  implicit class IListTopicSnapshotsResponseOps[Self <: IListTopicSnapshotsResponse] (val x: Self) extends AnyVal {
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
    def withSnapshots(value: js.Array[String]): Self = {
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

