package typingsSlinky.ionicCliFramework.ipcMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.`rpc-request`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCRequest[P /* <: String */, A /* <: js.Array[_] */] extends js.Object {
  var args: A = js.native
  var id: String = js.native
  var procedure: P = js.native
  var `type`: `rpc-request` = js.native
}

object RPCRequest {
  @scala.inline
  def apply[P, A](args: A, id: String, procedure: P, `type`: `rpc-request`): RPCRequest[P, A] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCRequest[P, A]]
  }
  @scala.inline
  implicit class RPCRequestOps[Self[p, a] <: RPCRequest[p, a], P, A] (val x: Self[P, A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, A]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, A]) with Other]
    @scala.inline
    def withArgs(value: A): Self[P, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[P, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcedure(value: P): Self[P, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `rpc-request`): Self[P, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

