package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.PostEffectQueue
  * @classdesc Used to manage multiple post effects for a camera.
  * @description Create a new PostEffectQueue.
  * @param {pc.Application} app - The application.
  * @param {pc.CameraComponent} camera - The camera component.
  */
@js.native
trait PostEffectQueue extends js.Object {
  /**
    * @function
    * @name pc.PostEffectQueue#addEffect
    * @description Adds a post effect to the queue. If the queue is disabled adding a post effect will
    * automatically enable the queue.
    * @param {pc.PostEffect} effect - The post effect to add to the queue.
    */
  def addEffect(effect: PostEffect): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#destroy
    * @description Removes all the effects from the queue and disables it.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#disable
    * @description Disables the queue and all of its effects.
    */
  def disable(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#enable
    * @description Enables the queue and all of its effects. If there are no effects then the queue will not be enabled.
    */
  def enable(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#removeEffect
    * @description Removes a post effect from the queue. If the queue becomes empty it will be disabled automatically.
    * @param {pc.PostEffect} effect - The post effect to remove.
    */
  def removeEffect(effect: PostEffect): Unit = js.native
}

object PostEffectQueue {
  @scala.inline
  def apply(
    addEffect: PostEffect => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    removeEffect: PostEffect => Unit
  ): PostEffectQueue = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction1(addEffect), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), removeEffect = js.Any.fromFunction1(removeEffect))
    __obj.asInstanceOf[PostEffectQueue]
  }
  @scala.inline
  implicit class PostEffectQueueOps[Self <: PostEffectQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEffect(value: PostEffect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEffect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEffect(value: PostEffect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEffect")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

