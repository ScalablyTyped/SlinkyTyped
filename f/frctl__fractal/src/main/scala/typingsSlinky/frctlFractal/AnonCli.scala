package typingsSlinky.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCli extends js.Object {
  var cli: String = js.native
  var local: String = js.native
}

object AnonCli {
  @scala.inline
  def apply(cli: String, local: String): AnonCli = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCli]
  }
  @scala.inline
  implicit class AnonCliOps[Self <: AnonCli] (val x: Self) extends AnyVal {
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

