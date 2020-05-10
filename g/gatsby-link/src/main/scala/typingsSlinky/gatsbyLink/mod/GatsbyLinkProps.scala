package typingsSlinky.gatsbyLink.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reachRouter.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyLinkProps[TState] extends LinkProps[TState] {
  /** A class to apply when this Link is active */
  var activeClassName: js.UndefOr[String] = js.native
  /** Inline styles for when this Link is active */
  var activeStyle: js.UndefOr[js.Object] = js.native
  @JSName("innerRef")
  var innerRef_GatsbyLinkProps: js.UndefOr[js.Function] = js.native
  @JSName("onClick")
  var onClick_GatsbyLinkProps: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLAnchorElement], Unit]] = js.native
  /** Class the link as highlighted if there is a partial match via a the `to` being prefixed to the current url */
  var partiallyActive: js.UndefOr[Boolean] = js.native
}

object GatsbyLinkProps {
  @scala.inline
  def apply[TState](to: String): GatsbyLinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyLinkProps[TState]]
  }
  @scala.inline
  implicit class GatsbyLinkPropsOps[Self[tstate] <: GatsbyLinkProps[tstate], TState] (val x: Self[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TState] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TState] with Other]
    @scala.inline
    def withActiveClassName(value: String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClassName: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStyle(value: js.Object): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStyle: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRef(value: js.Function): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ SyntheticMouseEvent[HTMLAnchorElement] => Unit): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPartiallyActive(value: Boolean): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartiallyActive: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyActive")(js.undefined)
        ret
    }
  }
  
}

