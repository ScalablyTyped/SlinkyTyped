package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCirclesDur extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): AnonRNumber
}

object AnonCirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => AnonRNumber): AnonCirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
  
    __obj.asInstanceOf[AnonCirclesDur]
  }
}

