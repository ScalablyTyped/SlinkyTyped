package typingsSlinky.reachRouter.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps[TState] extends AnchorProps {
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.native
  /** @deprecated If using React >= 16.4, use ref instead. */
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[TState] = js.native
  var to: String = js.native
}

object LinkProps {
  @scala.inline
  def apply[TState](to: String): LinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps[TState]]
  }
  @scala.inline
  implicit class LinkPropsOps[Self[tstate] <: LinkProps[tstate], TState] (val x: Self[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TState] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TState] with Other]
    @scala.inline
    def withTo(value: String): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProps(value: /* props */ LinkGetProps => js.Object): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetProps: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[HTMLAnchorElement]): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[HTMLAnchorElement]): Self[TState] = {
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
    def withInnerRefNull: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: TState): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

