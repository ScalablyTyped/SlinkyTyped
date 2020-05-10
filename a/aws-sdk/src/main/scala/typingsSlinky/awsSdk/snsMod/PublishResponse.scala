package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishResponse extends js.Object {
  /**
    * Unique identifier assigned to the published message. Length Constraint: Maximum 100 characters
    */
  var MessageId: js.UndefOr[messageId] = js.native
}

object PublishResponse {
  @scala.inline
  def apply(): PublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishResponse]
  }
  @scala.inline
  implicit class PublishResponseOps[Self <: PublishResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageId(value: messageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageId")(js.undefined)
        ret
    }
  }
  
}

