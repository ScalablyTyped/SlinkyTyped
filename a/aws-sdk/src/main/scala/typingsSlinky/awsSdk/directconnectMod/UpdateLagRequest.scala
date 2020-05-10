package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLagRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.native
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.native
}

object UpdateLagRequest {
  @scala.inline
  def apply(lagId: LagId): UpdateLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLagRequest]
  }
  @scala.inline
  implicit class UpdateLagRequestOps[Self <: UpdateLagRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLagId(value: LagId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLagName(value: LagName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLinks(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLinks")(js.undefined)
        ret
    }
  }
  
}

