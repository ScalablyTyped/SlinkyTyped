package typingsSlinky.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAcceleratedmobilepageurl.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpUrlsResource extends js.Object {
  /**
    * Returns AMP URL(s) and equivalent
    * [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
    */
  def batchGet(request: AnonAccesstoken): Request_[BatchGetAmpUrlsResponse] = js.native
}

object AmpUrlsResource {
  @scala.inline
  def apply(batchGet: AnonAccesstoken => Request_[BatchGetAmpUrlsResponse]): AmpUrlsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[AmpUrlsResource]
  }
  @scala.inline
  implicit class AmpUrlsResourceOps[Self <: AmpUrlsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchGet(value: AnonAccesstoken => Request_[BatchGetAmpUrlsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGet")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

