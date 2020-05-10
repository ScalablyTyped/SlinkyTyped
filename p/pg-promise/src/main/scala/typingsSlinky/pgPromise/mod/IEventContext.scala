package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generic Event Context interface;
// See: http://vitaly-t.github.io/pg-promise/global.html#EventContext
@js.native
trait IEventContext[C /* <: IClient */] extends js.Object {
  var client: C = js.native
  var cn: js.Any = js.native
  var ctx: ITaskContext = js.native
  var dc: js.Any = js.native
  var params: js.Any = js.native
  var query: js.Any = js.native
}

object IEventContext {
  @scala.inline
  def apply[C](client: C, cn: js.Any, ctx: ITaskContext, dc: js.Any, params: js.Any, query: js.Any): IEventContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventContext[C]]
  }
  @scala.inline
  implicit class IEventContextOps[Self[c] <: IEventContext[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withClient(value: C): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCn(value: js.Any): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtx(value: ITaskContext): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDc(value: js.Any): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

