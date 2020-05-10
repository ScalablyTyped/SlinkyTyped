package typingsSlinky.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMixin extends js.Object {
  def componentDidMount(): Unit = js.native
  def componentWillUnmount(): Unit = js.native
  def getInitialState(): js.Any = js.native
}

object ReactMixin {
  @scala.inline
  def apply(componentDidMount: () => Unit, componentWillUnmount: () => Unit, getInitialState: () => js.Any): ReactMixin = {
    val __obj = js.Dynamic.literal(componentDidMount = js.Any.fromFunction0(componentDidMount), componentWillUnmount = js.Any.fromFunction0(componentWillUnmount), getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[ReactMixin]
  }
  @scala.inline
  implicit class ReactMixinOps[Self <: ReactMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDidMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComponentWillUnmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUnmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInitialState(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

