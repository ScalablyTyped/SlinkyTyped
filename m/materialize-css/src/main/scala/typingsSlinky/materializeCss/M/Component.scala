package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[TOptions] extends ComponentBase[TOptions] {
  /**
    * Destroy plugin instance and teardown
    */
  def destroy(): Unit = js.native
}

object Component {
  @scala.inline
  def apply[TOptions](destroy: () => Unit, el: Element, options: TOptions): Component[TOptions] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[TOptions]]
  }
  @scala.inline
  implicit class ComponentOps[Self[toptions] <: Component[toptions], TOptions] (val x: Self[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOptions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOptions] with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

