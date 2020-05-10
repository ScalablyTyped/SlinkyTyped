package typingsSlinky.baseui.headerNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderNavigationProps extends js.Object {
  var overrides: js.UndefOr[HeaderNavigationOverrides] = js.native
}

object HeaderNavigationProps {
  @scala.inline
  def apply(): HeaderNavigationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderNavigationProps]
  }
  @scala.inline
  implicit class HeaderNavigationPropsOps[Self <: HeaderNavigationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrides(value: HeaderNavigationOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

