package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationSnapshotsResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.NextToken] = js.native
  /**
    * A collection of objects containing information about the application snapshots.
    */
  var SnapshotSummaries: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SnapshotSummaries] = js.native
}

object ListApplicationSnapshotsResponse {
  @scala.inline
  def apply(): ListApplicationSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationSnapshotsResponse]
  }
  @scala.inline
  implicit class ListApplicationSnapshotsResponseOps[Self <: ListApplicationSnapshotsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotSummaries(value: SnapshotSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSummaries")(js.undefined)
        ret
    }
  }
  
}

