package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrustRequest extends js.Object {
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typingsSlinky.awsSdk.directoryserviceMod.TrustId = js.native
}

object UpdateTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
  @scala.inline
  implicit class UpdateTrustRequestOps[Self <: UpdateTrustRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrustId(value: TrustId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectiveAuth(value: SelectiveAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectiveAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(js.undefined)
        ret
    }
  }
  
}

