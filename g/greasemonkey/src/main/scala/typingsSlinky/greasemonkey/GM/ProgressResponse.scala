package typingsSlinky.greasemonkey.GM

import org.scalajs.dom.raw.Document
import typingsSlinky.greasemonkey.greasemonkeyBooleans.`false`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`1`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`2`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`3`
import typingsSlinky.greasemonkey.greasemonkeyNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponse[TContext] extends Response[TContext] {
  var lengthComputable: Boolean
  var loaded: Double
  var total: Double
}

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    readyState: `1` | `2` | `3` | `4`,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    responseXML: Document | `false`,
    status: Double,
    statusText: String,
    total: Double,
    context: TContext = null
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}

