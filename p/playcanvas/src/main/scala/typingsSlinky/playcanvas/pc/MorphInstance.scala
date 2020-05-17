package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MorphInstance
  * @classdesc An instance of pc.Morph. Contains weights to assign to every pc.MorphTarget, holds morphed buffer and associated data.
  * @param {pc.Morph} morph - The pc.Morph to instance.
  */
@js.native
trait MorphInstance extends js.Object {
  /**
    * @function
    * @name pc.MorphInstance#destroy
    * @description Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#getWeight
    * @description Gets current weight of the specified morph target.
    * @param {number} index - An index of morph target.
    * @returns {number} Weight.
    */
  def getWeight(index: Double): Double = js.native
  /**
    * @function
    * @name pc.MorphInstance#setWeight
    * @description Sets weight of the specified morph target.
    * @param {number} index - An index of morph target.
    * @param {number} weight - Weight.
    */
  def setWeight(index: Double, weight: Double): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#update
    * @param {pc.Mesh} mesh - Base mesh for the morph.
    * @description Performs morphing. Called automatically by renderer.
    */
  def update(mesh: Mesh): Unit = js.native
  /**
    * @function
    * @name pc.MorphInstance#updateBounds
    * @param {pc.Mesh} mesh - Base mesh for the morph.
    * @description Calculates AABB for this morph instance. Called automatically by renderer.
    */
  def updateBounds(mesh: Mesh): Unit = js.native
}

object MorphInstance {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getWeight: Double => Double,
    setWeight: (Double, Double) => Unit,
    update: Mesh => Unit,
    updateBounds: Mesh => Unit
  ): MorphInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getWeight = js.Any.fromFunction1(getWeight), setWeight = js.Any.fromFunction2(setWeight), update = js.Any.fromFunction1(update), updateBounds = js.Any.fromFunction1(updateBounds))
    __obj.asInstanceOf[MorphInstance]
  }
  @scala.inline
  implicit class MorphInstanceOps[Self <: MorphInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeight(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeight(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Mesh => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateBounds(value: Mesh => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBounds")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

