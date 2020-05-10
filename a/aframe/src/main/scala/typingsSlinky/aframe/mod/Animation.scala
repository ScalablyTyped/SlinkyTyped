package typingsSlinky.aframe.mod

import typingsSlinky.aframe.aframeStrings.alternate
import typingsSlinky.aframe.aframeStrings.alternateReverse
import typingsSlinky.aframe.aframeStrings.backwards
import typingsSlinky.aframe.aframeStrings.both
import typingsSlinky.aframe.aframeStrings.forwards
import typingsSlinky.aframe.aframeStrings.indefinite
import typingsSlinky.aframe.aframeStrings.none
import typingsSlinky.aframe.aframeStrings.normal
import typingsSlinky.aframe.aframeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var attribute: String = js.native
  var begin: String | Double = js.native
  var delay: Double = js.native
  var direction: alternate | alternateReverse | normal | reverse = js.native
  var dur: Double = js.native
  var end: String = js.native
  var fill: backwards | both | forwards | none = js.native
  var from: js.Any = js.native
   // TODO type
  var repeat: Double | indefinite = js.native
  var to: Double = js.native
  def easing(): Unit = js.native
}

object Animation {
  @scala.inline
  def apply(
    attribute: String,
    begin: String | Double,
    delay: Double,
    direction: alternate | alternateReverse | normal | reverse,
    dur: Double,
    easing: () => Unit,
    end: String,
    fill: backwards | both | forwards | none,
    from: js.Any,
    repeat: Double | indefinite,
    to: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], easing = js.Any.fromFunction0(easing), end = end.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: alternate | alternateReverse | normal | reverse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: backwards | both | forwards | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeat(value: Double | indefinite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

