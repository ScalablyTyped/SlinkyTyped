package typingsSlinky.axeCore.mod

import typingsSlinky.axeCore.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxePlugin extends js.Object {
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.native
  var commands: js.Array[AnonCallback] = js.native
  var id: String = js.native
  def run(args: js.Any*): js.Any = js.native
}

object AxePlugin {
  @scala.inline
  def apply(commands: js.Array[AnonCallback], id: String, run: /* repeated */ js.Any => js.Any): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[AxePlugin]
  }
  @scala.inline
  implicit class AxePluginOps[Self <: AxePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: js.Array[AnonCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCleanup(value: /* callback */ js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.undefined)
        ret
    }
  }
  
}

