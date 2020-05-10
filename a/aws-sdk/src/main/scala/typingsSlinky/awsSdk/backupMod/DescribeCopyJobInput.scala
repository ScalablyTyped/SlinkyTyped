package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to copy a resource.
    */
  var CopyJobId: String = js.native
}

object DescribeCopyJobInput {
  @scala.inline
  def apply(CopyJobId: String): DescribeCopyJobInput = {
    val __obj = js.Dynamic.literal(CopyJobId = CopyJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobInput]
  }
  @scala.inline
  implicit class DescribeCopyJobInputOps[Self <: DescribeCopyJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyJobId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

