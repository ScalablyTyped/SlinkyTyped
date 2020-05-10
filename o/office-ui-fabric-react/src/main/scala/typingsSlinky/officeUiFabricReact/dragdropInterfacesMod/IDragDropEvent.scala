package typingsSlinky.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropEvent extends js.Object {
  /**
    * Whether or not the drag & drop event was handled.
    */
  var isHandled: js.UndefOr[Boolean] = js.native
}

object IDragDropEvent {
  @scala.inline
  def apply(): IDragDropEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDropEvent]
  }
  @scala.inline
  implicit class IDragDropEventOps[Self <: IDragDropEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHandled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHandled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHandled")(js.undefined)
        ret
    }
  }
  
}

