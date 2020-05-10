package typingsSlinky.antd.menuContextMod

import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuContextProps extends js.Object {
  var antdMenuTheme: js.UndefOr[MenuTheme] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var inlineCollapsed: Boolean = js.native
}

object MenuContextProps {
  @scala.inline
  def apply(inlineCollapsed: Boolean): MenuContextProps = {
    val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuContextProps]
  }
  @scala.inline
  implicit class MenuContextPropsOps[Self <: MenuContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAntdMenuTheme(value: MenuTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antdMenuTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntdMenuTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antdMenuTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

