package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListSnapshots` method.
  */
@js.native
trait SchemaListSnapshotsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more snapshot that match the
    * request; this value should be passed in a new `ListSnapshotsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting snapshots.
    */
  var snapshots: js.UndefOr[js.Array[SchemaSnapshot]] = js.native
}

object SchemaListSnapshotsResponse {
  @scala.inline
  def apply(): SchemaListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSnapshotsResponse]
  }
  @scala.inline
  implicit class SchemaListSnapshotsResponseOps[Self <: SchemaListSnapshotsResponse] (val x: Self) extends AnyVal {
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
    def withSnapshots(value: js.Array[SchemaSnapshot]): Self = {
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
  }
  
}

