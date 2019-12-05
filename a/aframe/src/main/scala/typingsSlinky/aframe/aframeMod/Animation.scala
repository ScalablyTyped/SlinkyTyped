package typingsSlinky.aframe.aframeMod

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

trait Animation extends js.Object {
  var attribute: String
  var begin: String | Double
  var delay: Double
  var direction: alternate | alternateReverse | normal | reverse
  var dur: Double
  var end: String
  var fill: backwards | both | forwards | none
  var from: js.Any
   // TODO type
  var repeat: Double | indefinite
  var to: Double
  def easing(): Unit
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
}

