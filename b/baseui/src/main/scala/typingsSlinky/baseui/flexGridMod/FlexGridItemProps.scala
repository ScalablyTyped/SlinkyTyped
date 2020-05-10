package typingsSlinky.baseui.flexGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGridItemProps extends FlexGridProps {
  var flexGridItemCount: js.UndefOr[Double] = js.native
  var flexGridItemIndex: js.UndefOr[Double] = js.native
}

object FlexGridItemProps {
  @scala.inline
  def apply(): FlexGridItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGridItemProps]
  }
  @scala.inline
  implicit class FlexGridItemPropsOps[Self <: FlexGridItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexGridItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGridItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGridItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGridItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGridItemIndex")(js.undefined)
        ret
    }
  }
  
}

