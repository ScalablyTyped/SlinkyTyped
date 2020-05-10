package typingsSlinky.phaser.Phaser.Physics.Matter.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows accessing the mass, density, and center of mass of a Matter-enabled Game Object. Should be used as a mixin and not directly.
  */
@js.native
trait Mass extends js.Object {
  /**
    * The body's center of mass.
    * 
    * Calling this creates a new `Vector2 each time to avoid mutation.
    * 
    * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
    */
  val centerOfMass: Vector2 = js.native
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  def setDensity(value: Double): GameObject = js.native
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  def setMass(value: Double): GameObject = js.native
}

object Mass {
  @scala.inline
  def apply(centerOfMass: Vector2, setDensity: Double => GameObject, setMass: Double => GameObject): Mass = {
    val __obj = js.Dynamic.literal(centerOfMass = centerOfMass.asInstanceOf[js.Any], setDensity = js.Any.fromFunction1(setDensity), setMass = js.Any.fromFunction1(setMass))
    __obj.asInstanceOf[Mass]
  }
  @scala.inline
  implicit class MassOps[Self <: Mass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterOfMass(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerOfMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDensity(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDensity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMass(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMass")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

