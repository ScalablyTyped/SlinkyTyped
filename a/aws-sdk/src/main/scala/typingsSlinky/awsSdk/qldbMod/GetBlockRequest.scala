package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlockRequest extends js.Object {
  /**
    * The location of the block that you want to request. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder = js.native
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object GetBlockRequest {
  @scala.inline
  def apply(BlockAddress: ValueHolder, Name: LedgerName): GetBlockRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockRequest]
  }
  @scala.inline
  implicit class GetBlockRequestOps[Self <: GetBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockAddress(value: ValueHolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: LedgerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestTipAddress(value: ValueHolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DigestTipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestTipAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DigestTipAddress")(js.undefined)
        ret
    }
  }
  
}

