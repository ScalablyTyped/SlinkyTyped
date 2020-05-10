package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingMessageDescriptorHtmlElement
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  var el: HTMLElement = js.native
}

object SavingMessageDescriptorHtmlElement {
  @scala.inline
  def apply(el: HTMLElement): SavingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtmlElement]
  }
  @scala.inline
  implicit class SavingMessageDescriptorHtmlElementOps[Self <: SavingMessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

