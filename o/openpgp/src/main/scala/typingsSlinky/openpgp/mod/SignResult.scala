package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.mod.message.Message
import typingsSlinky.openpgp.mod.signature.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignResult extends js.Object {
  var data: String | ReadableStream[String] | NodeStream = js.native
  var message: Message = js.native
  var signature: String | ReadableStream[String] | NodeStream | Signature = js.native
}

object SignResult {
  @scala.inline
  def apply(
    data: String | ReadableStream[String] | NodeStream,
    message: Message,
    signature: String | ReadableStream[String] | NodeStream | Signature
  ): SignResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignResult]
  }
  @scala.inline
  implicit class SignResultOps[Self <: SignResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | ReadableStream[String] | NodeStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String | ReadableStream[String] | NodeStream | Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

