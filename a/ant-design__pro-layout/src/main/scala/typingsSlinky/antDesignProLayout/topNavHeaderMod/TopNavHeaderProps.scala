package typingsSlinky.antDesignProLayout.topNavHeaderMod

import slinky.core.TagMod
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopNavHeaderProps extends SiderMenuProps {
  var onCollapse: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.native
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, TagMod[Any]]]] = js.native
}

object TopNavHeaderProps {
  @scala.inline
  def apply(): TopNavHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopNavHeaderProps]
  }
  @scala.inline
  implicit class TopNavHeaderPropsOps[Self <: TopNavHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCollapse(value: /* collapse */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentRenderFunction1(value: TopNavHeaderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightContentRender(value: WithFalse[js.Function1[TopNavHeaderProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContentRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.undefined)
        ret
    }
  }
  
}

