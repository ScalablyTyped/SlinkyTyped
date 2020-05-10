package typingsSlinky.reactBootstrap.tabContainerMod

import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContainerProps extends HTMLAttributes[TabContainer] {
  var activeKey: js.UndefOr[js.Any] = js.native
  var defaultActiveKey: js.UndefOr[js.Any] = js.native
  var generateChildId: js.UndefOr[js.Function2[/* eventKey */ js.Any, /* type */ js.Any, String]] = js.native
}

object TabContainerProps {
  @scala.inline
  def apply(): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContainerProps]
  }
  @scala.inline
  implicit class TabContainerPropsOps[Self <: TabContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActiveKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateChildId(value: (/* eventKey */ js.Any, /* type */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateChildId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateChildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateChildId")(js.undefined)
        ret
    }
  }
  
}

