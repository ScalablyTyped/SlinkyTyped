package typingsSlinky.reactBootstrap.navbarMod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the classes below aren't present in lib/
  */
@js.native
trait NavbarLinkProps
  extends AllHTMLAttributes[NavbarLink]
     with ClassAttributes[NavbarLink] {
  @JSName("href")
  var href_NavbarLinkProps: String = js.native
  @JSName("onClick")
  var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[_]] = js.native
}

object NavbarLinkProps {
  @scala.inline
  def apply(href: String): NavbarLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarLinkProps]
  }
  @scala.inline
  implicit class NavbarLinkPropsOps[Self <: NavbarLinkProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

