package typingsSlinky.reactMosaicComponent.mosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalMosaicWindowState extends js.Object {
  var additionalControlsOpen: Boolean = js.native
}

object InternalMosaicWindowState {
  @scala.inline
  def apply(additionalControlsOpen: Boolean): InternalMosaicWindowState = {
    val __obj = js.Dynamic.literal(additionalControlsOpen = additionalControlsOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalMosaicWindowState]
  }
  @scala.inline
  implicit class InternalMosaicWindowStateOps[Self <: InternalMosaicWindowState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalControlsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalControlsOpen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

