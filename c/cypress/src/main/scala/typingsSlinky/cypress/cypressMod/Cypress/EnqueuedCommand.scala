package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnqueuedCommand extends js.Object {
  var args: js.Array[_] = js.native
  var chainerId: String = js.native
  var name: String = js.native
  var `type`: String = js.native
  def fn(args: js.Any*): js.Any = js.native
}

object EnqueuedCommand {
  @scala.inline
  def apply(
    args: js.Array[_],
    chainerId: String,
    fn: /* repeated */ js.Any => js.Any,
    name: String,
    `type`: String
  ): EnqueuedCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], chainerId = chainerId.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueuedCommand]
  }
  @scala.inline
  implicit class EnqueuedCommandOps[Self <: EnqueuedCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

