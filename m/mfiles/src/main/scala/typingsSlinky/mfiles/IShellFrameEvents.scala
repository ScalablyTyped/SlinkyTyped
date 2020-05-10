package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellFrameEvents extends IEvents {
  var OnActiveListingChanged: js.UndefOr[
    js.Function2[/* oldListing */ Null | IShellListing, /* newListing */ IShellListing, Unit]
  ] = js.native
  var OnNewBottomPane: js.UndefOr[
    js.Function1[/* bottomPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.native
  var OnNewCommands: js.UndefOr[js.Function1[/* commands */ ICommands, Unit | ICommandsEvents]] = js.native
  var OnNewRightPane: js.UndefOr[
    js.Function1[/* rightPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.native
  var OnNewSearchPane: js.UndefOr[js.Function1[/* searchPane */ ISearchPane, Unit | ISearchPaneEvents]] = js.native
  var OnNewShellListing: js.UndefOr[js.Function1[/* shellListing */ IShellListing, Unit | IShellListingEvents]] = js.native
  var OnNewTaskPane: js.UndefOr[js.Function1[/* taskPane */ ITaskPane, Unit | ITaskPaneEvents]] = js.native
  var OnShowMainMenu: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellFrameEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellFrameEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellFrameEvents]
  }
  @scala.inline
  implicit class IShellFrameEventsOps[Self <: IShellFrameEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnActiveListingChanged(value: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnActiveListingChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActiveListingChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnActiveListingChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewBottomPane(value: /* bottomPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewBottomPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewBottomPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewBottomPane")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewCommands(value: /* commands */ ICommands => Unit | ICommandsEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewCommands")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewRightPane(value: /* rightPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewRightPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewRightPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewRightPane")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewSearchPane(value: /* searchPane */ ISearchPane => Unit | ISearchPaneEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewSearchPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewSearchPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewSearchPane")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewShellListing(value: /* shellListing */ IShellListing => Unit | IShellListingEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewShellListing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewShellListing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewShellListing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewTaskPane(value: /* taskPane */ ITaskPane => Unit | ITaskPaneEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewTaskPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewTaskPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewTaskPane")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowMainMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowMainMenu")(js.Any.fromFunction0(value))
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

