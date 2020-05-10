package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDigestResponse extends js.Object {
  /**
    * The 256-bit hash value representing the digest returned by a GetDigest request.
    */
  var Digest: typingsSlinky.awsSdk.qldbMod.Digest = js.native
  /**
    * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo.
    */
  var DigestTipAddress: ValueHolder = js.native
}

object GetDigestResponse {
  @scala.inline
  def apply(Digest: Digest, DigestTipAddress: ValueHolder): GetDigestResponse = {
    val __obj = js.Dynamic.literal(Digest = Digest.asInstanceOf[js.Any], DigestTipAddress = DigestTipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestResponse]
  }
  @scala.inline
  implicit class GetDigestResponseOps[Self <: GetDigestResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigestUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigest(value: Digest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestTipAddress(value: ValueHolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DigestTipAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

