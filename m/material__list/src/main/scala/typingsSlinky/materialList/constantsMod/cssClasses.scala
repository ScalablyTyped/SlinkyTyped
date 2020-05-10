package typingsSlinky.materialList.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialList.materialListStrings.`mdc-list-item--activated`
import typingsSlinky.materialList.materialListStrings.`mdc-list-item--selected`
import typingsSlinky.materialList.materialListStrings.`mdc-list-item`
import typingsSlinky.materialList.materialListStrings.`mdc-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var LIST_ITEM_ACTIVATED_CLASS: `mdc-list-item--activated` = js.native
  var LIST_ITEM_CLASS: `mdc-list-item` = js.native
  var LIST_ITEM_SELECTED_CLASS: `mdc-list-item--selected` = js.native
  var ROOT: `mdc-list` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    LIST_ITEM_ACTIVATED_CLASS: `mdc-list-item--activated`,
    LIST_ITEM_CLASS: `mdc-list-item`,
    LIST_ITEM_SELECTED_CLASS: `mdc-list-item--selected`,
    ROOT: `mdc-list`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LIST_ITEM_ACTIVATED_CLASS = LIST_ITEM_ACTIVATED_CLASS.asInstanceOf[js.Any], LIST_ITEM_CLASS = LIST_ITEM_CLASS.asInstanceOf[js.Any], LIST_ITEM_SELECTED_CLASS = LIST_ITEM_SELECTED_CLASS.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLIST_ITEM_ACTIVATED_CLASS(value: `mdc-list-item--activated`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_ACTIVATED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLIST_ITEM_CLASS(value: `mdc-list-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLIST_ITEM_SELECTED_CLASS(value: `mdc-list-item--selected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_SELECTED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-list`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

