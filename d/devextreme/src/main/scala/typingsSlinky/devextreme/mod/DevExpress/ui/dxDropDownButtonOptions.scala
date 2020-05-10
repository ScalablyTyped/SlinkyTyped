package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonItemElementModel
import typingsSlinky.devextreme.AnonPreviousItem
import typingsSlinky.devextreme.AnonSelectedItem
import typingsSlinky.devextreme.devextremeStrings.contained
import typingsSlinky.devextreme.devextremeStrings.outlined
import typingsSlinky.devextreme.devextremeStrings.text
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownButtonOptions extends WidgetOptions[dxDropDownButton] {
  /** Provides data for the drop-down menu. */
  var dataSource: js.UndefOr[String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions] = js.native
  /** Specifies whether to wait until the drop-down menu is opened the first time to render its content. */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** Specifies the data field whose values should be displayed in the drop-down menu. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* itemData */ js.Any, String])] = js.native
  /** Specifies custom content for the drop-down field. */
  var dropDownContentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ (js.Array[String | Double | _]) | DataSource, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Configures the drop-down field. */
  var dropDownOptions: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  /** Specifies the button's icon. */
  var icon: js.UndefOr[String] = js.native
  /** Specifies a custom template for drop-down menu items. */
  var itemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Provides drop-down menu items. */
  var items: js.UndefOr[js.Array[dxDropDownButtonItem | _]] = js.native
  /** Specifies which data field provides keys used to distinguish between the selected drop-down menu items. */
  var keyExpr: js.UndefOr[String] = js.native
  /** Specifies text or HTML markup displayed in the drop-down menu when it does not contain any items. */
  var noDataText: js.UndefOr[String] = js.native
  /** A function that is executed when the button is clicked or tapped. If splitButton is true, this function is executed for the action button only. */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ AnonSelectedItem, _]) | String] = js.native
  /** A function that is executed when a drop-down menu item is clicked. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonItemElementModel, _]) | String] = js.native
  /** A function that is executed when an item is selected or selection is canceled. In effect when useSelectMode is true. */
  var onSelectionChanged: js.UndefOr[(js.Function1[/* e */ AnonPreviousItem, _]) | String] = js.native
  /** Specifies whether the drop-down menu is opened. */
  var opened: js.UndefOr[Boolean] = js.native
  /** Contains the selected item's data. Available when useSelectMode is true. */
  var selectedItem: js.UndefOr[String | Double | js.Any] = js.native
  /** Contains the selected item's key and allows you to specify the initially selected item. Applies when useSelectMode is true. */
  var selectedItemKey: js.UndefOr[String | Double] = js.native
  /** Specifies whether the arrow icon should be displayed. */
  var showArrowIcon: js.UndefOr[Boolean] = js.native
  /** Specifies whether to split the button in two: one executes an action, the other opens and closes the drop-down menu. */
  var splitButton: js.UndefOr[Boolean] = js.native
  /** Specifies how the button is styled. */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.native
  /** Specifies the button's text. Applies only if useSelectMode is false. */
  var text: js.UndefOr[String] = js.native
  /** Specifies whether the widget stores the selected drop-down menu item. */
  var useSelectMode: js.UndefOr[Boolean] = js.native
  /** Specifies whether text that exceeds the drop-down list width should be wrapped. */
  var wrapItemText: js.UndefOr[Boolean] = js.native
}

object dxDropDownButtonOptions {
  @scala.inline
  def apply(): dxDropDownButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownButtonOptions]
  }
  @scala.inline
  implicit class dxDropDownButtonOptionsOps[Self <: dxDropDownButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[dxDropDownButtonItem | _]) | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayExprFunction1(value: /* itemData */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* itemData */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownContentTemplateFunction2(
      value: (/* data */ (js.Array[String | Double | _]) | DataSource, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownContentTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDropDownContentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownContentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDownContentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* data */ (js.Array[String | Double | _]) | DataSource, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownContentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownContentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOptions(value: dxPopupOptions[dxPopup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
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
    def withItems(value: js.Array[dxDropDownButtonItem | _]): Self = {
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
    def withKeyExpr(value: String): Self = {
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
    def withNoDataText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnButtonClickFunction1(value: /* e */ AnonSelectedItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnButtonClick(value: (js.Function1[/* e */ AnonSelectedItem, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClickFunction1(value: /* e */ AnonItemElementModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnItemClick(value: (js.Function1[/* e */ AnonItemElementModel, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChangedFunction1(value: /* e */ AnonPreviousItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: (js.Function1[/* e */ AnonPreviousItem, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItem(value: String | Double | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrowIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrowIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitButton")(js.undefined)
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
    def withUseSelectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSelectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapItemText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapItemText")(js.undefined)
        ret
    }
  }
  
}

