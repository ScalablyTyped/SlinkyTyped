package typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Go to Line.
  */
@js.native
trait IGoToLiner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a go to line command for the activity.
    */
  var goToLine: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
}

object IGoToLiner {
  @scala.inline
  def apply[T](tracker: IWidgetTracker[T]): IGoToLiner[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGoToLiner[T]]
  }
  @scala.inline
  implicit class IGoToLinerOps[Self[t] <: IGoToLiner[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGoToLine(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToLine: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLine")(js.undefined)
        ret
    }
  }
  
}

