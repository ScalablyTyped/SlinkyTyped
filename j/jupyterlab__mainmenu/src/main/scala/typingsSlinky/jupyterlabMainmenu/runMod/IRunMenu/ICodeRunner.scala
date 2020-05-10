package typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that runs code, which may be
  * registered with the Run menu.
  */
@js.native
trait ICodeRunner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A string label for the thing that is being run,
    * which is used to populate the menu labels.
    */
  var noun: String = js.native
  /**
    * A function to restart and run all the code hosted by the widget, which
    * returns a promise of whether the action was performed.
    */
  var restartAndRunAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  /**
    * A function to run a chunk of code.
    */
  var run: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  /**
    * A function to run the entirety of the code hosted by the widget.
    */
  var runAll: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
}

object ICodeRunner {
  @scala.inline
  def apply[T](noun: String, tracker: IWidgetTracker[T]): ICodeRunner[T] = {
    val __obj = js.Dynamic.literal(noun = noun.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeRunner[T]]
  }
  @scala.inline
  implicit class ICodeRunnerOps[Self[t] <: ICodeRunner[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNoun(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartAndRunAll(value: /* widget */ T => js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartAndRunAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestartAndRunAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartAndRunAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: /* widget */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRun: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAll(value: /* widget */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRunAll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAll")(js.undefined)
        ret
    }
  }
  
}

