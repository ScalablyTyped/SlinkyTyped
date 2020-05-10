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

@js.native
trait dxToolbarItem extends CollectionWidgetItem {
  /** Specifies a CSS class to be applied to the item. */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies when to display an item in the toolbar's overflow menu. */
  var locateInMenu: js.UndefOr[always | auto | never] = js.native
  /** Specifies a location for the item on the toolbar. */
  var location: js.UndefOr[after | before | center] = js.native
  /** Specifies a template that should be used to render a menu item. */
  var menuItemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
  /** Configures the DevExtreme widget used as a toolbar item. */
  var options: js.UndefOr[js.Any] = js.native
  /** Specifies when to display the text for the widget item. */
  var showText: js.UndefOr[always | inMenu] = js.native
  /** A widget that presents a toolbar item. To configure it, use the options object. */
  var widget: js.UndefOr[
    typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxButton | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxMenu | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxTabs | typingsSlinky.devextreme.devextremeStrings.dxTextBox | typingsSlinky.devextreme.devextremeStrings.dxButtonGroup | typingsSlinky.devextreme.devextremeStrings.dxDropDownButton
  ] = js.native
}

object dxToolbarItem {
  @scala.inline
  def apply(): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarItem]
  }
  @scala.inline
  implicit class dxToolbarItemOps[Self <: dxToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLocateInMenu(value: always | auto | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateInMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocateInMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateInMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: after | before | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemTemplateFunction0(value: () => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withShowText(value: always | inMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget(
      value: typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxButton | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxMenu | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxTabs | typingsSlinky.devextreme.devextremeStrings.dxTextBox | typingsSlinky.devextreme.devextremeStrings.dxButtonGroup | typingsSlinky.devextreme.devextremeStrings.dxDropDownButton
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
  }
  
}

