package typingsSlinky.reduxSagaCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextFn[Ctx, Fn /* <: js.ThisFunction1[/* this */ Ctx, /* repeated */ js.Any, _] */] extends js.Object {
  var context: Ctx = js.native
  var fn: Fn = js.native
}

object ContextFn {
  @scala.inline
  def apply[Ctx, Fn](context: Ctx, fn: Fn): ContextFn[Ctx, Fn] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextFn[Ctx, Fn]]
  }
  @scala.inline
  implicit class ContextFnOps[Self[ctx, fn] <: ContextFn[ctx, fn], Ctx, Fn] (val x: Self[Ctx, Fn]) extends AnyVal {
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

