package typingsSlinky.makerJs.MakerJs.paths

import typingsSlinky.makerJs.MakerJs.IPathArc
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for arc path.
  */
@js.native
trait Arc extends IPathArc

object Arc {
  @scala.inline
  def apply(endAngle: Double, origin: IPoint, radius: Double, startAngle: Double, `type`: String): Arc = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

