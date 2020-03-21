package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentDxTreeList
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

trait dxTreeListEditing extends GridBaseEditing {
  /** Specifies whether a user can add new rows. It is called for each data row when defined as a function. */
  var allowAdding: js.UndefOr[Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean])] = js.undefined
  /** Specifies whether a user can delete rows. It is called for each data row when defined as a function. */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean])] = js.undefined
  /** Specifies whether a user can update rows. It is called for each data row when defined as a function */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean])] = js.undefined
  /** Contains options that specify texts for editing-related UI elements. */
  @JSName("texts")
  var texts_dxTreeListEditing: js.UndefOr[dxTreeListEditingTexts] = js.undefined
}

object dxTreeListEditing {
  @scala.inline
  def apply(
    allowAdding: Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean]) = null,
    allowDeleting: Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean]) = null,
    allowUpdating: Boolean | (js.Function1[/* options */ AnonComponentDxTreeList, Boolean]) = null,
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: dxTreeListEditingTexts = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListEditing = {
    val __obj = js.Dynamic.literal()
    if (allowAdding != null) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (allowDeleting != null) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (allowUpdating != null) __obj.updateDynamic("allowUpdating")(allowUpdating.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListEditing]
  }
}

