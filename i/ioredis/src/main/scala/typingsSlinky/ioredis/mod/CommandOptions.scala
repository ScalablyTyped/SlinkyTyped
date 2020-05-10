package typingsSlinky.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandOptions extends js.Object {
  var errorStack: js.UndefOr[String] = js.native
  var keyPrefix: js.UndefOr[String] = js.native
  var replyEncoding: js.UndefOr[String | Null] = js.native
}

object CommandOptions {
  @scala.inline
  def apply(): CommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandOptions]
  }
  @scala.inline
  implicit class CommandOptionsOps[Self <: CommandOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStack")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyEncoding")(null)
        ret
    }
  }
  
}

