package typingsSlinky.jointjs.mod.linkAnchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionClosestAnchorArguments extends js.Object {
  var fixedAt: js.UndefOr[Double | String] = js.native
}

object ConnectionClosestAnchorArguments {
  @scala.inline
  def apply(): ConnectionClosestAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionClosestAnchorArguments]
  }
  @scala.inline
  implicit class ConnectionClosestAnchorArgumentsOps[Self <: ConnectionClosestAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedAt(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedAt")(js.undefined)
        ret
    }
  }
  
}

