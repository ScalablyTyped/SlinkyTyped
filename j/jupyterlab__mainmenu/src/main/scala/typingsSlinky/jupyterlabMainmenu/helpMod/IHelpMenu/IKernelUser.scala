package typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IHelpMenu's semantic extension points.
  */
@js.native
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to get the kernel for a widget.
    */
  def getKernel(widget: T): IKernelConnection | Null = js.native
}

object IKernelUser {
  @scala.inline
  def apply[T](getKernel: T => IKernelConnection | Null, tracker: IWidgetTracker[T]): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(getKernel = js.Any.fromFunction1(getKernel), tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelUser[T]]
  }
  @scala.inline
  implicit class IKernelUserOps[Self[t] <: IKernelUser[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetKernel(value: T => IKernelConnection | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKernel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

