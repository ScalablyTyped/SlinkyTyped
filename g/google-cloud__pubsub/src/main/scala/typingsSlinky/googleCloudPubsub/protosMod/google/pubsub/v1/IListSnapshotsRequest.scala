package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSnapshotsRequest. */
@js.native
trait IListSnapshotsRequest extends js.Object {
  /** ListSnapshotsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  /** ListSnapshotsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
  /** ListSnapshotsRequest project */
  var project: js.UndefOr[String | Null] = js.native
}

object IListSnapshotsRequest {
  @scala.inline
  def apply(): IListSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSnapshotsRequest]
  }
  @scala.inline
  implicit class IListSnapshotsRequestOps[Self <: IListSnapshotsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(null)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(null)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(null)
        ret
    }
  }
  
}

