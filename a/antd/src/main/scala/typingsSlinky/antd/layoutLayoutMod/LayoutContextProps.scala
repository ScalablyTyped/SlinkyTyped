package typingsSlinky.antd.layoutLayoutMod

import typingsSlinky.antd.AnonAddSider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutContextProps extends js.Object {
  var siderHook: AnonAddSider = js.native
}

object LayoutContextProps {
  @scala.inline
  def apply(siderHook: AnonAddSider): LayoutContextProps = {
    val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutContextProps]
  }
  @scala.inline
  implicit class LayoutContextPropsOps[Self <: LayoutContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiderHook(value: AnonAddSider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siderHook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

