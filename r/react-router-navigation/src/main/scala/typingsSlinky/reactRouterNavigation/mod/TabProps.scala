package typingsSlinky.reactRouterNavigation.mod

import typingsSlinky.reactRouterNavigationCore.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabProps
  extends RouteProps
     with TabBarProps {
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var onReset: js.UndefOr[js.Function1[/* props */ TabBarProps with RouteProps, Unit]] = js.native
}

object TabProps {
  @scala.inline
  def apply(): TabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabProps]
  }
  @scala.inline
  implicit class TabPropsOps[Self <: TabProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnIndexChange(value: /* index */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIndexChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: /* props */ TabBarProps with RouteProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
  }
  
}

