package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.after
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.before
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.inMenu
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxToolbarItem extends CollectionWidgetItem {
  /** Specifies a CSS class to be applied to the item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies when to display an item in the toolbar's overflow menu. */
  var locateInMenu: js.UndefOr[always | auto | never] = js.undefined
  /** Specifies a location for the item on the toolbar. */
  var location: js.UndefOr[after | before | center] = js.undefined
  /** Specifies a template that should be used to render a menu item. */
  var menuItemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.undefined
  /** Configures the DevExtreme widget used as a toolbar item. */
  var options: js.UndefOr[js.Any] = js.undefined
  /** Specifies when to display the text for the widget item. */
  var showText: js.UndefOr[always | inMenu] = js.undefined
  /** A widget that presents a toolbar item. To configure it, use the options object. */
  var widget: js.UndefOr[
    typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxButton | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxMenu | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxTabs | typingsSlinky.devextreme.devextremeStrings.dxTextBox | typingsSlinky.devextreme.devextremeStrings.dxButtonGroup | typingsSlinky.devextreme.devextremeStrings.dxDropDownButton
  ] = js.undefined
}

object dxToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    locateInMenu: always | auto | never = null,
    location: after | before | center = null,
    menuItemTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    options: js.Any = null,
    showText: always | inMenu = null,
    template: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxButton | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxMenu | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxTabs | typingsSlinky.devextreme.devextremeStrings.dxTextBox | typingsSlinky.devextreme.devextremeStrings.dxButtonGroup | typingsSlinky.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (locateInMenu != null) __obj.updateDynamic("locateInMenu")(locateInMenu.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menuItemTemplate != null) __obj.updateDynamic("menuItemTemplate")(menuItemTemplate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxToolbarItem]
  }
}

