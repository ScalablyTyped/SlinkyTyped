package typingsSlinky.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStateAnonSortColumn[T /* <: js.Object */] extends js.Object {
  var state: AnonSortColumn[T] = js.native
}

object AnonStateAnonSortColumn {
  @scala.inline
  def apply[T](state: AnonSortColumn[T]): AnonStateAnonSortColumn[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStateAnonSortColumn[T]]
  }
  @scala.inline
  implicit class AnonStateAnonSortColumnOps[Self[t] <: AnonStateAnonSortColumn[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withState(value: AnonSortColumn[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

