package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonEventItemData
import typingsSlinky.devextreme.AnonRemovedItems
import typingsSlinky.devextreme.devextremeStrings.contained
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.outlined
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxButtonGroupOptions extends WidgetOptions[dxButtonGroup] {
  /** Specifies a template for all the buttons in the group. */
  var buttonTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @deprecated Use the buttonTemplate option instead. */
  /** Specifies a custom button template. */
  var itemTemplate: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.core.template | js.Function] = js.native
  /** Configures buttons in the group. */
  var items: js.UndefOr[js.Array[dxButtonGroupItem]] = js.native
  /** Specifies which data field provides keys used to distinguish between the selected buttons. */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** A function that is executed when a button is clicked or tapped. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonEventItemData, _]] = js.native
  /** A function that is executed when a button is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonRemovedItems, _]] = js.native
  /** Contains the keys of the selected buttons and allows selecting buttons initially. */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.native
  /** Contains the data objects that correspond to the selected buttons. The data objects are taken from the items array. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether a single or multiple buttons can be in the selected state simultaneously. */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  /** Specifies how buttons in the group are styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
}

object dxButtonGroupOptions {
  @scala.inline
  def apply(): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
  @scala.inline
  implicit class dxButtonGroupOptionsOps[Self <: dxButtonGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonTemplateFunction2(value: (/* buttonData */ js.Any, /* buttonContent */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withButtonTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* buttonData */ js.Any, /* buttonContent */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTemplate(value: typingsSlinky.devextreme.mod.DevExpress.core.template | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[dxButtonGroupItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: /* e */ AnonEventItemData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonRemovedItems => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStylingMode(value: text | outlined | contained): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylingMode")(js.undefined)
        ret
    }
  }
  
}

