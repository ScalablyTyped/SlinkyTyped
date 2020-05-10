package typingsSlinky.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiderState extends js.Object {
  var below: Boolean = js.native
  var belowShow: js.UndefOr[Boolean] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
}

object SiderState {
  @scala.inline
  def apply(below: Boolean): SiderState = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderState]
  }
  @scala.inline
  implicit class SiderStateOps[Self <: SiderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBelow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("below")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBelowShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelowShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belowShow")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
  }
  
}

