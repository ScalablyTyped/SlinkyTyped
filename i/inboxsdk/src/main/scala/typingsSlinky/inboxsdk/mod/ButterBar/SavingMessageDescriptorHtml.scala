package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingMessageDescriptorHtml
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  var html: String = js.native
}

object SavingMessageDescriptorHtml {
  @scala.inline
  def apply(html: String): SavingMessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtml]
  }
  @scala.inline
  implicit class SavingMessageDescriptorHtmlOps[Self <: SavingMessageDescriptorHtml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

