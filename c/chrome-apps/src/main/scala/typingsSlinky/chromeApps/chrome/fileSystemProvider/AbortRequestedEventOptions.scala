package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortRequestedEventOptions extends RequestedEventOptions {
  /** An ID of the request to which this operation is related. */
  var operationRequestId: integer = js.native
}

object AbortRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, operationRequestId: integer, requestId: integer): AbortRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortRequestedEventOptions]
  }
  @scala.inline
  implicit class AbortRequestedEventOptionsOps[Self <: AbortRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationRequestId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationRequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

