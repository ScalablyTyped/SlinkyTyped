package typingsSlinky.rcTable.resizeContextMod

import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeContextProps extends js.Object {
  def onColumnResize(columnKey: Key, width: Double): Unit = js.native
}

object ResizeContextProps {
  @scala.inline
  def apply(onColumnResize: (Key, Double) => Unit): ResizeContextProps = {
    val __obj = js.Dynamic.literal(onColumnResize = js.Any.fromFunction2(onColumnResize))
    __obj.asInstanceOf[ResizeContextProps]
  }
  @scala.inline
  implicit class ResizeContextPropsOps[Self <: ResizeContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnColumnResize(value: (Key, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnResize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

