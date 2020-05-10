package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.CollideCallback
import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Collides component.
  * Should be applied as a mixin.
  */
@js.native
trait Collides extends js.Object {
  /**
    * [description]
    */
  var collides: Double = js.native
  /**
    * [description]
    */
  def setActiveCollision(): GameObject = js.native
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  def setCollideCallback(callback: CollideCallback, scope: js.Any): GameObject = js.native
  /**
    * [description]
    */
  def setCollidesNever(): GameObject = js.native
  /**
    * [description]
    */
  def setFixedCollision(): GameObject = js.native
  /**
    * [description]
    */
  def setLiteCollision(): GameObject = js.native
  /**
    * [description]
    */
  def setPassiveCollision(): GameObject = js.native
}

object Collides {
  @scala.inline
  def apply(
    collides: Double,
    setActiveCollision: () => GameObject,
    setCollideCallback: (CollideCallback, js.Any) => GameObject,
    setCollidesNever: () => GameObject,
    setFixedCollision: () => GameObject,
    setLiteCollision: () => GameObject,
    setPassiveCollision: () => GameObject
  ): Collides = {
    val __obj = js.Dynamic.literal(collides = collides.asInstanceOf[js.Any], setActiveCollision = js.Any.fromFunction0(setActiveCollision), setCollideCallback = js.Any.fromFunction2(setCollideCallback), setCollidesNever = js.Any.fromFunction0(setCollidesNever), setFixedCollision = js.Any.fromFunction0(setFixedCollision), setLiteCollision = js.Any.fromFunction0(setLiteCollision), setPassiveCollision = js.Any.fromFunction0(setPassiveCollision))
    __obj.asInstanceOf[Collides]
  }
  @scala.inline
  implicit class CollidesOps[Self <: Collides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActiveCollision(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveCollision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCollideCallback(value: (CollideCallback, js.Any) => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCollideCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCollidesNever(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCollidesNever")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFixedCollision(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFixedCollision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLiteCollision(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLiteCollision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPassiveCollision(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPassiveCollision")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

