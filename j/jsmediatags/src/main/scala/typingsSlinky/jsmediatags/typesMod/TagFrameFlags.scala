package typingsSlinky.jsmediatags.typesMod

import typingsSlinky.jsmediatags.AnonCompression
import typingsSlinky.jsmediatags.AnonFilealterpreservation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFrameFlags extends js.Object {
  var format: AnonCompression = js.native
  var message: AnonFilealterpreservation = js.native
}

object TagFrameFlags {
  @scala.inline
  def apply(format: AnonCompression, message: AnonFilealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameFlags]
  }
  @scala.inline
  implicit class TagFrameFlagsOps[Self <: TagFrameFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: AnonCompression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: AnonFilealterpreservation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

