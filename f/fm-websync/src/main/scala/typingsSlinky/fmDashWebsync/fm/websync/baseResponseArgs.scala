package typingsSlinky.fmDashWebsync.fm.websync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseResponseArgs extends baseArgs {
  /**
    * The singleton client.
    */
  var client: typingsSlinky.fmDashWebsync.fm.websync.client
  /**
    * The ID of the singleton client.
    */
  var clientId: String
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: js.Date
}

object baseResponseArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    meta: js.Any,
    timestamp: js.Date,
    StringDictionary: StringDictionary[js.Any] = null
  ): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[baseResponseArgs]
  }
}

