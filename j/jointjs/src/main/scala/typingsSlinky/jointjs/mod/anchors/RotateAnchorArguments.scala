package typingsSlinky.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateAnchorArguments extends js.Object {
  var rotate: js.UndefOr[Boolean] = js.native
}

object RotateAnchorArguments {
  @scala.inline
  def apply(): RotateAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateAnchorArguments]
  }
  @scala.inline
  implicit class RotateAnchorArgumentsOps[Self <: RotateAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
  }
  
}

