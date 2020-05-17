package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.DelayName
import typingsSlinky.devextreme.anon.ModelRootItem
import typingsSlinky.devextreme.anon.RootItem
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.leftOrTop
import typingsSlinky.devextreme.devextremeStrings.onClick
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.rightOrBottom
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMenuOptions extends dxMenuBaseOptions[dxMenu] {
  /** Specifies whether adaptive widget rendering is enabled on small screens. Applies only if the orientation is "horizontal". */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxMenuOptions: js.UndefOr[String | js.Array[dxMenuItem] | DataSource | DataSourceOptions] = js.native
  /** Specifies whether or not the submenu is hidden when the mouse pointer leaves it. */
  var hideSubmenuOnMouseLeave: js.UndefOr[Boolean] = js.native
  /** Holds an array of menu items. */
  @JSName("items")
  var items_dxMenuOptions: js.UndefOr[js.Array[dxMenuItem]] = js.native
  /** A function that is executed after a submenu is hidden. */
  var onSubmenuHidden: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** A function that is executed before a submenu is hidden. */
  var onSubmenuHiding: js.UndefOr[js.Function1[/* e */ ModelRootItem, _]] = js.native
  /** A function that is executed before a submenu is displayed. */
  var onSubmenuShowing: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** A function that is executed after a submenu is displayed. */
  var onSubmenuShown: js.UndefOr[js.Function1[/* e */ RootItem, _]] = js.native
  /** Specifies whether the menu has horizontal or vertical orientation. */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /** Specifies options for showing and hiding the first level submenu. */
  var showFirstSubmenuMode: js.UndefOr[DelayName | onClick | onHover] = js.native
  /** Specifies the direction at which the submenus are displayed. */
  var submenuDirection: js.UndefOr[auto | leftOrTop | rightOrBottom] = js.native
}

object dxMenuOptions {
  @scala.inline
  def apply(): dxMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuOptions]
  }
  @scala.inline
  implicit class dxMenuOptionsOps[Self <: dxMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptivityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptivityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[dxMenuItem] | DataSource | DataSourceOptions): Self = {
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
    def withHideSubmenuOnMouseLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSubmenuOnMouseLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSubmenuOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSubmenuOnMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[dxMenuItem]): Self = {
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
    def withOnSubmenuHidden(value: /* e */ RootItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmenuHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmenuHiding(value: /* e */ ModelRootItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuHiding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmenuHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmenuShowing(value: /* e */ RootItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuShowing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmenuShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmenuShown(value: /* e */ RootItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmenuShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmenuShown")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstSubmenuMode(value: DelayName | onClick | onHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstSubmenuMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstSubmenuMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstSubmenuMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuDirection(value: auto | leftOrTop | rightOrBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(js.undefined)
        ret
    }
  }
  
}

