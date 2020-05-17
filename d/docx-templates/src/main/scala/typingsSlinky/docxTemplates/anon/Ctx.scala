package typingsSlinky.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ctx extends js.Object {
  var ctx: js.Object = js.native
  var sandbox: js.Object = js.native
}

object Ctx {
  @scala.inline
  def apply(ctx: js.Object, sandbox: js.Object): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  @scala.inline
  implicit class CtxOps[Self <: Ctx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtx(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandbox(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

