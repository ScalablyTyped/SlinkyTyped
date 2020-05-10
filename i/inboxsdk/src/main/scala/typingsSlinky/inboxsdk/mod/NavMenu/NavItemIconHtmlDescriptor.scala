package typingsSlinky.inboxsdk.mod.NavMenu

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemIconHtmlDescriptor
  extends NavItemDescriptorBase
     with NavItemDescriptor {
  var iconElement: js.UndefOr[HTMLElement] = js.native
}

object NavItemIconHtmlDescriptor {
  @scala.inline
  def apply(name: String): NavItemIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemIconHtmlDescriptor]
  }
  @scala.inline
  implicit class NavItemIconHtmlDescriptorOps[Self <: NavItemIconHtmlDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconElement")(js.undefined)
        ret
    }
  }
  
}

