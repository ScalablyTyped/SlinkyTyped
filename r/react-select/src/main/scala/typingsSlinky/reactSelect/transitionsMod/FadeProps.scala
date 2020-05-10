package typingsSlinky.reactSelect.transitionsMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/animated/transitions.BaseTransition & {  component  :react.react.ComponentType<any>,   duration  :number} */
@js.native
trait FadeProps extends js.Object {
  var component: ReactComponentClass[_] = js.native
  var duration: Double = js.native
  /** Whether we are in a transition. */
  var in: Boolean = js.native
  /** Function to be called once transition finishes. */
  var onExited: fn = js.native
}

object FadeProps {
  @scala.inline
  def apply(component: ReactComponentClass[_], duration: Double, in: Boolean, onExited: () => Unit): FadeProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[FadeProps]
  }
  @scala.inline
  implicit class FadePropsOps[Self <: FadeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExited(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

