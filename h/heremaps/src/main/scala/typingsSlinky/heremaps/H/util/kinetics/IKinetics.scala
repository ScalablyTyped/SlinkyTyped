package typingsSlinky.heremaps.H.util.kinetics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface defines kinetic move parameters used by map for kinetic drag.
  * @property power {number} - Power multiplier. Multiplier is used to increase the speed of the kinetic move. By default map uses 1.
  * @property duration {number} - Defines duration of the kinetic move.
  */
@js.native
trait IKinetics extends js.Object {
  var duration: Double = js.native
  var power: Double = js.native
  /**
    * Easing function modifies animation progress. In example it can modify the animation in a way it starts rapidly and then slows down at the end.
    * @param p {number} - current progress
    * @returns {number} - modified progress
    */
  def ease(p: Double): Double = js.native
}

object IKinetics {
  @scala.inline
  def apply(duration: Double, ease: Double => Double, power: Double): IKinetics = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKinetics]
  }
  @scala.inline
  implicit class IKineticsOps[Self <: IKinetics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEase(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

