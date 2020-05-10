package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOptions extends js.Object {
  var cipher: js.Any = js.native
}

object ChannelOptions {
  @scala.inline
  def apply(cipher: js.Any): ChannelOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCipher(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

