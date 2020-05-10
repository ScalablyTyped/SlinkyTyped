package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StasisStart extends Event {
  /* Properties */
  var args: String | js.Array[String] = js.native
  var channel: Channel = js.native
  var replace_channel: js.UndefOr[Channel] = js.native
}

object StasisStart {
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    timestamp: js.Date,
    `type`: String
  ): StasisStart = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StasisStart]
  }
  @scala.inline
  implicit class StasisStartOps[Self <: StasisStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace_channel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace_channel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(js.undefined)
        ret
    }
  }
  
}

