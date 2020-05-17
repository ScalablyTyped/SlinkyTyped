package typingsSlinky.phaser.Phaser.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The GravityWell action applies a force on the particle to draw it towards, or repel it from, a single point.
  * 
  * The force applied is inversely proportional to the square of the distance from the particle to the point, in accordance with Newton's law of gravity.
  * 
  * This simulates the effect of gravity over large distances (as between planets, for example).
  */
@js.native
trait GravityWell extends js.Object {
  /**
    * The active state of the Gravity Well. An inactive Gravity Well will not influence any particles.
    */
  var active: Boolean = js.native
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: Double = js.native
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: Double = js.native
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: Double = js.native
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: Double = js.native
  /**
    * Takes a Particle and updates it based on the properties of this Gravity Well.
    * @param particle The Particle to update.
    * @param delta The delta time in ms.
    * @param step The delta value divided by 1000.
    */
  def update(particle: Particle, delta: Double, step: Double): Unit = js.native
}

object GravityWell {
  @scala.inline
  def apply(
    active: Boolean,
    epsilon: Double,
    power: Double,
    update: (Particle, Double, Double) => Unit,
    x: Double,
    y: Double
  ): GravityWell = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], epsilon = epsilon.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityWell]
  }
  @scala.inline
  implicit class GravityWellOps[Self <: GravityWell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpsilon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Particle, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

