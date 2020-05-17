package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement] = js.native
  var volume: Double = js.native
}

object Volume {
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLDivElement], volume: Double): Volume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
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
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

