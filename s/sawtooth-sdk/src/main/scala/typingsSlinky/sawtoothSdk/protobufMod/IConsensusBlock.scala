package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusBlock extends js.Object {
  /** ConsensusBlock blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** ConsensusBlock blockNum */
  var blockNum: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /** ConsensusBlock payload */
  var payload: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** ConsensusBlock previousId */
  var previousId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** ConsensusBlock signerId */
  var signerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** ConsensusBlock summary */
  var summary: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusBlock {
  @scala.inline
  def apply(): IConsensusBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlock]
  }
  @scala.inline
  implicit class IConsensusBlockOps[Self <: IConsensusBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockId")(null)
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
    def withPayload(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(null)
        ret
    }
    @scala.inline
    def withPreviousId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(null)
        ret
    }
    @scala.inline
    def withSignerId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerId")(null)
        ret
    }
    @scala.inline
    def withSummary(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(null)
        ret
    }
  }
  
}

