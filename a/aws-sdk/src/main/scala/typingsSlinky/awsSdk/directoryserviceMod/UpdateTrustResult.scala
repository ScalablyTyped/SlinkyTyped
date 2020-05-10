package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrustResult extends js.Object {
  var RequestId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RequestId] = js.native
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustId] = js.native
}

object UpdateTrustResult {
  @scala.inline
  def apply(): UpdateTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrustResult]
  }
  @scala.inline
  implicit class UpdateTrustResultOps[Self <: UpdateTrustResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestId(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustId(value: TrustId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(js.undefined)
        ret
    }
  }
  
}

