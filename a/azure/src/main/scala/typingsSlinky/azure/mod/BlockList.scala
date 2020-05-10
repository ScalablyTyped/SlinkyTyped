package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockList extends js.Object {
  var CommittedBlocks: js.Array[String] = js.native
  var LatestBlocks: js.Array[String] = js.native
  var UncommittedBlocks: js.Array[String] = js.native
}

object BlockList {
  @scala.inline
  def apply(
    CommittedBlocks: js.Array[String],
    LatestBlocks: js.Array[String],
    UncommittedBlocks: js.Array[String]
  ): BlockList = {
    val __obj = js.Dynamic.literal(CommittedBlocks = CommittedBlocks.asInstanceOf[js.Any], LatestBlocks = LatestBlocks.asInstanceOf[js.Any], UncommittedBlocks = UncommittedBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockList]
  }
  @scala.inline
  implicit class BlockListOps[Self <: BlockList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommittedBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommittedBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncommittedBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UncommittedBlocks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

