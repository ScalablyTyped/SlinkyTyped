package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellPaneContainerEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.native
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, Unit]] = js.native
  var OnPaneResized: js.UndefOr[js.Function0[Unit]] = js.native
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.native
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellPaneContainerEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
  @scala.inline
  implicit class IShellPaneContainerEventsOps[Self <: IShellPaneContainerEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnHidePane(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnHidePane")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHidePane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnHidePane")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMinimizedStateChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnMinimizedStateChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMinimizedStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnMinimizedStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewTab(value: /* tab */ IShellPaneTab => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewTab")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaneResized(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPaneResized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPaneResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPaneResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowPane(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowPane")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnShowPane")(js.undefined)
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
    @scala.inline
    def withOnTabSelected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnTabSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTabSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnTabSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabUnselected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnTabUnselected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTabUnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnTabUnselected")(js.undefined)
        ret
    }
  }
  
}

