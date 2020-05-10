package typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that has some cleanup action associated
  * with it in addition to merely closing its widget in the main area.
  */
@js.native
trait ICloseAndCleaner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the cleanup action.
    */
  var action: String = js.native
  /**
    * A label to use for the activity that is being cleaned up.
    */
  var name: String = js.native
  /**
    * A function to perform the close and cleanup action.
    */
  def closeAndCleanup(widget: T): js.Promise[Unit] = js.native
}

object ICloseAndCleaner {
  @scala.inline
  def apply[T](action: String, closeAndCleanup: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): ICloseAndCleaner[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloseAndCleaner[T]]
  }
  @scala.inline
  implicit class ICloseAndCleanerOps[Self[t] <: ICloseAndCleaner[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAction(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseAndCleanup(value: T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAndCleanup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

