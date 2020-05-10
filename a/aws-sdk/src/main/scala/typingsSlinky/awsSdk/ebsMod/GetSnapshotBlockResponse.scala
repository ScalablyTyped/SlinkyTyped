package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotBlockResponse extends js.Object {
  /**
    * The data content of the block.
    */
  var BlockData: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockData] = js.native
  /**
    * The checksum generated for the block, which is Base64 encoded.
    */
  var Checksum: js.UndefOr[typingsSlinky.awsSdk.ebsMod.Checksum] = js.native
  /**
    * The algorithm used to generate the checksum for the block, such as SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typingsSlinky.awsSdk.ebsMod.ChecksumAlgorithm] = js.native
  /**
    * The size of the data in the block.
    */
  var DataLength: js.UndefOr[typingsSlinky.awsSdk.ebsMod.DataLength] = js.native
}

object GetSnapshotBlockResponse {
  @scala.inline
  def apply(): GetSnapshotBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotBlockResponse]
  }
  @scala.inline
  implicit class GetSnapshotBlockResponseOps[Self <: GetSnapshotBlockResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockData(value: BlockData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockData")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksum(value: Checksum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksumAlgorithm(value: ChecksumAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChecksumAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksumAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChecksumAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLength(value: DataLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLength")(js.undefined)
        ret
    }
  }
  
}

