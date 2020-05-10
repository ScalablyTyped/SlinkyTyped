package typingsSlinky.reactstrap.inputGroupButtonDropdownMod

import typingsSlinky.reactstrap.dropdownMod.DropdownProps
import typingsSlinky.reactstrap.reactstrapStrings.append
import typingsSlinky.reactstrap.reactstrapStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputGroupButtonDropdownProps extends DropdownProps {
  @JSName("addonType")
  var addonType_InputGroupButtonDropdownProps: prepend | append = js.native
}

object InputGroupButtonDropdownProps {
  @scala.inline
  def apply(addonType: prepend | append): InputGroupButtonDropdownProps = {
    val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupButtonDropdownProps]
  }
  @scala.inline
  implicit class InputGroupButtonDropdownPropsOps[Self <: InputGroupButtonDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddonType(value: prepend | append): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

