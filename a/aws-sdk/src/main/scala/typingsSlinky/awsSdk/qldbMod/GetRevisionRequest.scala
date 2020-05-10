package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRevisionRequest extends js.Object {
  /**
    * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder = js.native
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.native
  /**
    * The unique ID of the document to be verified.
    */
  var DocumentId: UniqueId = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object GetRevisionRequest {
  @scala.inline
  def apply(BlockAddress: ValueHolder, DocumentId: UniqueId, Name: LedgerName): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
  @scala.inline
  implicit class GetRevisionRequestOps[Self <: GetRevisionRequest] (val x: Self) extends AnyVal {
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
    def withDocumentId(value: UniqueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentId")(value.asInstanceOf[js.Any])
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

