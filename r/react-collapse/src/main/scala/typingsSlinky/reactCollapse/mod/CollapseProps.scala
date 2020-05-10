package typingsSlinky.reactCollapse.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactCollapse.AnonCollapse
import typingsSlinky.reactCollapse.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseProps
  extends AllHTMLAttributes[Collapse]
     with ClassAttributes[Collapse] {
  /** How often (in ms) the height of the content is checked. */
  var checkTimeout: js.UndefOr[Double] = js.native
  /** One or multiple children with static, variable or dynamic height. */
  @JSName("children")
  var children_CollapseProps: TagMod[Any] = js.native
  /** A way to control the initial element style. Will not be valid after the initial render */
  var initialStyle: js.UndefOr[AnonHeight] = js.native
  /** Expands or collapses content. */
  var isOpened: Boolean = js.native
  /** Callback function triggered when animation has completed */
  var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
  /** Callback function triggered when animation begins */
  var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
  /** It is possible to set className for extra div elements that ReactCollapse creates. */
  var theme: js.UndefOr[AnonCollapse] = js.native
}

object CollapseProps {
  @scala.inline
  def apply(isOpened: Boolean): CollapseProps = {
    val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialStyle(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRest(value: /* args */ CollapseCallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWork(value: /* args */ CollapseCallbackArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWork")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWork")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: AnonCollapse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

