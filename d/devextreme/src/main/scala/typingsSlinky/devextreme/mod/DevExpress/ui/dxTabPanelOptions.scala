package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonElementEventItemData
import typingsSlinky.devextreme.AnonElementItemDataItemElement
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTabPanelOptions extends dxMultiViewOptions[dxTabPanel] {
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxTabPanelOptions: js.UndefOr[
    String | (js.Array[String | dxTabPanelItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** Specifies a custom template for item titles. */
  var itemTitleTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxTabPanelOptions: js.UndefOr[js.Array[String | dxTabPanelItem | _]] = js.native
  /** A function that is executed when a tab is clicked or tapped. */
  var onTitleClick: js.UndefOr[(js.Function1[/* e */ AnonElementEventItemData, _]) | String] = js.native
  /** A function that is executed when a tab has been held for a specified period. */
  var onTitleHold: js.UndefOr[js.Function1[/* e */ AnonElementEventItemData, _]] = js.native
  /** A function that is executed after a tab is rendered. */
  var onTitleRendered: js.UndefOr[js.Function1[/* e */ AnonElementItemDataItemElement, _]] = js.native
  /** Specifies whether to repaint only those elements whose data changed. */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying if tabs in the title are scrolled by content. */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  /** A Boolean indicating whether or not to add scrolling support for tabs in the title. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether navigation buttons should be available when tabs exceed the widget's width. */
  var showNavButtons: js.UndefOr[Boolean] = js.native
}

object dxTabPanelOptions {
  @scala.inline
  def apply(): dxTabPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelOptions]
  }
  @scala.inline
  implicit class dxTabPanelOptionsOps[Self <: dxTabPanelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxTabPanelItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withItemTitleTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTitleTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withItemTitleTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTitleTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTitleTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxTabPanelItem | _]): Self = {
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
    def withOnTitleClickFunction1(value: /* e */ AnonElementEventItemData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTitleClick(value: (js.Function1[/* e */ AnonElementEventItemData, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTitleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleHold(value: /* e */ AnonElementEventItemData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTitleHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTitleRendered(value: /* e */ AnonElementItemDataItemElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTitleRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaintChangesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepaintChangesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(js.undefined)
        ret
    }
  }
  
}

