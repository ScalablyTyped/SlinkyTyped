package typingsSlinky.koaBouncer.anon

import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ctx extends js.Object {
  var ctx: Context = js.native
  var key: String = js.native
  var vals: js.Any = js.native
}

object Ctx {
  @scala.inline
  def apply(ctx: Context, key: String, vals: js.Any): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  @scala.inline
  implicit class CtxOps[Self <: Ctx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtx(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

