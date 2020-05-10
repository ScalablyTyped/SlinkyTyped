package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.batch
import typingsSlinky.devextreme.devextremeStrings.cell
import typingsSlinky.devextreme.devextremeStrings.click
import typingsSlinky.devextreme.devextremeStrings.dblClick
import typingsSlinky.devextreme.devextremeStrings.form
import typingsSlinky.devextreme.devextremeStrings.full
import typingsSlinky.devextreme.devextremeStrings.popup
import typingsSlinky.devextreme.devextremeStrings.repaint
import typingsSlinky.devextreme.devextremeStrings.reshape
import typingsSlinky.devextreme.devextremeStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseEditing extends js.Object {
  /** Configures the form. Used only if editing.mode is "form" or "popup". */
  var form: js.UndefOr[dxFormOptions] = js.native
  /** Specifies how a user edits data. */
  var mode: js.UndefOr[batch | cell | row | form | popup] = js.native
  /** Configures the popup. Used only if editing.mode is "popup". */
  var popup: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  /** Specifies operations that are performed after saving changes. */
  var refreshMode: js.UndefOr[full | reshape | repaint] = js.native
  /** Specifies whether to select text in a cell when a user starts editing. */
  var selectTextOnEditStart: js.UndefOr[Boolean] = js.native
  /** Specifies whether a single or double click should switch a cell to the editing state. Applies if editing.mode is "cell" or "batch". */
  var startEditAction: js.UndefOr[click | dblClick] = js.native
  /** Contains options that specify texts for editing-related UI elements. */
  var texts: js.UndefOr[GridBaseEditingTexts] = js.native
  /** Specifies whether the editing column uses icons instead of links. */
  var useIcons: js.UndefOr[Boolean] = js.native
}

object GridBaseEditing {
  @scala.inline
  def apply(): GridBaseEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseEditing]
  }
  @scala.inline
  implicit class GridBaseEditingOps[Self <: GridBaseEditing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForm(value: dxFormOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: batch | cell | row | form | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: dxPopupOptions[dxPopup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshMode(value: full | reshape | repaint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectTextOnEditStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnEditStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectTextOnEditStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnEditStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEditAction(value: click | dblClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartEditAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEditAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: GridBaseEditingTexts): Self = {
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
    @scala.inline
    def withUseIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIcons")(js.undefined)
        ret
    }
  }
  
}

