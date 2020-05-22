package typingsSlinky.awsSdkClientS3Browser.typesCompletedMultipartUploadMod

import typingsSlinky.awsSdkClientS3Browser.typesCompletedPartMod.CompletedPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedMultipartUpload extends js.Object {
  /**
    * _CompletedPartList shape
    */
  var Parts: js.UndefOr[js.Array[CompletedPart] | js.Iterable[CompletedPart]] = js.undefined
}

object CompletedMultipartUpload {
  @scala.inline
  def apply(Parts: js.Array[CompletedPart] | js.Iterable[CompletedPart] = null): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
}

