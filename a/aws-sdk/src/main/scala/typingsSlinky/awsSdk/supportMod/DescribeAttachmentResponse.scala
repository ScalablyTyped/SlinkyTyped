package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttachmentResponse extends js.Object {
  /**
    * The attachment content and file name.
    */
  var attachment: js.UndefOr[Attachment] = js.native
}

object DescribeAttachmentResponse {
  @scala.inline
  def apply(): DescribeAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttachmentResponse]
  }
  @scala.inline
  implicit class DescribeAttachmentResponseOps[Self <: DescribeAttachmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
  }
  
}

