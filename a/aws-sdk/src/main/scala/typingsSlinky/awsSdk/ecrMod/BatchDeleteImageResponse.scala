package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.native
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
}

object BatchDeleteImageResponse {
  @scala.inline
  def apply(): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
  @scala.inline
  implicit class BatchDeleteImageResponseOps[Self <: BatchDeleteImageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: ImageFailureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withImageIds(value: ImageIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageIds")(js.undefined)
        ret
    }
  }
  
}

