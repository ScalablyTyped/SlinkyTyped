package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelClickEventUIParam extends js.Object {
  /**
  	 * Used to determine whether or not the label click should fire slice click event.
  	 */
  var allowSliceClick: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to the slice object.
  	 */
  var item: js.UndefOr[js.Any] = js.native
}

object LabelClickEventUIParam {
  @scala.inline
  def apply(): LabelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClickEventUIParam]
  }
  @scala.inline
  implicit class LabelClickEventUIParamOps[Self <: LabelClickEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSliceClick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSliceClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSliceClick")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
  }
  
}

