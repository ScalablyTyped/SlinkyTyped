package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverOption extends TooltipOption {
  /**
    * Default content value if `data-content` attribute isn't present.
    * If a function is given, it will be called with its `this` reference
    * set to the element that the popover is attached to.
    *
    * @default ""
    */
  var content: js.UndefOr[String | Element | (js.ThisFunction0[/* this */ Element, String | Element])] = js.native
}

object PopoverOption {
  @scala.inline
  def apply(): PopoverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverOption]
  }
  @scala.inline
  implicit class PopoverOptionOps[Self <: PopoverOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | Element | (js.ThisFunction0[/* this */ Element, String | Element])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

