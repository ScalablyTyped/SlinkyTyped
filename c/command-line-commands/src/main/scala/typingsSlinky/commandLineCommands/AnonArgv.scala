package typingsSlinky.commandLineCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgv extends js.Object {
  var argv: js.Array[String] = js.native
  var command: String | Null = js.native
}

object AnonArgv {
  @scala.inline
  def apply(argv: js.Array[String]): AnonArgv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgv]
  }
  @scala.inline
  implicit class AnonArgvOps[Self <: AnonArgv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(null)
        ret
    }
  }
  
}

