package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAnnotateImagesRequest extends js.Object {
  /** Individual image annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AnnotateImageRequest]] = js.native
}

object BatchAnnotateImagesRequest {
  @scala.inline
  def apply(): BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateImagesRequest]
  }
  @scala.inline
  implicit class BatchAnnotateImagesRequestOps[Self <: BatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests(value: js.Array[AnnotateImageRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

