package typingsSlinky.rbx.navbarContainerMod

import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarVariablesDefaults extends js.Object {
  var fixedAlignments: top | bottom = js.native
}

object NavbarVariablesDefaults {
  @scala.inline
  def apply(fixedAlignments: top | bottom): NavbarVariablesDefaults = {
    val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarVariablesDefaults]
  }
  @scala.inline
  implicit class NavbarVariablesDefaultsOps[Self <: NavbarVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedAlignments(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedAlignments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

