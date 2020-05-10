package typingsSlinky.baseui.flexGridMod

import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.baseui.blockMod.Responsive
import typingsSlinky.baseui.blockMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGridProps extends BlockProps {
  var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.native
  var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
  var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.native
}

object FlexGridProps {
  @scala.inline
  def apply(): FlexGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGridProps]
  }
  @scala.inline
  implicit class FlexGridPropsOps[Self <: FlexGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexGridColumnCount(value: Responsive[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGridColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGridColumnGap(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridColumnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGridColumnGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridColumnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGridRowGap(value: Responsive[Scale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridRowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGridRowGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridRowGap")(js.undefined)
        ret
    }
  }
  
}

