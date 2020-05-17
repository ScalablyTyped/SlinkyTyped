package typingsSlinky.reactRedux.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  var WrappedComponent: C = js.native
}

object WrappedComponent {
  @scala.inline
  def apply[C](WrappedComponent: C): WrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[C]]
  }
  @scala.inline
  implicit class WrappedComponentOps[Self[c] <: WrappedComponent[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withWrappedComponent(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

