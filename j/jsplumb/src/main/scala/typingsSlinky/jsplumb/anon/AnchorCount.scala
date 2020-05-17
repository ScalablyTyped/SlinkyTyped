package typingsSlinky.jsplumb.anon

import typingsSlinky.jsplumb.mod.PerimeterShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorCount extends js.Object {
  var anchorCount: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var shape: js.UndefOr[PerimeterShape] = js.native
}

object AnchorCount {
  @scala.inline
  def apply(): AnchorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorCount]
  }
  @scala.inline
  implicit class AnchorCountOps[Self <: AnchorCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: PerimeterShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
  }
  
}

