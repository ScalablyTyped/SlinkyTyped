package typingsSlinky.jointjs.mod.linkAnchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionRatioAnchorArguments extends js.Object {
  var ratio: js.UndefOr[Double] = js.native
}

object ConnectionRatioAnchorArguments {
  @scala.inline
  def apply(): ConnectionRatioAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionRatioAnchorArguments]
  }
  @scala.inline
  implicit class ConnectionRatioAnchorArgumentsOps[Self <: ConnectionRatioAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
  }
  
}

