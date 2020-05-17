package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverStyle extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var hoverStyle: js.UndefOr[Border] = js.native
  var selectionStyle: js.UndefOr[Border] = js.native
}

object HoverStyle {
  @scala.inline
  def apply(): HoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverStyle]
  }
  @scala.inline
  implicit class HoverStyleOps[Self <: HoverStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
  }
  
}

