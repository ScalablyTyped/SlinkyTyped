package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Acceleration component.
  * Should be applied as a mixin.
  */
@js.native
trait Acceleration extends js.Object {
  /**
    * Sets the horizontal and vertical acceleration of this body.
    * @param x The amount of horizontal acceleration to apply.
    * @param y The amount of vertical acceleration to apply.
    */
  def setAcceleration(x: Double, y: Double): this.type = js.native
  /**
    * Sets the horizontal acceleration of this body.
    * @param x The amount of acceleration to apply.
    */
  def setAccelerationX(x: Double): this.type = js.native
  /**
    * Sets the vertical acceleration of this body.
    * @param y The amount of acceleration to apply.
    */
  def setAccelerationY(y: Double): this.type = js.native
}

object Acceleration {
  @scala.inline
  def apply(
    setAcceleration: (Double, Double) => Acceleration,
    setAccelerationX: Double => Acceleration,
    setAccelerationY: Double => Acceleration
  ): Acceleration = {
    val __obj = js.Dynamic.literal(setAcceleration = js.Any.fromFunction2(setAcceleration), setAccelerationX = js.Any.fromFunction1(setAccelerationX), setAccelerationY = js.Any.fromFunction1(setAccelerationY))
    __obj.asInstanceOf[Acceleration]
  }
  @scala.inline
  implicit class AccelerationOps[Self <: Acceleration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAcceleration(value: (Double, Double) => Acceleration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAcceleration")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAccelerationX(value: Double => Acceleration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerationX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccelerationY(value: Double => Acceleration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccelerationY")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

