package typingsSlinky.expressValidator.contextItemMod

import typingsSlinky.expressValidator.baseMod.Meta
import typingsSlinky.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextItem extends js.Object {
  def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}

object ContextItem {
  @scala.inline
  def apply(run: (Context, js.Any, Meta) => js.Promise[Unit]): ContextItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[ContextItem]
  }
  @scala.inline
  implicit class ContextItemOps[Self <: ContextItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: (Context, js.Any, Meta) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

