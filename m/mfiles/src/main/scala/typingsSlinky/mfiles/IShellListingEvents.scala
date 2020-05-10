package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellListingEvents extends IEvents {
  var OnContentChanged: js.UndefOr[js.Function1[/* items */ IShellItems, Unit]] = js.native
  var OnListingActivated: js.UndefOr[js.Function1[/* oldListing */ Null | IShellListing, Unit]] = js.native
  var OnListingDeactivated: js.UndefOr[js.Function1[/* newListing */ Null | IShellListing, Unit]] = js.native
  var OnSelectedItemsChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnSelectionChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnShowContextMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnShowMainMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellListingEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellListingEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellListingEvents]
  }
  @scala.inline
  implicit class IShellListingEventsOps[Self <: IShellListingEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnContentChanged(value: /* items */ IShellItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnContentChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnContentChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnListingActivated(value: /* oldListing */ Null | IShellListing => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnListingActivated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnListingActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnListingActivated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnListingDeactivated(value: /* newListing */ Null | IShellListing => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnListingDeactivated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnListingDeactivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnListingDeactivated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectedItemsChanged(value: /* selectedItems */ IShellItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSelectedItemsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectedItemsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSelectedItemsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* selectedItems */ IShellItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowContextMenu(value: /* selectedItems */ IShellItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowMainMenu(value: /* selectedItems */ IShellItems => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowMainMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowMainMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowMainMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnStop")(js.undefined)
        ret
    }
  }
  
}

