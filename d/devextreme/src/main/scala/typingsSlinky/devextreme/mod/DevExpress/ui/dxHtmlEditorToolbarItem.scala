package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.after
import typingsSlinky.devextreme.devextremeStrings.alignCenter
import typingsSlinky.devextreme.devextremeStrings.alignJustify
import typingsSlinky.devextreme.devextremeStrings.alignLeft
import typingsSlinky.devextreme.devextremeStrings.alignRight
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.background
import typingsSlinky.devextreme.devextremeStrings.before
import typingsSlinky.devextreme.devextremeStrings.blockquote
import typingsSlinky.devextreme.devextremeStrings.bold
import typingsSlinky.devextreme.devextremeStrings.bulletList
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.codeBlock
import typingsSlinky.devextreme.devextremeStrings.color
import typingsSlinky.devextreme.devextremeStrings.decreaseIndent
import typingsSlinky.devextreme.devextremeStrings.header
import typingsSlinky.devextreme.devextremeStrings.image
import typingsSlinky.devextreme.devextremeStrings.inMenu
import typingsSlinky.devextreme.devextremeStrings.increaseIndent
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.link
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.devextremeStrings.orderedList
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.strike
import typingsSlinky.devextreme.devextremeStrings.subscript
import typingsSlinky.devextreme.devextremeStrings.superscript
import typingsSlinky.devextreme.devextremeStrings.underline
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.variable
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  /** Specifies the predefined item that this object customizes or a format with multiple choices. */
  var formatName: js.UndefOr[
    background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
  ] = js.undefined
  /** Specifies values for a format with multiple choices. Should be used with the formatName. */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
}

object dxHtmlEditorToolbarItem {
  @scala.inline
  def apply(
    cssClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatName: background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String = null,
    formatValues: js.Array[String | Double | Boolean] = null,
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
  ): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatName != null) __obj.updateDynamic("formatName")(formatName.asInstanceOf[js.Any])
    if (formatValues != null) __obj.updateDynamic("formatValues")(formatValues.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
}

