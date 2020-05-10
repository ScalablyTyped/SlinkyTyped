package typingsSlinky.phaser.Phaser.Types.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Phaser Input Event Data object.
  * 
  * This object is passed to the registered event listeners and allows you to stop any further propagation.
  */
@js.native
trait EventData extends js.Object {
  /**
    * The cancelled state of this Event.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  /**
    * Call this method to stop this event from passing any further down the event chain.
    */
  var stopPropagation: js.Function = js.native
}

object EventData {
  @scala.inline
  def apply(stopPropagation: js.Function): EventData = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStopPropagation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.undefined)
        ret
    }
  }
  
}

