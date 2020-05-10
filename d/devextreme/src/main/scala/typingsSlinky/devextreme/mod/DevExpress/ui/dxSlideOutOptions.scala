package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonComponentDxSlideOut
import typingsSlinky.devextreme.devextremeStrings.inverted
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutOptions extends CollectionWidgetOptions[dxSlideOut] {
  /** Specifies a custom template for the widget content. Rendered only once - when the widget is created. */
  var contentTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxSlideOutOptions: js.UndefOr[
    String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxSlideOutOptions: js.UndefOr[js.Array[String | dxSlideOutItem | _]] = js.native
  /** Specifies a custom template for group captions. */
  var menuGroupTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ js.Any, 
      String | Element | JQuery
    ])
  ] = js.native
  /** A Boolean value specifying whether or not to display a grouped menu. */
  var menuGrouped: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for menu items. */
  var menuItemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies the current menu position. */
  var menuPosition: js.UndefOr[inverted | normal] = js.native
  /** Specifies whether or not the slide-out menu is displayed. */
  var menuVisible: js.UndefOr[Boolean] = js.native
  /** A function that is executed when a group menu item is rendered. */
  var onMenuGroupRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxSlideOut, _]] = js.native
  /** A function that is executed when a regular menu item is rendered. */
  var onMenuItemRendered: js.UndefOr[js.Function1[/* e */ AnonComponentDxSlideOut, _]] = js.native
  /** Indicates whether the menu can be shown/hidden by swiping the widget's main panel. */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}

object dxSlideOutOptions {
  @scala.inline
  def apply(): dxSlideOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutOptions]
  }
  @scala.inline
  implicit class dxSlideOutOptionsOps[Self <: dxSlideOutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTemplateFunction1(value: /* container */ dxElement => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function1[/* container */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxSlideOutItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withItems(value: js.Array[String | dxSlideOutItem | _]): Self = {
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
    def withMenuGroupTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGroupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuGroupTemplateFunction3(
      value: (/* groupData */ js.Any, /* groupIndex */ Double, /* groupElement */ js.Any) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGroupTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMenuGroupTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* groupData */ js.Any, 
          /* groupIndex */ Double, 
          /* groupElement */ js.Any, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGroupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuGroupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGroupTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMenuItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
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
    def withMenuPosition(value: inverted | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuGroupRendered(value: /* e */ AnonComponentDxSlideOut => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuGroupRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuGroupRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuGroupRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuItemRendered(value: /* e */ AnonComponentDxSlideOut => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuItemRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuItemRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuItemRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(js.undefined)
        ret
    }
  }
  
}

