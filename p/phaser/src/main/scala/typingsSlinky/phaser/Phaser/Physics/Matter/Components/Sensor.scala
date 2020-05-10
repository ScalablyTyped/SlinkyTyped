package typingsSlinky.phaser.Phaser.Physics.Matter.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables a Matter-enabled Game Object to be a sensor. Should be used as a mixin and not directly.
  */
@js.native
trait Sensor extends js.Object {
  /**
    * Is the body belonging to this Game Object a sensor or not?
    */
  def isSensor(): Boolean = js.native
  /**
    * Set the body belonging to this Game Object to be a sensor.
    * Sensors trigger collision events, but don't react with colliding body physically.
    * @param value `true` to set the body as a sensor, or `false` to disable it.
    */
  def setSensor(value: Boolean): GameObject = js.native
}

object Sensor {
  @scala.inline
  def apply(isSensor: () => Boolean, setSensor: Boolean => GameObject): Sensor = {
    val __obj = js.Dynamic.literal(isSensor = js.Any.fromFunction0(isSensor), setSensor = js.Any.fromFunction1(setSensor))
    __obj.asInstanceOf[Sensor]
  }
  @scala.inline
  implicit class SensorOps[Self <: Sensor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSensor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSensor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSensor(value: Boolean => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSensor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

