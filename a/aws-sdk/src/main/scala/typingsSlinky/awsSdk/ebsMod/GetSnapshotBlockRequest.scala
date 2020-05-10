package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockRequest extends js.Object {
  /**
    * The block index of the block from which to get data. Obtain the BlockIndex by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockIndex: typingsSlinky.awsSdk.ebsMod.BlockIndex = js.native
  /**
    * The block token of the block from which to get data. Obtain the BlockToken by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockToken: typingsSlinky.awsSdk.ebsMod.BlockToken = js.native
  /**
    * The ID of the snapshot containing the block from which to get data.
    */
  var SnapshotId: typingsSlinky.awsSdk.ebsMod.SnapshotId = js.native
}

object GetSnapshotBlockRequest {
  @scala.inline
  def apply(BlockIndex: BlockIndex, BlockToken: BlockToken, SnapshotId: SnapshotId): GetSnapshotBlockRequest = {
    val __obj = js.Dynamic.literal(BlockIndex = BlockIndex.asInstanceOf[js.Any], BlockToken = BlockToken.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotBlockRequest]
  }
  @scala.inline
  implicit class GetSnapshotBlockRequestOps[Self <: GetSnapshotBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIndex(value: BlockIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockToken(value: BlockToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

