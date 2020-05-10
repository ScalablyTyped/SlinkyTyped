package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeAuthorizationMessageResponse extends js.Object {
  /**
    * An XML document that contains the decoded message.
    */
  var DecodedMessage: js.UndefOr[decodedMessageType] = js.native
}

object DecodeAuthorizationMessageResponse {
  @scala.inline
  def apply(): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
  @scala.inline
  implicit class DecodeAuthorizationMessageResponseOps[Self <: DecodeAuthorizationMessageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodedMessage(value: decodedMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecodedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecodedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecodedMessage")(js.undefined)
        ret
    }
  }
  
}

