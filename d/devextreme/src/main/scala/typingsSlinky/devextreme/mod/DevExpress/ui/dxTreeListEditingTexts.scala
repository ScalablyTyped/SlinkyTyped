package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListEditingTexts extends GridBaseEditingTexts {
  /** Specifies text for the button that adds a new nested row. Applies if the editing.mode is "batch" or "cell". */
  var addRowToNode: js.UndefOr[String] = js.native
}

object dxTreeListEditingTexts {
  @scala.inline
  def apply(): dxTreeListEditingTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListEditingTexts]
  }
  @scala.inline
  implicit class dxTreeListEditingTextsOps[Self <: dxTreeListEditingTexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowToNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowToNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRowToNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowToNode")(js.undefined)
        ret
    }
  }
  
}

