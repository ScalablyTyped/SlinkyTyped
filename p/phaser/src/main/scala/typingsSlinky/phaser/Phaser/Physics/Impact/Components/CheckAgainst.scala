package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Check Against component.
  * Should be applied as a mixin.
  */
@js.native
trait CheckAgainst extends js.Object {
  /**
    * [description]
    */
  var checkAgainst: Double = js.native
  /**
    * [description]
    */
  def setAvsB(): GameObject = js.native
  /**
    * [description]
    */
  def setBvsA(): GameObject = js.native
  /**
    * [description]
    */
  def setCheckAgainstA(): GameObject = js.native
  /**
    * [description]
    */
  def setCheckAgainstB(): GameObject = js.native
  /**
    * [description]
    */
  def setCheckAgainstNone(): GameObject = js.native
}

object CheckAgainst {
  @scala.inline
  def apply(
    checkAgainst: Double,
    setAvsB: () => GameObject,
    setBvsA: () => GameObject,
    setCheckAgainstA: () => GameObject,
    setCheckAgainstB: () => GameObject,
    setCheckAgainstNone: () => GameObject
  ): CheckAgainst = {
    val __obj = js.Dynamic.literal(checkAgainst = checkAgainst.asInstanceOf[js.Any], setAvsB = js.Any.fromFunction0(setAvsB), setBvsA = js.Any.fromFunction0(setBvsA), setCheckAgainstA = js.Any.fromFunction0(setCheckAgainstA), setCheckAgainstB = js.Any.fromFunction0(setCheckAgainstB), setCheckAgainstNone = js.Any.fromFunction0(setCheckAgainstNone))
    __obj.asInstanceOf[CheckAgainst]
  }
  @scala.inline
  implicit class CheckAgainstOps[Self <: CheckAgainst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAgainst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAgainst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAvsB(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAvsB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBvsA(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBvsA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCheckAgainstA(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCheckAgainstA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCheckAgainstB(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCheckAgainstB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCheckAgainstNone(value: () => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCheckAgainstNone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

