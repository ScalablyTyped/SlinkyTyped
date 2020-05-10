package typingsSlinky.hookrouter.mod.HookRouter

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.AnchorHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  @JSName("href")
  var href_AProps: String = js.native
}

object AProps {
  @scala.inline
  def apply(href: String): AProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AProps]
  }
  @scala.inline
  implicit class APropsOps[Self <: AProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

