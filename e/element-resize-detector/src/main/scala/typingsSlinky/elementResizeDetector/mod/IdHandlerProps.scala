package typingsSlinky.elementResizeDetector.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdHandlerProps extends js.Object {
  def get(element: HTMLElement, readonly: Boolean): String = js.native
  def set(element: HTMLElement): String = js.native
}

object IdHandlerProps {
  @scala.inline
  def apply(get: (HTMLElement, Boolean) => String, set: HTMLElement => String): IdHandlerProps = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IdHandlerProps]
  }
  @scala.inline
  implicit class IdHandlerPropsOps[Self <: IdHandlerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (HTMLElement, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

