package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.native
  var command: String = js.native
  var seq: Double = js.native
  var `type`: request = js.native
}

object Arguments {
  @scala.inline
  def apply(command: String, seq: Double, `type`: request): Arguments = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArguments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
  }
  
}

