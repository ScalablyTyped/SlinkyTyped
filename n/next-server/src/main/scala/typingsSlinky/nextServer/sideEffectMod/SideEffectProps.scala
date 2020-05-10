package typingsSlinky.nextServer.sideEffectMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideEffectProps extends js.Object {
  var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  var inAmpMode: js.UndefOr[Boolean] = js.native
  def reduceComponentsToState[T](components: js.Array[ReactElement], props: T): State = js.native
}

object SideEffectProps {
  @scala.inline
  def apply(reduceComponentsToState: (js.Array[ReactElement], js.Any) => State): SideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[SideEffectProps]
  }
  @scala.inline
  implicit class SideEffectPropsOps[Self <: SideEffectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReduceComponentsToState(value: (js.Array[ReactElement], js.Any) => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceComponentsToState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleStateChange(value: /* state */ State => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withInAmpMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAmpMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(js.undefined)
        ret
    }
  }
  
}

