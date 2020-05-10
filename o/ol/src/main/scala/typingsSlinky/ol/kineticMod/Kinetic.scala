package typingsSlinky.ol.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kinetic extends js.Object {
  def begin(): Unit = js.native
  def end(): Boolean = js.native
  def getAngle(): Double = js.native
  def getDistance(): Double = js.native
  def update(x: Double, y: Double): Unit = js.native
}

object Kinetic {
  @scala.inline
  def apply(
    begin: () => Unit,
    end: () => Boolean,
    getAngle: () => Double,
    getDistance: () => Double,
    update: (Double, Double) => Unit
  ): Kinetic = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Kinetic]
  }
  @scala.inline
  implicit class KineticOps[Self <: Kinetic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAngle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAngle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

