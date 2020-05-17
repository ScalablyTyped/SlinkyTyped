package typingsSlinky.pixiJs.PIXI.systems

import typingsSlinky.pixiJs.PIXI.MaskData
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage masks of certain type
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait AbstractMaskSystem extends System {
  /**
    * The mask stack
    * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
    */
  var maskStack: js.Array[MaskData] = js.native
  /**
    * gets count of masks of certain type
    * @returns {number}
    */
  def getStackLength(): Double = js.native
  /**
    * Changes the mask stack that is used by this System.
    *
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
}

object AbstractMaskSystem {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getStackLength: () => Double,
    maskStack: js.Array[MaskData],
    renderer: Renderer,
    setMaskStack: js.Array[MaskData] => Unit
  ): AbstractMaskSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStackLength = js.Any.fromFunction0(getStackLength), maskStack = maskStack.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setMaskStack = js.Any.fromFunction1(setMaskStack))
    __obj.asInstanceOf[AbstractMaskSystem]
  }
  @scala.inline
  implicit class AbstractMaskSystemOps[Self <: AbstractMaskSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStackLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStackLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMaskStack(value: js.Array[MaskData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetMaskStack(value: js.Array[MaskData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaskStack")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

