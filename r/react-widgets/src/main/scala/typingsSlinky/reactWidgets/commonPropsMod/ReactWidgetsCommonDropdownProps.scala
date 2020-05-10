package typingsSlinky.reactWidgets.commonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactWidgetsCommonDropdownProps extends ReactWidgetsCommonProps {
  /**
    * Show "drop up" not "drop down"
    * @default false
    */
  var dropUp: js.UndefOr[Boolean] = js.native
}

object ReactWidgetsCommonDropdownProps {
  @scala.inline
  def apply(): ReactWidgetsCommonDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactWidgetsCommonDropdownProps]
  }
  @scala.inline
  implicit class ReactWidgetsCommonDropdownPropsOps[Self <: ReactWidgetsCommonDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(js.undefined)
        ret
    }
  }
  
}

