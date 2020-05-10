package typingsSlinky.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishResponse extends js.Object {
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within
    * the topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
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
    def withMessageIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(js.undefined)
        ret
    }
  }
  
}

