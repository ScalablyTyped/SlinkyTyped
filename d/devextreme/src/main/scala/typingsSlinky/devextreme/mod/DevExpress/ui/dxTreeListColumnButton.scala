package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ColumnComponentElement
import typingsSlinky.devextreme.anon.ColumnDxTreeListColumn
import typingsSlinky.devextreme.anon.KeyRow
import typingsSlinky.devextreme.devextremeStrings.add
import typingsSlinky.devextreme.devextremeStrings.cancel
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.edit
import typingsSlinky.devextreme.devextremeStrings.save
import typingsSlinky.devextreme.devextremeStrings.undelete
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListColumnButton extends GridBaseColumnButton {
  /** @name dxTreeListColumnButton.name */
  var name: js.UndefOr[add | cancel | delete | edit | save | undelete | String] = js.undefined
  /** @name dxTreeListColumnButton.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ ColumnComponentElement, _]) | String] = js.undefined
  /** @name dxTreeListColumnButton.template */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery])
  ] = js.undefined
  /** @name dxTreeListColumnButton.visible */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ ColumnDxTreeListColumn, Boolean])] = js.undefined
}

object dxTreeListColumnButton {
  @scala.inline
  def apply(
    cssClass: String = null,
    hint: String = null,
    icon: String = null,
    name: add | cancel | delete | edit | save | undelete | String = null,
    onClick: (js.Function1[/* e */ ColumnComponentElement, _]) | String = null,
    template: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ KeyRow, String | Element | JQuery]) = null,
    text: String = null,
    visible: Boolean | (js.Function1[/* options */ ColumnDxTreeListColumn, Boolean]) = null
  ): dxTreeListColumnButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListColumnButton]
  }
}

