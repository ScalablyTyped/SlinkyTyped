package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.buttonClick
import typingsSlinky.devextreme.devextremeStrings.rowClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowCollapsing extends js.Object {
  var allowCollapsing: js.UndefOr[Boolean] = js.native
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  var contextMenuEnabled: js.UndefOr[Boolean] = js.native
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.native
  var texts: js.UndefOr[AnonGroupByThisColumn] = js.native
}

object AnonAllowCollapsing {
  @scala.inline
  def apply(): AnonAllowCollapsing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowCollapsing]
  }
  @scala.inline
  implicit class AnonAllowCollapsingOps[Self <: AnonAllowCollapsing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCollapsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandMode(value: buttonClick | rowClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: AnonGroupByThisColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
  }
  
}

