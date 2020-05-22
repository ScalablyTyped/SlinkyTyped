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

trait GridBaseEditing extends js.Object {
  /** @name GridBase.Options.editing.form */
  var form: js.UndefOr[dxFormOptions] = js.undefined
  /** @name GridBase.Options.editing.mode */
  var mode: js.UndefOr[batch | cell | row | form | popup] = js.undefined
  /** @name GridBase.Options.editing.popup */
  var popup: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** @name GridBase.Options.editing.refreshMode */
  var refreshMode: js.UndefOr[full | reshape | repaint] = js.undefined
  /** @name GridBase.Options.editing.selectTextOnEditStart */
  var selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.editing.startEditAction */
  var startEditAction: js.UndefOr[click | dblClick] = js.undefined
  /** @name GridBase.Options.editing.texts */
  var texts: js.UndefOr[GridBaseEditingTexts] = js.undefined
  /** @name GridBase.Options.editing.useIcons */
  var useIcons: js.UndefOr[Boolean] = js.undefined
}

object GridBaseEditing {
  @scala.inline
  def apply(
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: GridBaseEditingTexts = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): GridBaseEditing = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.get.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseEditing]
  }
}

