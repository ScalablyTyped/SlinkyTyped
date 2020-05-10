package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Body Type component.
  * Should be applied as a mixin.
  */
@js.native
trait BodyType extends js.Object {
  /**
    * [description]
    */
  def getBodyType(): Double = js.native
  /**
    * [description]
    */
  def setTypeA(): GameObject = js.native
  /**
    * [description]
    */
  def setTypeB(): GameObject = js.native
  /**
    * [description]
    */
  def setTypeNone(): GameObject = js.native
}

object BodyType {
  @scala.inline
  def apply(
    getBodyType: () => Double,
    setTypeA: () => GameObject,
    setTypeB: () => GameObject,
    setTypeNone: () => GameObject
  ): BodyType = {
    val __obj = js.Dynamic.literal(getBodyType = js.Any.fromFunction0(getBodyType), setTypeA = js.Any.fromFunction0(setTypeA), setTypeB = js.Any.fromFunction0(setTypeB), setTypeNone = js.Any.fromFunction0(setTypeNone))
    __obj.asInstanceOf[BodyType]
  }
  @scala.inline
  implicit class BodyTypeOps[Self <: BodyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBodyType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodyType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTypeA(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTypeA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTypeB(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTypeB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTypeNone(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTypeNone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

