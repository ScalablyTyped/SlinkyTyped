package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.after
import typingsSlinky.devextreme.devextremeStrings.before
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopupToolbarItem extends js.Object {
  /** Specifies whether a toolbar item should be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Specifies html code inserted into the toolbar item element. */
  var html: js.UndefOr[String] = js.native
  /** Specifies a location for the item on the toolbar. */
  var location: js.UndefOr[after | before | center] = js.native
  /** Configures the DevExtreme widget used as a toolbar item. */
  var options: js.UndefOr[js.Any] = js.native
  /** Specifies a template that should be used to render this item only. */
  var template: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.core.template] = js.native
  /** Specifies text displayed for the toolbar item. */
  var text: js.UndefOr[String] = js.native
  /** Specifies whether the item is displayed on a top or bottom toolbar. */
  var toolbar: js.UndefOr[bottom | top] = js.native
  /** Specifies whether or not a widget item must be displayed. */
  var visible: js.UndefOr[Boolean] = js.native
  /** A widget that presents a toolbar item. */
  var widget: js.UndefOr[
    typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxButton | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxMenu | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxTabs | typingsSlinky.devextreme.devextremeStrings.dxTextBox | typingsSlinky.devextreme.devextremeStrings.dxButtonGroup | typingsSlinky.devextreme.devextremeStrings.dxDropDownButton
  ] = js.native
}

object dxPopupToolbarItem {
  @scala.inline
  def apply(): dxPopupToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopupToolbarItem]
  }
  @scala.inline
  implicit class dxPopupToolbarItemOps[Self <: dxPopupToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
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
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: typingsSlinky.devextreme.mod.DevExpress.core.template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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

