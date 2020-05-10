package typingsSlinky.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  var sendAndArchive: js.UndefOr[Boolean] = js.native
}

object SendOptions {
  @scala.inline
  def apply(): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendAndArchive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAndArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAndArchive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAndArchive")(js.undefined)
        ret
    }
  }
  
}

