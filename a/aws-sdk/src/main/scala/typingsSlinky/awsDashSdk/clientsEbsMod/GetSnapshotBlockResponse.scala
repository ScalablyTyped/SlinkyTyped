package typingsSlinky.awsDashSdk.clientsEbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockResponse extends js.Object {
  /**
    * The data content of the block.
    */
  var BlockData: js.UndefOr[typingsSlinky.awsDashSdk.clientsEbsMod.BlockData] = js.native
  /**
    * The checksum generated for the block.
    */
  var Checksum: js.UndefOr[typingsSlinky.awsDashSdk.clientsEbsMod.Checksum] = js.native
  /**
    * The algorithm used to generate the checksum for the block, such as SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsSlinky.awsDashSdk.clientsEbsMod.ChecksumAlgorithm] = js.native
  /**
    * The size of the data in the block.
    */
  var DataLength: js.UndefOr[typingsSlinky.awsDashSdk.clientsEbsMod.DataLength] = js.native
}

object GetSnapshotBlockResponse {
  @scala.inline
  def apply(
    BlockData: BlockData = null,
    Checksum: Checksum = null,
    ChecksumAlgorithm: ChecksumAlgorithm = null,
    DataLength: Int | Double = null
  ): GetSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (BlockData != null) __obj.updateDynamic("BlockData")(BlockData.asInstanceOf[js.Any])
    if (Checksum != null) __obj.updateDynamic("Checksum")(Checksum.asInstanceOf[js.Any])
    if (ChecksumAlgorithm != null) __obj.updateDynamic("ChecksumAlgorithm")(ChecksumAlgorithm.asInstanceOf[js.Any])
    if (DataLength != null) __obj.updateDynamic("DataLength")(DataLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotBlockResponse]
  }
}

