package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonEventJQueryEvent
import typingsSlinky.devextreme.AnonItemIndexModel
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownMenuOptions extends WidgetOptions[dxDropDownMenu] {
  /** The name of the icon to be displayed by the DropDownMenu button. */
  var buttonIcon: js.UndefOr[String] = js.native
  /** The text displayed in the DropDownMenu button. */
  var buttonText: js.UndefOr[String] = js.native
  /** Overriden */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.native
  /** Specifies a custom template for items. */
  var itemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** An array of items displayed by the widget. */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** A function that is executed when the button that opens the drop-down menu is clicked or tapped. */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEvent, _]) | String] = js.native
  /** A function that is executed when a menu item is clicked or tapped. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonItemIndexModel, _]) | String] = js.native
  /** Specifies whether or not the drop-down menu is displayed. */
  var opened: js.UndefOr[Boolean] = js.native
  /** Specifies the popup element's height in pixels. */
  var popupHeight: js.UndefOr[Double | String | js.Function] = js.native
  /** Specifies the popup element's width in pixels. */
  var popupWidth: js.UndefOr[Double | String | js.Function] = js.native
  /** Specifies whether or not to show the drop down menu within a Popover widget. */
  var usePopover: js.UndefOr[Boolean] = js.native
}

object dxDropDownMenuOptions {
  @scala.inline
  def apply(): dxDropDownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownMenuOptions]
  }
  @scala.inline
  implicit class dxDropDownMenuOptionsOps[Self <: dxDropDownMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[_] | DataSource | DataSourceOptions): Self = {
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
    def withItems(value: js.Array[_]): Self = {
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
    def withOnButtonClickFunction1(value: /* e */ AnonEventJQueryEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnButtonClick(value: (js.Function1[/* e */ AnonEventJQueryEvent, _]) | String): Self = {
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
    def withOnItemClickFunction1(value: /* e */ AnonItemIndexModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnItemClick(value: (js.Function1[/* e */ AnonItemIndexModel, _]) | String): Self = {
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
    def withPopupHeight(value: Double | String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidth(value: Double | String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePopover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePopover")(js.undefined)
        ret
    }
  }
  
}

