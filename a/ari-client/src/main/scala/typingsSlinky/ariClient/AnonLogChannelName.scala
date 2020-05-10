package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogChannelName extends js.Object {
  var logChannelName: String = js.native
}

object AnonLogChannelName {
  @scala.inline
  def apply(logChannelName: String): AnonLogChannelName = {
    val __obj = js.Dynamic.literal(logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogChannelName]
  }
  @scala.inline
  implicit class AnonLogChannelNameOps[Self <: AnonLogChannelName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logChannelName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

