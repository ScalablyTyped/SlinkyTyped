package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Friction component.
  * Should be applied as a mixin.
  */
@js.native
trait Friction extends js.Object {
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def setFriction(x: Double, y: Double): GameObject = js.native
  /**
    * [description]
    * @param x [description]
    */
  def setFrictionX(x: Double): GameObject = js.native
  /**
    * [description]
    * @param y [description]
    */
  def setFrictionY(y: Double): GameObject = js.native
}

object Friction {
  @scala.inline
  def apply(
    setFriction: (Double, Double) => GameObject,
    setFrictionX: Double => GameObject,
    setFrictionY: Double => GameObject
  ): Friction = {
    val __obj = js.Dynamic.literal(setFriction = js.Any.fromFunction2(setFriction), setFrictionX = js.Any.fromFunction1(setFrictionX), setFrictionY = js.Any.fromFunction1(setFrictionY))
    __obj.asInstanceOf[Friction]
  }
  @scala.inline
  implicit class FrictionOps[Self <: Friction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetFriction(value: (Double, Double) => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFriction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFrictionX(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrictionX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFrictionY(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrictionY")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

