package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bubbles extends js.Object {
  var bubbles: Circles = js.native
  var circles: Circles = js.native
  var circular: Dur = js.native
  var crescent: Fn = js.native
  var dots: CirclesDur = js.native
  var lines: Lines = js.native
  var `lines-small`: Lines = js.native
}

object Bubbles {
  @scala.inline
  def apply(
    bubbles: Circles,
    circles: Circles,
    circular: Dur,
    crescent: Fn,
    dots: CirclesDur,
    lines: Lines,
    `lines-small`: Lines
  ): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bubbles]
  }
  @scala.inline
  implicit class BubblesOps[Self <: Bubbles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Circles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircles(value: Circles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircular(value: Dur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrescent(value: Fn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crescent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: CirclesDur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: Lines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLines-small`(value: Lines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines-small")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

