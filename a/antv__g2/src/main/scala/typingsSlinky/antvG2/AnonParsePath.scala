package typingsSlinky.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParsePath extends js.Object {
  var parsePath: js.Any = js.native
  var parsePoint: js.Any = js.native
  var parsePoints: js.Any = js.native
}

object AnonParsePath {
  @scala.inline
  def apply(parsePath: js.Any, parsePoint: js.Any, parsePoints: js.Any): AnonParsePath = {
    val __obj = js.Dynamic.literal(parsePath = parsePath.asInstanceOf[js.Any], parsePoint = parsePoint.asInstanceOf[js.Any], parsePoints = parsePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParsePath]
  }
  @scala.inline
  implicit class AnonParsePathOps[Self <: AnonParsePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParsePath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsePoint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsePoints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsePoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

