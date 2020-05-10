package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSnapshotBlocksResponse extends js.Object {
  /**
    * The size of the block.
    */
  var BlockSize: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockSize] = js.native
  /**
    * An array of objects containing information about the blocks.
    */
  var Blocks: js.UndefOr[typingsSlinky.awsSdk.ebsMod.Blocks] = js.native
  /**
    * The time when the BlockToken expires.
    */
  var ExpiryTime: js.UndefOr[js.Date] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The size of the volume in GB.
    */
  var VolumeSize: js.UndefOr[typingsSlinky.awsSdk.ebsMod.VolumeSize] = js.native
}

object ListSnapshotBlocksResponse {
  @scala.inline
  def apply(): ListSnapshotBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotBlocksResponse]
  }
  @scala.inline
  implicit class ListSnapshotBlocksResponseOps[Self <: ListSnapshotBlocksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSize(value: BlockSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocks(value: Blocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiryTime")(js.undefined)
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
    def withVolumeSize(value: VolumeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(js.undefined)
        ret
    }
  }
  
}

