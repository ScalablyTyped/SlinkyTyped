package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.CancelComponentElement
import typingsSlinky.devextreme.anon.ComponentElementModel
import typingsSlinky.devextreme.anon.Delay
import typingsSlinky.devextreme.anon.Position
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxContextMenuOptions extends dxMenuBaseOptions[dxContextMenu] {
  /** Specifies whether to close the ContextMenu if a user clicks outside it. */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxContextMenuOptions: js.UndefOr[String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions] = js.native
  /** Holds an array of menu items. */
  @JSName("items")
  var items_dxContextMenuOptions: js.UndefOr[js.Array[dxContextMenuItem]] = js.native
  /** A function that is executed after the ContextMenu is hidden. */
  var onHidden: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.native
  /** A function that is executed before the ContextMenu is hidden. */
  var onHiding: js.UndefOr[js.Function1[/* e */ CancelComponentElement, _]] = js.native
  /** A function that is executed before the ContextMenu is positioned. */
  var onPositioning: js.UndefOr[js.Function1[/* e */ Position, _]] = js.native
  /** A function that is executed before the ContextMenu is shown. */
  var onShowing: js.UndefOr[js.Function1[/* e */ CancelComponentElement, _]] = js.native
  /** A function that is executed after the ContextMenu is shown. */
  var onShown: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.native
  /** An object defining widget positioning options. */
  var position: js.UndefOr[positionConfig] = js.native
  /** Specifies options for displaying the widget. */
  var showEvent: js.UndefOr[Delay | String] = js.native
  /** Specifies the direction at which submenus are displayed. */
  var submenuDirection: js.UndefOr[auto | left | right] = js.native
  /** The target element associated with the context menu. */
  var target: js.UndefOr[String | Element | JQuery] = js.native
}

object dxContextMenuOptions {
  @scala.inline
  def apply(): dxContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxContextMenuOptions]
  }
  @scala.inline
  implicit class dxContextMenuOptionsOps[Self <: dxContextMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnOutsideClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutsideClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions): Self = {
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
    def withItems(value: js.Array[dxContextMenuItem]): Self = {
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
    def withOnHidden(value: /* e */ ComponentElementModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHiding(value: /* e */ CancelComponentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHiding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPositioning(value: /* e */ Position => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositioning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositioning")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowing(value: /* e */ CancelComponentElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: /* e */ ComponentElementModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: positionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEvent(value: Delay | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuDirection(value: auto | left | right): Self = {
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
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

