package typingsSlinky.reactBootstrap.controlLabelMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlLabelProps
  extends AllHTMLAttributes[ControlLabel]
     with ClassAttributes[ControlLabel] {
  var bsClass: js.UndefOr[String] = js.native
  var srOnly: js.UndefOr[Boolean] = js.native
}

object ControlLabelProps {
  @scala.inline
  def apply(): ControlLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlLabelProps]
  }
  @scala.inline
  implicit class ControlLabelPropsOps[Self <: ControlLabelProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSrOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srOnly")(js.undefined)
        ret
    }
  }
  
}

