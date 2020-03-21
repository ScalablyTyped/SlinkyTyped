package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFn extends js.Object {
  var circles: Double
  var dur: Double
  def fn(): AnonRStyle
}

object AnonFn {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: () => AnonRStyle): AnonFn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
  
    __obj.asInstanceOf[AnonFn]
  }
}

