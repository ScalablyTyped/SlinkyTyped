package typingsSlinky.baidumapWebSdk.BMap

import typingsSlinky.baidumapWebSdk.anon.Distance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceTool extends js.Object {
  def close(): Unit = js.native
  def ondrawend(event: Distance): Unit = js.native
  def open(): Boolean = js.native
}

object DistanceTool {
  @scala.inline
  def apply(close: () => Unit, ondrawend: Distance => Unit, open: () => Boolean): DistanceTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DistanceTool]
  }
  @scala.inline
  implicit class DistanceToolOps[Self <: DistanceTool] (val x: Self) extends AnyVal {
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
    def withOndrawend(value: Distance => Unit): Self = {
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

