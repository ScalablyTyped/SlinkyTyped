package typingsSlinky.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingAnchorArguments extends js.Object {
  var padding: js.UndefOr[Double] = js.native
}

object PaddingAnchorArguments {
  @scala.inline
  def apply(): PaddingAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingAnchorArguments]
  }
  @scala.inline
  implicit class PaddingAnchorArgumentsOps[Self <: PaddingAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

