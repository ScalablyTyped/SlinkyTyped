package typingsSlinky.pixiJs.PIXI.systems

import typingsSlinky.pixiJs.PIXI.DisplayObject
import typingsSlinky.pixiJs.PIXI.MaskData
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage stencils (used for masks).
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait StencilSystem extends System {
  /**
    * Pops stencil mask. MaskData is already removed from stack
    *
    * @param {PIXI.DisplayObject} maskObject - object of popped mask data
    */
  def pop(maskObject: DisplayObject): Unit = js.native
  /**
    * Applies the Mask and adds it to the current stencil stack.
    *
    * @param {PIXI.MaskData} maskData - The mask data
    */
  def push(maskData: MaskData): Unit = js.native
}

object StencilSystem {
  @scala.inline
  def apply(destroy: () => Unit, pop: DisplayObject => Unit, push: MaskData => Unit, renderer: Renderer): StencilSystem = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction1(push), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilSystem]
  }
  @scala.inline
  implicit class StencilSystemOps[Self <: StencilSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPop(value: DisplayObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPush(value: MaskData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

