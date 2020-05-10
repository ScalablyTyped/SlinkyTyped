package typingsSlinky.fontkit.mod

import typingsSlinky.fontkit.fontkitStrings.bezierCurveTo
import typingsSlinky.fontkit.fontkitStrings.closePath
import typingsSlinky.fontkit.fontkitStrings.lineTo
import typingsSlinky.fontkit.fontkitStrings.moveTo
import typingsSlinky.fontkit.fontkitStrings.quadraticCurveTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathCommand extends js.Object {
  var args: js.Array[Double] = js.native
  var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath = js.native
}

object PathCommand {
  @scala.inline
  def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  @scala.inline
  implicit class PathCommandOps[Self <: PathCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

