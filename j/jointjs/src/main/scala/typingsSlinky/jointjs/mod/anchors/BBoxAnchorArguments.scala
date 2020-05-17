package typingsSlinky.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBoxAnchorArguments extends RotateAnchorArguments {
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
}

object BBoxAnchorArguments {
  @scala.inline
  def apply(): BBoxAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BBoxAnchorArguments]
  }
  @scala.inline
  implicit class BBoxAnchorArgumentsOps[Self <: BBoxAnchorArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDx(value: Double | String): Self = {
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
    def withDy(value: Double | String): Self = {
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

