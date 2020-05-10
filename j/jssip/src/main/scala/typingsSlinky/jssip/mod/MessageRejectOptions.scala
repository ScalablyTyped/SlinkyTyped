package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRejectOptions extends js.Object {
  var body: js.UndefOr[String] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var reason_phrase: String = js.native
  var status_code: js.UndefOr[js.Array[Double]] = js.native
}

object MessageRejectOptions {
  @scala.inline
  def apply(reason_phrase: String): MessageRejectOptions = {
    val __obj = js.Dynamic.literal(reason_phrase = reason_phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRejectOptions]
  }
  @scala.inline
  implicit class MessageRejectOptionsOps[Self <: MessageRejectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason_phrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason_phrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_code(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(js.undefined)
        ret
    }
  }
  
}

