package typingsSlinky.reactBootstrap.navbarMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarTextProps
  extends AllHTMLAttributes[NavbarText]
     with ClassAttributes[NavbarText] {
  var pullRight: js.UndefOr[Boolean] = js.native
}

object NavbarTextProps {
  @scala.inline
  def apply(): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarTextProps]
  }
  @scala.inline
  implicit class NavbarTextPropsOps[Self <: NavbarTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(js.undefined)
        ret
    }
  }
  
}

