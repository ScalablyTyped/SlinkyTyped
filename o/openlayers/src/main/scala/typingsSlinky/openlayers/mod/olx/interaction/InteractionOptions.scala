package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for interactions.
  */
@js.native
trait InteractionOptions extends js.Object {
  def handleEvent(event: MapBrowserEvent): Boolean = js.native
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: MapBrowserEvent => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InteractionOptions]
  }
  @scala.inline
  implicit class InteractionOptionsOps[Self <: InteractionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleEvent(value: MapBrowserEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

