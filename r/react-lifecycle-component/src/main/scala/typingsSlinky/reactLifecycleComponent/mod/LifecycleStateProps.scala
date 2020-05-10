package typingsSlinky.reactLifecycleComponent.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleStateProps[P, S] extends js.Object {
  var component: ReactComponentClass[P] = js.native
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: ReactComponentClass[P]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
  @scala.inline
  implicit class LifecycleStatePropsOps[Self[p, s] <: LifecycleStateProps[p, s], P, S] (val x: Self[P, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S]) with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[P]): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

