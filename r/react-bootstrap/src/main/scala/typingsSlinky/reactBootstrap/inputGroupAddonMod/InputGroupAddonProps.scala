package typingsSlinky.reactBootstrap.inputGroupAddonMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputGroupAddonProps
  extends AllHTMLAttributes[InputGroupAddon]
     with ClassAttributes[InputGroupAddon] {
  var bsClass: js.UndefOr[String] = js.native
}

object InputGroupAddonProps {
  @scala.inline
  def apply(): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputGroupAddonProps]
  }
  @scala.inline
  implicit class InputGroupAddonPropsOps[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
  }
  
}

