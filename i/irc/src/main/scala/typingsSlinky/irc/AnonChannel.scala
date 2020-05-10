package typingsSlinky.irc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChannel extends js.Object {
  var channel: AnonIdlength = js.native
  var kicklength: Double = js.native
  var maxlist: js.Array[Double] = js.native
  var maxtargets: js.Array[String] = js.native
  var modes: Double = js.native
  var nicklength: Double = js.native
  var topiclength: Double = js.native
  var usermodes: String = js.native
}

object AnonChannel {
  @scala.inline
  def apply(
    channel: AnonIdlength,
    kicklength: Double,
    maxlist: js.Array[Double],
    maxtargets: js.Array[String],
    modes: Double,
    nicklength: Double,
    topiclength: Double,
    usermodes: String
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], kicklength = kicklength.asInstanceOf[js.Any], maxlist = maxlist.asInstanceOf[js.Any], maxtargets = maxtargets.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], nicklength = nicklength.asInstanceOf[js.Any], topiclength = topiclength.asInstanceOf[js.Any], usermodes = usermodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
  @scala.inline
  implicit class AnonChannelOps[Self <: AnonChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: AnonIdlength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKicklength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kicklength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxlist(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxtargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxtargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNicklength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nicklength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopiclength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topiclength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsermodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usermodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

