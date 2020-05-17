package typingsSlinky.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cli extends js.Object {
  var cli: String = js.native
  var local: String = js.native
}

object Cli {
  @scala.inline
  def apply(cli: String, local: String): Cli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
  @scala.inline
  implicit class CliOps[Self <: Cli] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCli(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

