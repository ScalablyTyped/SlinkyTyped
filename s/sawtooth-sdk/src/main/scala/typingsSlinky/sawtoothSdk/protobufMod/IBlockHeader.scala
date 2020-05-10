package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockHeader extends js.Object {
  /** BlockHeader batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** BlockHeader blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** BlockHeader consensus */
  var consensus: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** BlockHeader previousBlockId */
  var previousBlockId: js.UndefOr[String | Null] = js.native
  /** BlockHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
  /** BlockHeader stateRootHash */
  var stateRootHash: js.UndefOr[String | Null] = js.native
}

object IBlockHeader {
  @scala.inline
  def apply(): IBlockHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockHeader]
  }
  @scala.inline
  implicit class IBlockHeaderOps[Self <: IBlockHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIds")(null)
        ret
    }
    @scala.inline
    def withBlockNum(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNum")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockNumNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNum")(null)
        ret
    }
    @scala.inline
    def withConsensus(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsensus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus")(js.undefined)
        ret
    }
    @scala.inline
    def withConsensusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus")(null)
        ret
    }
    @scala.inline
    def withPreviousBlockId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBlockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousBlockId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBlockId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousBlockIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBlockId")(null)
        ret
    }
    @scala.inline
    def withSignerPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerPublicKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(null)
        ret
    }
    @scala.inline
    def withStateRootHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRootHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateRootHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRootHash")(js.undefined)
        ret
    }
    @scala.inline
    def withStateRootHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRootHash")(null)
        ret
    }
  }
  
}

