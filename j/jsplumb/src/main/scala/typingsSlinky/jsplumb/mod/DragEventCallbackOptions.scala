package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEventCallbackOptions extends js.Object {
  var drag: js.Object = js.native
   // The associated Drag instance
  var e: MouseEvent = js.native
  var el: HTMLElement = js.native
   // element being dragged
  var pos: js.Tuple2[Double, Double] = js.native
}

object DragEventCallbackOptions {
  @scala.inline
  def apply(drag: js.Object, e: MouseEvent, el: HTMLElement, pos: js.Tuple2[Double, Double]): DragEventCallbackOptions = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEventCallbackOptions]
  }
  @scala.inline
  implicit class DragEventCallbackOptionsOps[Self <: DragEventCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

