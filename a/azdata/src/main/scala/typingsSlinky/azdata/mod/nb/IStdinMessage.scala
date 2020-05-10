package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.AnonPassword
import typingsSlinky.azdata.azdataStrings.stdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStdinMessage extends IMessage {
  var channel: stdin = js.native
  @JSName("content")
  var content_IStdinMessage: AnonPassword = js.native
}

object IStdinMessage {
  @scala.inline
  def apply(
    channel: stdin,
    content: AnonPassword,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IStdinMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStdinMessage]
  }
  @scala.inline
  implicit class IStdinMessageOps[Self <: IStdinMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: stdin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: AnonPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

