package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBubbles extends js.Object {
  var bubbles: AnonCircles = js.native
  var circles: AnonCircles = js.native
  var circular: AnonDur = js.native
  var crescent: AnonFn = js.native
  var dots: AnonCirclesDur = js.native
  var lines: AnonLines = js.native
  var `lines-small`: AnonLines = js.native
}

object AnonBubbles {
  @scala.inline
  def apply(
    bubbles: AnonCircles,
    circles: AnonCircles,
    circular: AnonDur,
    crescent: AnonFn,
    dots: AnonCirclesDur,
    lines: AnonLines,
    `lines-small`: AnonLines
  ): AnonBubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBubbles]
  }
  @scala.inline
  implicit class AnonBubblesOps[Self <: AnonBubbles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: AnonCircles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircles(value: AnonCircles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircular(value: AnonDur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrescent(value: AnonFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: AnonCirclesDur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: AnonLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLines-small`(value: AnonLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines-small")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

