package typingsSlinky.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiderContextProps extends js.Object {
  var collapsedWidth: js.UndefOr[String | Double] = js.native
  var siderCollapsed: js.UndefOr[Boolean] = js.native
}

object SiderContextProps {
  @scala.inline
  def apply(): SiderContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderContextProps]
  }
  @scala.inline
  implicit class SiderContextPropsOps[Self <: SiderContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsedWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSiderCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siderCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiderCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siderCollapsed")(js.undefined)
        ret
    }
  }
  
}

