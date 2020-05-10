package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Bounce component.
  * Should be applied as a mixin.
  */
@js.native
trait Bounce extends js.Object {
  /**
    * The bounce, or restitution, value of this body.
    * A value between 0 (no rebound) and 1 (full rebound)
    */
  var bounce: Double = js.native
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  def setBounce(value: Double): GameObject = js.native
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  def setMinBounceVelocity(value: Double): GameObject = js.native
}

object Bounce {
  @scala.inline
  def apply(bounce: Double, setBounce: Double => GameObject, setMinBounceVelocity: Double => GameObject): Bounce = {
    val __obj = js.Dynamic.literal(bounce = bounce.asInstanceOf[js.Any], setBounce = js.Any.fromFunction1(setBounce), setMinBounceVelocity = js.Any.fromFunction1(setMinBounceVelocity))
    __obj.asInstanceOf[Bounce]
  }
  @scala.inline
  implicit class BounceOps[Self <: Bounce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBounce(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinBounceVelocity(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinBounceVelocity")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

