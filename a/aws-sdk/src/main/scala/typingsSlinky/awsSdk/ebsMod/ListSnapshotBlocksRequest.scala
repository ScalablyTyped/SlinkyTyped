package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSnapshotBlocksRequest extends js.Object {
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ebsMod.MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The ID of the snapshot from which to get block indexes and block tokens.
    */
  var SnapshotId: typingsSlinky.awsSdk.ebsMod.SnapshotId = js.native
  /**
    * The block index from which the list should start. The list in the response will start from this block index or the next valid block index in the snapshot.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}

object ListSnapshotBlocksRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): ListSnapshotBlocksRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSnapshotBlocksRequest]
  }
  @scala.inline
  implicit class ListSnapshotBlocksRequestOps[Self <: ListSnapshotBlocksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PageToken): Self = {
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
    def withStartingBlockIndex(value: BlockIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingBlockIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingBlockIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingBlockIndex")(js.undefined)
        ret
    }
  }
  
}

