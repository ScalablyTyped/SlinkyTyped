package typingsSlinky.elementResizeDetector.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Erd extends js.Object {
  def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
  def removeAllListeners(element: HTMLElement): Unit = js.native
  def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit = js.native
  def uninstall(element: HTMLElement): Unit = js.native
}

object Erd {
  @scala.inline
  def apply(
    listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    removeAllListeners: HTMLElement => Unit,
    removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit,
    uninstall: HTMLElement => Unit
  ): Erd = {
    val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2(listenTo), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), uninstall = js.Any.fromFunction1(uninstall))
    __obj.asInstanceOf[Erd]
  }
  @scala.inline
  implicit class ErdOps[Self <: Erd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenTo(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAllListeners(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveListener(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUninstall(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstall")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

