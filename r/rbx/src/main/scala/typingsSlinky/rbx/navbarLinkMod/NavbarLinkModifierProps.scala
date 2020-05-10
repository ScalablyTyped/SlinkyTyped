package typingsSlinky.rbx.navbarLinkMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarLinkModifierProps extends js.Object {
  var arrowless: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
}

object NavbarLinkModifierProps {
  @scala.inline
  def apply(): NavbarLinkModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarLinkModifierProps]
  }
  @scala.inline
  implicit class NavbarLinkModifierPropsOps[Self <: NavbarLinkModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowless")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = {
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

