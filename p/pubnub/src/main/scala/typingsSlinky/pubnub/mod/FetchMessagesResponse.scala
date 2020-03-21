package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pubnub.AnonActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMessagesResponse extends js.Object {
  var channels: StringDictionary[js.Array[AnonActions]]
}

object FetchMessagesResponse {
  @scala.inline
  def apply(channels: StringDictionary[js.Array[AnonActions]]): FetchMessagesResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchMessagesResponse]
  }
}

