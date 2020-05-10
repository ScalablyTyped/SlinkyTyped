package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipInstance[T /* <: TooltipOption */] extends js.Object {
  var config: T = js.native
  var element: Element = js.native
  var tip: HTMLElement = js.native
}

object TooltipInstance {
  @scala.inline
  def apply[T](config: T, element: Element, tip: HTMLElement): TooltipInstance[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipInstance[T]]
  }
  @scala.inline
  implicit class TooltipInstanceOps[Self[t] <: TooltipInstance[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConfig(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTip(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

