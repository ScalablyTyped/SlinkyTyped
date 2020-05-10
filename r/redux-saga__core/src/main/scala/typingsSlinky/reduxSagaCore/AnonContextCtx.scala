package typingsSlinky.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextCtx[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, Unit] */] extends js.Object {
  var context: Ctx = js.native
  var fn: Fn = js.native
}

object AnonContextCtx {
  @scala.inline
  def apply[Ctx, Fn](context: Ctx, fn: Fn): AnonContextCtx[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextCtx[Ctx, Fn]]
  }
  @scala.inline
  implicit class AnonContextCtxOps[Self[ctx, fn] <: AnonContextCtx[ctx, fn], Ctx, Fn] (val x: Self[Ctx, Fn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ctx, Fn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ctx, Fn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Ctx, Fn]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Ctx, Fn]) with Other]
    @scala.inline
    def withContext(value: Ctx): Self[Ctx, Fn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: Fn): Self[Ctx, Fn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

