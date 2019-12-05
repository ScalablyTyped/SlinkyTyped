package typingsSlinky.fontkit.fontkitMod

import typingsSlinky.fontkit.fontkitStrings.bezierCurveTo
import typingsSlinky.fontkit.fontkitStrings.closePath
import typingsSlinky.fontkit.fontkitStrings.lineTo
import typingsSlinky.fontkit.fontkitStrings.moveTo
import typingsSlinky.fontkit.fontkitStrings.quadraticCurveTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommand extends js.Object {
  var args: js.Array[Double]
  var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath
}

object PathCommand {
  @scala.inline
  def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathCommand]
  }
}

