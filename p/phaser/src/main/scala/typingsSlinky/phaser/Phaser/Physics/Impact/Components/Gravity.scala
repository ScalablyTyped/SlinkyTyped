package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Gravity component.
  * Should be applied as a mixin.
  */
@js.native
trait Gravity extends js.Object {
  /**
    * [description]
    */
  var gravity: Double = js.native
  /**
    * [description]
    * @param value [description]
    */
  def setGravity(value: Double): GameObject = js.native
}

object Gravity {
  @scala.inline
  def apply(gravity: Double, setGravity: Double => GameObject): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any], setGravity = js.Any.fromFunction1(setGravity))
    __obj.asInstanceOf[Gravity]
  }
  @scala.inline
  implicit class GravityOps[Self <: Gravity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetGravity(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGravity")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

