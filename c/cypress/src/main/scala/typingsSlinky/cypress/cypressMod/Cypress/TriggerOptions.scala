package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to change the default behavior of .trigger()
  */
@js.native
trait TriggerOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  /**
    * Whether the event bubbles
    *
    * @default true
    */
  var bubbles: Boolean = js.native
  /**
    * Whether the event is cancelable
    *
    * @default true
    */
  var cancelable: Boolean = js.native
}

object TriggerOptions {
  @scala.inline
  def apply(bubbles: Boolean, cancelable: Boolean, force: Boolean, log: Boolean, timeout: Double): TriggerOptions = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerOptions]
  }
  @scala.inline
  implicit class TriggerOptionsOps[Self <: TriggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

