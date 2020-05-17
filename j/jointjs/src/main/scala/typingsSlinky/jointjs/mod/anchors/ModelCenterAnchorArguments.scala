package typingsSlinky.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelCenterAnchorArguments extends js.Object {
  var dx: js.UndefOr[Double] = js.native
  var dy: js.UndefOr[Double] = js.native
}

object ModelCenterAnchorArguments {
  @scala.inline
  def apply(): ModelCenterAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelCenterAnchorArguments]
  }
  @scala.inline
  implicit class ModelCenterAnchorArgumentsOps[Self <: ModelCenterAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
  }
  
}

