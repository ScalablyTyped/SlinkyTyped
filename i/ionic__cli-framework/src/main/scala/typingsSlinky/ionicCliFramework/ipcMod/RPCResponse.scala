package typingsSlinky.ionicCliFramework.ipcMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.`rpc-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends js.Object {
  var data: D = js.native
  var err: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any = js.native
  var request: R = js.native
  var `type`: `rpc-response` = js.native
}

object RPCResponse {
  @scala.inline
  def apply[R, D](
    data: D,
    id: String,
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    request: R,
    `type`: `rpc-response`
  ): RPCResponse[R, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResponse[R, D]]
  }
  @scala.inline
  implicit class RPCResponseOps[Self[r, d] <: RPCResponse[r, d], R, D] (val x: Self[R, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, D]) with Other]
    @scala.inline
    def withData(value: D): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcedure(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
    ): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: R): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `rpc-response`): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErr(value: js.Any): Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self[R, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
  }
  
}

