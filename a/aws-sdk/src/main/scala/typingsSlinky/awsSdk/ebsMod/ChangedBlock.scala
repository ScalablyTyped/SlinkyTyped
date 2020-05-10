package typingsSlinky.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedBlock extends js.Object {
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockIndex] = js.native
  /**
    * The block token for the block index of the FirstSnapshotId specified in the ListChangedBlocks operation. This value is absent if the first snapshot does not have the changed block that is on the second snapshot.
    */
  var FirstBlockToken: js.UndefOr[BlockToken] = js.native
  /**
    * The block token for the block index of the SecondSnapshotId specified in the ListChangedBlocks operation.
    */
  var SecondBlockToken: js.UndefOr[BlockToken] = js.native
}

object ChangedBlock {
  @scala.inline
  def apply(): ChangedBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedBlock]
  }
  @scala.inline
  implicit class ChangedBlockOps[Self <: ChangedBlock] (val x: Self) extends AnyVal {
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
    def withoutBlockIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstBlockToken(value: BlockToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstBlockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBlockToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstBlockToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondBlockToken(value: BlockToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondBlockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondBlockToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondBlockToken")(js.undefined)
        ret
    }
  }
  
}

