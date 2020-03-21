package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Evidence extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var createdAt: js.Date
  var id: String
  var sendToProcessorAt: js.Date
  var url: js.UndefOr[String] = js.undefined
}

object Evidence {
  @scala.inline
  def apply(
    createdAt: js.Date,
    id: String,
    sendToProcessorAt: js.Date,
    comment: String = null,
    url: String = null
  ): Evidence = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sendToProcessorAt = sendToProcessorAt.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
}

