package typingsSlinky.awsDashSdk.clientsEbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockRequest extends js.Object {
  /**
    * The block index of the block from which to get data. Obtain the block index by running the list changed blocks or list snapshot blocks operations.
    */
  var BlockIndex: typingsSlinky.awsDashSdk.clientsEbsMod.BlockIndex = js.native
  /**
    * The block token of the block from which to get data. Obtain the block token by running the list changed blocks or list snapshot blocks operations.
    */
  var BlockToken: typingsSlinky.awsDashSdk.clientsEbsMod.BlockToken = js.native
  /**
    * The ID of the snapshot containing the block from which to get data.
    */
  var SnapshotId: typingsSlinky.awsDashSdk.clientsEbsMod.SnapshotId = js.native
}

object GetSnapshotBlockRequest {
  @scala.inline
  def apply(BlockIndex: BlockIndex, BlockToken: BlockToken, SnapshotId: SnapshotId): GetSnapshotBlockRequest = {
    val __obj = js.Dynamic.literal(BlockIndex = BlockIndex.asInstanceOf[js.Any], BlockToken = BlockToken.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSnapshotBlockRequest]
  }
}

