package typingsSlinky.materialUi.MaterialUI

import slinky.core.ReactComponentClass
import typingsSlinky.materialUi.AnonText
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteProps[DataItem] extends TextFieldProps {
  var anchorOrigin: js.UndefOr[origin] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[ReactComponentClass[PopoverAnimationProps]] = js.native
  var dataSource: js.Array[DataItem] = js.native
  var dataSourceConfig: js.UndefOr[AnonText] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[
    js.Function3[/* searchText */ String, /* key */ String, /* item */ DataItem, Boolean]
  ] = js.native
  var listStyle: js.UndefOr[CSSProperties] = js.native
  var maxSearchResults: js.UndefOr[Double] = js.native
  var menuCloseDelay: js.UndefOr[Double] = js.native
  var menuProps: js.UndefOr[js.Any] = js.native
  var menuStyle: js.UndefOr[CSSProperties] = js.native
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ Double, Unit]] = js.native
  var onUpdateInput: js.UndefOr[js.Function2[/* searchText */ String, /* dataSource */ js.Array[DataItem], Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var openOnFocus: js.UndefOr[Boolean] = js.native
  var popoverProps: js.UndefOr[PopoverProps] = js.native
  var searchText: js.UndefOr[String] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var textFieldStyle: js.UndefOr[CSSProperties] = js.native
}

object AutoCompleteProps {
  @scala.inline
  def apply[DataItem](dataSource: js.Array[DataItem]): AutoCompleteProps[DataItem] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps[DataItem]]
  }
  @scala.inline
  implicit class AutoCompletePropsOps[Self[dataitem] <: AutoCompleteProps[dataitem], DataItem] (val x: Self[DataItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DataItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DataItem] with Other]
    @scala.inline
    def withDataSource(value: js.Array[DataItem]): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorOrigin(value: origin): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOrigin: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: ReactComponentClass[PopoverAnimationProps]): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceConfig(value: AnonText): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceConfig: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocusRipple(value: Boolean): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocusRipple: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocusRipple")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: CSSProperties): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSearchResults(value: Double): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSearchResults: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSearchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuCloseDelay(value: Double): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuCloseDelay: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuProps(value: js.Any): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuProps: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuStyle(value: CSSProperties): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuStyle: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewRequest(value: (/* chosenRequest */ DataItem, /* index */ Double) => Unit): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNewRequest: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdateInput(value: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Unit): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateInput")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdateInput: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnFocus(value: Boolean): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnFocus: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: PopoverProps): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchText: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetOrigin(value: origin): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOrigin: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFieldStyle(value: CSSProperties): Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFieldStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFieldStyle: Self[DataItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFieldStyle")(js.undefined)
        ret
    }
  }
  
}

