package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofxhttpRpc extends js.Object {
  def dispatch(): Double = js.native
}

object TypeofxhttpRpc {
  @scala.inline
  def apply(dispatch: () => Double): TypeofxhttpRpc = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction0(dispatch))
    __obj.asInstanceOf[TypeofxhttpRpc]
  }
  @scala.inline
  implicit class TypeofxhttpRpcOps[Self <: TypeofxhttpRpc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

