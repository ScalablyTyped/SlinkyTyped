package typingsSlinky.atPusherChatkitDashClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentPayload extends js.Object {
  var customData: js.UndefOr[js.Any] = js.undefined
  var name: String
  var size: Double
  var `type`: String
  def url(): js.Promise[String]
  def urlExpiry(): js.Promise[js.Date]
}

object AttachmentPayload {
  @scala.inline
  def apply(
    name: String,
    size: Double,
    `type`: String,
    url: () => js.Promise[String],
    urlExpiry: () => js.Promise[js.Date],
    customData: js.Any = null
  ): AttachmentPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = js.Any.fromFunction0(url), urlExpiry = js.Any.fromFunction0(urlExpiry))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentPayload]
  }
}

