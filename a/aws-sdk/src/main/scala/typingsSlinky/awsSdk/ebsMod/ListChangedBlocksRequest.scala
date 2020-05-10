package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangedBlocksRequest extends js.Object {
  /**
    * The ID of the first snapshot to use for the comparison.  The FirstSnapshotID parameter must be specified with a SecondSnapshotId parameter; otherwise, an error occurs. 
    */
  var FirstSnapshotId: js.UndefOr[SnapshotId] = js.native
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ebsMod.MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The ID of the second snapshot to use for the comparison.  The SecondSnapshotId parameter must be specified with a FirstSnapshotID parameter; otherwise, an error occurs. 
    */
  var SecondSnapshotId: SnapshotId = js.native
  /**
    * The block index from which the comparison should start. The list in the response will start from this block index or the next valid block index in the snapshots.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}

object ListChangedBlocksRequest {
  @scala.inline
  def apply(SecondSnapshotId: SnapshotId): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
  @scala.inline
  implicit class ListChangedBlocksRequestOps[Self <: ListChangedBlocksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecondSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSnapshotId")(js.undefined)
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

