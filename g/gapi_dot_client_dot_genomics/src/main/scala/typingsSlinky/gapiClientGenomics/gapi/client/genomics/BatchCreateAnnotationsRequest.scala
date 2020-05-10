package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateAnnotationsRequest extends js.Object {
  /**
    * The annotations to be created. At most 4096 can be specified in a single
    * request.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * A unique request ID which enables the server to detect duplicated requests.
    * If provided, duplicated requests will result in the same response; if not
    * provided, duplicated requests may result in duplicated data. For a given
    * annotation set, callers should not reuse `request_id`s when writing
    * different batches of annotations - behavior in this case is undefined.
    * A common approach is to use a UUID. For batch jobs where worker crashes are
    * a possibility, consider using some unique variant of a worker or run ID.
    */
  var requestId: js.UndefOr[String] = js.native
}

object BatchCreateAnnotationsRequest {
  @scala.inline
  def apply(): BatchCreateAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAnnotationsRequest]
  }
  @scala.inline
  implicit class BatchCreateAnnotationsRequestOps[Self <: BatchCreateAnnotationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
  }
  
}

