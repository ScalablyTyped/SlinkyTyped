package typingsSlinky.reactTransitionGroup.switchTransitionMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchTransitionProps extends js.Object {
  /**
    * Any `Transition` or `CSSTransition` component
    */
  var children: ReactElement = js.native
  /**
    * Transition modes.
    * `out-in`: Current element transitions out first, then when complete, the new element transitions in.
    * `in-out`: New element transitions in first, then when complete, the current element transitions out.
    */
  var mode: js.UndefOr[`out-in` | `in-out`] = js.native
}

object SwitchTransitionProps {
  @scala.inline
  def apply(children: ReactElement): SwitchTransitionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTransitionProps]
  }
  @scala.inline
  implicit class SwitchTransitionPropsOps[Self <: SwitchTransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: `out-in` | `in-out`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

