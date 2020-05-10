package typingsSlinky.agGrid.horizontalResizeServiceMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalResizeParams extends js.Object {
  var eResizeBar: HTMLElement = js.native
  def onResizeEnd(delta: Double): Unit = js.native
  def onResizeStart(shiftKey: Boolean): Unit = js.native
  def onResizing(delta: Double): Unit = js.native
}

object HorizontalResizeParams {
  @scala.inline
  def apply(
    eResizeBar: HTMLElement,
    onResizeEnd: Double => Unit,
    onResizeStart: Boolean => Unit,
    onResizing: Double => Unit
  ): HorizontalResizeParams = {
    val __obj = js.Dynamic.literal(eResizeBar = eResizeBar.asInstanceOf[js.Any], onResizeEnd = js.Any.fromFunction1(onResizeEnd), onResizeStart = js.Any.fromFunction1(onResizeStart), onResizing = js.Any.fromFunction1(onResizing))
    __obj.asInstanceOf[HorizontalResizeParams]
  }
  @scala.inline
  implicit class HorizontalResizeParamsOps[Self <: HorizontalResizeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEResizeBar(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eResizeBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResizeEnd(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResizeStart(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResizing(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizing")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

