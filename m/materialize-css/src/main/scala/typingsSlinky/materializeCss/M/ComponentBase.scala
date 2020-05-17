package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentBase[TOptions] extends js.Object {
  /**
    * The DOM element the plugin was initialized with
    */
  var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  var options: TOptions = js.native
}

object ComponentBase {
  @scala.inline
  def apply[TOptions](el: Element, options: TOptions): ComponentBase[TOptions] = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentBase[TOptions]]
  }
  @scala.inline
  implicit class ComponentBaseOps[Self[toptions] <: ComponentBase[toptions], TOptions] (val x: Self[TOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOptions] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOptions] with Other]
    @scala.inline
    def withEl(value: Element): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TOptions): Self[TOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

