package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pubnub.AnonActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMessagesResponse extends js.Object {
  var channels: StringDictionary[js.Array[AnonActions]] = js.native
}

object FetchMessagesResponse {
  @scala.inline
  def apply(channels: StringDictionary[js.Array[AnonActions]]): FetchMessagesResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesResponse]
  }
  @scala.inline
  implicit class FetchMessagesResponseOps[Self <: FetchMessagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: StringDictionary[js.Array[AnonActions]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

