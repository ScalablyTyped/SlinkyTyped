package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlockResponse extends js.Object {
  /**
    * The block data object in Amazon Ion format.
    */
  var Block: ValueHolder = js.native
  /**
    * The proof object in Amazon Ion format returned by a GetBlock request. A proof contains the list of hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
    */
  var Proof: js.UndefOr[ValueHolder] = js.native
}

object GetBlockResponse {
  @scala.inline
  def apply(Block: ValueHolder): GetBlockResponse = {
    val __obj = js.Dynamic.literal(Block = Block.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockResponse]
  }
  @scala.inline
  implicit class GetBlockResponseOps[Self <: GetBlockResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: ValueHolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProof(value: ValueHolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proof")(js.undefined)
        ret
    }
  }
  
}

