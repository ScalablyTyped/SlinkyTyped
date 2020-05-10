package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait SchemaAsymmetricSignRequest extends js.Object {
  /**
    * Required. The digest of the data to sign. The digest must be produced
    * with the same digest algorithm as specified by the key version&#39;s
    * algorithm.
    */
  var digest: js.UndefOr[SchemaDigest] = js.native
}

object SchemaAsymmetricSignRequest {
  @scala.inline
  def apply(): SchemaAsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignRequest]
  }
  @scala.inline
  implicit class SchemaAsymmetricSignRequestOps[Self <: SchemaAsymmetricSignRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigest(value: SchemaDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
  }
  
}

