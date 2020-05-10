package typingsSlinky.rbx.navbarDropdownMod

import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarDropdownModifierProps extends js.Object {
  var align: js.UndefOr[right] = js.native
  var boxed: js.UndefOr[Boolean] = js.native
}

object NavbarDropdownModifierProps {
  @scala.inline
  def apply(): NavbarDropdownModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarDropdownModifierProps]
  }
  @scala.inline
  implicit class NavbarDropdownModifierPropsOps[Self <: NavbarDropdownModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxed")(js.undefined)
        ret
    }
  }
  
}

