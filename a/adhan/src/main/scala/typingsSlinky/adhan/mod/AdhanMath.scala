package typingsSlinky.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdhanMath extends js.Object {
  def degreesToRadians(degrees: Double): Double = js.native
  def normalizeToScale(number: Double, max: Double): Double = js.native
  def quadrantShiftAngle(angle: Double): Double = js.native
  def radiansToDegrees(radians: Double): Double = js.native
  def timeComponents(number: Double): Double = js.native
  def unwindAngle(angle: Double): Double = js.native
}

object AdhanMath {
  @scala.inline
  def apply(
    degreesToRadians: Double => Double,
    normalizeToScale: (Double, Double) => Double,
    quadrantShiftAngle: Double => Double,
    radiansToDegrees: Double => Double,
    timeComponents: Double => Double,
    unwindAngle: Double => Double
  ): AdhanMath = {
    val __obj = js.Dynamic.literal(degreesToRadians = js.Any.fromFunction1(degreesToRadians), normalizeToScale = js.Any.fromFunction2(normalizeToScale), quadrantShiftAngle = js.Any.fromFunction1(quadrantShiftAngle), radiansToDegrees = js.Any.fromFunction1(radiansToDegrees), timeComponents = js.Any.fromFunction1(timeComponents), unwindAngle = js.Any.fromFunction1(unwindAngle))
    __obj.asInstanceOf[AdhanMath]
  }
  @scala.inline
  implicit class AdhanMathOps[Self <: AdhanMath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegreesToRadians(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreesToRadians")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalizeToScale(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeToScale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQuadrantShiftAngle(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadrantShiftAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadiansToDegrees(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiansToDegrees")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeComponents(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeComponents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnwindAngle(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwindAngle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

