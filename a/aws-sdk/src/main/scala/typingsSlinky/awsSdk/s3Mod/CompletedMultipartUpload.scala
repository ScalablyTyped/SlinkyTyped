package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedMultipartUpload extends js.Object {
  /**
    * Array of CompletedPart data types.
    */
  var Parts: js.UndefOr[CompletedPartList] = js.native
}

object CompletedMultipartUpload {
  @scala.inline
  def apply(): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
  @scala.inline
  implicit class CompletedMultipartUploadOps[Self <: CompletedMultipartUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParts(value: CompletedPartList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parts")(js.undefined)
        ret
    }
  }
  
}

