package typingsSlinky.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects
//
@js.native
trait TransactionObject extends js.Object {
  var address: String = js.native
  var attachmentTimestamp: Double = js.native
  var attachmentTimestampLowerBound: Double = js.native
  var attachmentTimestampUpperBound: Double = js.native
  var branchTransaction: String = js.native
  var bundle: Double = js.native
  var currentIndex: Double = js.native
  var hash: String = js.native
  var lastIndex: Double = js.native
  var nonce: String = js.native
  var signatureMessageFragment: String = js.native
  var tag: String = js.native
  var timestamp: Double = js.native
  var trunkTransaction: String = js.native
  var value: Double = js.native
}

object TransactionObject {
  @scala.inline
  def apply(
    address: String,
    attachmentTimestamp: Double,
    attachmentTimestampLowerBound: Double,
    attachmentTimestampUpperBound: Double,
    branchTransaction: String,
    bundle: Double,
    currentIndex: Double,
    hash: String,
    lastIndex: Double,
    nonce: String,
    signatureMessageFragment: String,
    tag: String,
    timestamp: Double,
    trunkTransaction: String,
    value: Double
  ): TransactionObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attachmentTimestamp = attachmentTimestamp.asInstanceOf[js.Any], attachmentTimestampLowerBound = attachmentTimestampLowerBound.asInstanceOf[js.Any], attachmentTimestampUpperBound = attachmentTimestampUpperBound.asInstanceOf[js.Any], branchTransaction = branchTransaction.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signatureMessageFragment = signatureMessageFragment.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionObject]
  }
  @scala.inline
  implicit class TransactionObjectOps[Self <: TransactionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentTimestampLowerBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentTimestampLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentTimestampUpperBound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentTimestampUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBundle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureMessageFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureMessageFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrunkTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunkTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

