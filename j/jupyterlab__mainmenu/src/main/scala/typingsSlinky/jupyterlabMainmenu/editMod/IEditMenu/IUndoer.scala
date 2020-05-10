package typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Undo/Redo.
  */
@js.native
trait IUndoer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a redo command for the activity.
    */
  var redo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  /**
    * Execute an undo command for the activity.
    */
  var undo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
}

object IUndoer {
  @scala.inline
  def apply[T](tracker: IWidgetTracker[T]): IUndoer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUndoer[T]]
  }
  @scala.inline
  implicit class IUndoerOps[Self[t] <: IUndoer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRedo(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRedo: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: /* widget */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUndo: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
  }
  
}

