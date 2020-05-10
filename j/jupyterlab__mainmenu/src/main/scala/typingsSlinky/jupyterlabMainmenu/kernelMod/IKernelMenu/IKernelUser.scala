package typingsSlinky.jupyterlabMainmenu.kernelMod.IKernelMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IKernelMenu's semantic extension points.
  */
@js.native
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to change the kernel.
    */
  var changeKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  /**
    * A function to interrupt the kernel.
    */
  var interruptKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
  /**
    * A noun to use for the restart and clear all command.
    */
  var noun: js.UndefOr[String] = js.native
  /**
    * A function to restart the kernel, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  /**
    * A function to restart the kernel and clear the widget, which
    * returns a promise of whether the kernel was restarted.
    */
  var restartKernelAndClear: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Boolean]]] = js.native
  /**
    * A function to shut down the kernel.
    */
  var shutdownKernel: js.UndefOr[js.Function1[/* widget */ T, js.Promise[Unit]]] = js.native
}

object IKernelUser {
  @scala.inline
  def apply[T](tracker: IWidgetTracker[T]): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelUser[T]]
  }
  @scala.inline
  implicit class IKernelUserOps[Self[t] <: IKernelUser[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChangeKernel(value: /* widget */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChangeKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withInterruptKernel(value: /* widget */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInterruptKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withNoun(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoun: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartKernel(value: /* widget */ T => js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestartKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartKernel")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartKernelAndClear(value: /* widget */ T => js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartKernelAndClear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRestartKernelAndClear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartKernelAndClear")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownKernel(value: /* widget */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownKernel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShutdownKernel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownKernel")(js.undefined)
        ret
    }
  }
  
}

