package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ComponentRow
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

trait dxDataGridEditing extends GridBaseEditing {
  /** @name dxDataGrid.Options.editing.allowAdding */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGrid.Options.editing.allowDeleting */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.undefined
  /** @name dxDataGrid.Options.editing.allowUpdating */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow, Boolean])] = js.undefined
  /** @name dxDataGrid.Options.editing.texts */
  @JSName("texts")
  var texts_dxDataGridEditing: js.UndefOr[js.Any] = js.undefined
}

object dxDataGridEditing {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: Boolean | (js.Function1[/* options */ ComponentRow, Boolean]) = null,
    allowUpdating: Boolean | (js.Function1[/* options */ ComponentRow, Boolean]) = null,
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: js.Any = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): dxDataGridEditing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.get.asInstanceOf[js.Any])
    if (allowDeleting != null) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (allowUpdating != null) __obj.updateDynamic("allowUpdating")(allowUpdating.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.get.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridEditing]
  }
}

