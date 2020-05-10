package typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a command to create a console for an activity.
  */
@js.native
trait IConsoleCreator[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the activity for which a console is being created.
    */
  var name: String = js.native
  /**
    * The function to create the console.
    */
  def createConsole(widget: T): js.Promise[Unit] = js.native
}

object IConsoleCreator {
  @scala.inline
  def apply[T](createConsole: T => js.Promise[Unit], name: String, tracker: IWidgetTracker[T]): IConsoleCreator[T] = {
    val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
  @scala.inline
  implicit class IConsoleCreatorOps[Self[t] <: IConsoleCreator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCreateConsole(value: T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createConsole")(js.Any.fromFunction1(value))
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

