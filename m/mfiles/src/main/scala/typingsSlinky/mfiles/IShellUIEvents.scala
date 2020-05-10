package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellUIEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellUIEvents]
  }
  @scala.inline
  implicit class IShellUIEventsOps[Self <: IShellUIEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnNewCommonDialogShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewCommonDialogShellFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewCommonDialogShellFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewCommonDialogShellFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewEmbeddedShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewEmbeddedShellFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewEmbeddedShellFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewEmbeddedShellFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewNormalShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewNormalShellFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewNormalShellFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewNormalShellFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewShellFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewShellFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnNewShellFrame")(js.undefined)
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

