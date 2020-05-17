package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndZoomTool extends js.Object {
  def close(): Unit = js.native
  def ondrawend(event: typingsSlinky.baidumapWebSdk.anon.Bounds): Unit = js.native
  def open(): Boolean = js.native
}

object DragAndZoomTool {
  @scala.inline
  def apply(
    close: () => Unit,
    ondrawend: typingsSlinky.baidumapWebSdk.anon.Bounds => Unit,
    open: () => Boolean
  ): DragAndZoomTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DragAndZoomTool]
  }
  @scala.inline
  implicit class DragAndZoomToolOps[Self <: DragAndZoomTool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOndrawend(value: typingsSlinky.baidumapWebSdk.anon.Bounds => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrawend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

