package typingsSlinky.pixiJs.PIXI.interaction

import typingsSlinky.pixiJs.PIXI.DisplayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event class that mimics native DOM events.
  *
  * @class
  * @memberof PIXI.interaction
  */
@js.native
trait InteractionEvent extends js.Object {
  /**
    * The object whose event listener’s callback is currently being invoked.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#currentTarget
    */
  var currentTarget: DisplayObject = js.native
  /**
    * InteractionData related to this event
    *
    * @member {PIXI.interaction.InteractionData} PIXI.interaction.InteractionEvent#data
    */
  var data: InteractionData = js.native
  /**
    * Whether this event will continue propagating in the tree.
    *
    * Remaining events for the {@link stopsPropagatingAt} object
    * will still be dispatched.
    *
    * @member {boolean} PIXI.interaction.InteractionEvent#stopped
    */
  var stopped: Boolean = js.native
  /**
    * The object which caused this event to be dispatched.
    * For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#target
    */
  var target: DisplayObject = js.native
  /**
    * Type of the event
    *
    * @member {string} PIXI.interaction.InteractionEvent#type
    */
  var `type`: String = js.native
  /**
    * Resets the event.
    */
  def reset(): Unit = js.native
  /**
    * Prevents event from reaching any objects other than the current object.
    *
    */
  def stopPropagation(): Unit = js.native
}

object InteractionEvent {
  @scala.inline
  def apply(
    currentTarget: DisplayObject,
    data: InteractionData,
    reset: () => Unit,
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: DisplayObject,
    `type`: String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionEvent]
  }
  @scala.inline
  implicit class InteractionEventOps[Self <: InteractionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTarget(value: DisplayObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: InteractionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: DisplayObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

