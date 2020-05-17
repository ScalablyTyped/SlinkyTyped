package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fullscreen extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] = js.native
  var fullscreen: Boolean = js.native
}

object Fullscreen {
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement], fullscreen: Boolean): Fullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  @scala.inline
  implicit class FullscreenOps[Self <: Fullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

