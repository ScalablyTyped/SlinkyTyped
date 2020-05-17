package typingsSlinky.linq4js.Linq4JS

import typingsSlinky.linq4js.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateCommand extends js.Object {
  var Command: String = js.native
  var Finder: Array[js.RegExp] = js.native
  var SplitRegex: Array[js.RegExp] = js.native
}

object EvaluateCommand {
  @scala.inline
  def apply(Command: String, Finder: Array[js.RegExp], SplitRegex: Array[js.RegExp]): EvaluateCommand = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Finder = Finder.asInstanceOf[js.Any], SplitRegex = SplitRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCommand]
  }
  @scala.inline
  implicit class EvaluateCommandOps[Self <: EvaluateCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinder(value: Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Finder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitRegex(value: Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitRegex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

