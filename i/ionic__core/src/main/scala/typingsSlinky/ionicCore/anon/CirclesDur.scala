package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclesDur extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): RNumber
}

object CirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => RNumber): CirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[CirclesDur]
  }
}

