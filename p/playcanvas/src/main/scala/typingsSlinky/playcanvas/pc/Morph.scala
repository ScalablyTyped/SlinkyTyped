package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Morph
  * @classdesc Contains a list of pc.MorphTarget, a combined AABB and some associated data.
  * @param {pc.MorphTarget[]} targets - A list of morph targets.
  */
@js.native
trait Morph extends js.Object {
  /**
    * @function
    * @name pc.Morph#addTarget
    * @description Adds a new morph target to the list.
    * @param {pc.MorphTarget} target - A new morph target.
    */
  def addTarget(target: MorphTarget): Unit = js.native
  /**
    * @function
    * @name pc.Morph#getTarget
    * @description Gets the morph target by index.
    * @param {number} index - An index of morph target.
    * @returns {pc.MorphTarget} A morph target object.
    */
  def getTarget(index: Double): MorphTarget = js.native
  /**
    * @function
    * @name pc.Morph#removeTarget
    * @description Remove the specified morph target from the list.
    * @param {pc.MorphTarget} target - A morph target to delete.
    */
  def removeTarget(target: MorphTarget): Unit = js.native
}

object Morph {
  @scala.inline
  def apply(
    addTarget: MorphTarget => Unit,
    getTarget: Double => MorphTarget,
    removeTarget: MorphTarget => Unit
  ): Morph = {
    val __obj = js.Dynamic.literal(addTarget = js.Any.fromFunction1(addTarget), getTarget = js.Any.fromFunction1(getTarget), removeTarget = js.Any.fromFunction1(removeTarget))
    __obj.asInstanceOf[Morph]
  }
  @scala.inline
  implicit class MorphOps[Self <: Morph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTarget(value: MorphTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTarget(value: Double => MorphTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveTarget(value: MorphTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTarget")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

