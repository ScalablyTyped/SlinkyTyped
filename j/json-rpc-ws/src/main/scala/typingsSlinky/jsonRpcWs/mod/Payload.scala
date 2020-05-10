package typingsSlinky.jsonRpcWs.mod

import typingsSlinky.jsonRpcWs.jsonRpcWsStrings.`2Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload[ParamType] extends js.Object {
  var error: js.UndefOr[js.Any] = js.native
  var id: String = js.native
  var jsonrpc: js.UndefOr[`2Dot0`] = js.native
  var method: String = js.native
  var params: js.UndefOr[ParamType] = js.native
  var result: js.UndefOr[js.Any] = js.native
}

object Payload {
  @scala.inline
  def apply[ParamType](id: String, method: String): Payload[ParamType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[ParamType]]
  }
  @scala.inline
  implicit class PayloadOps[Self[paramtype] <: Payload[paramtype], ParamType] (val x: Self[ParamType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ParamType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ParamType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ParamType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ParamType] with Other]
    @scala.inline
    def withId(value: String): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonrpc(value: `2Dot0`): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonrpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonrpc: Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonrpc")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: ParamType): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self[ParamType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

