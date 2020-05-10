package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyJobOutput extends js.Object {
  /**
    * Contains detailed information about a copy job.
    */
  var CopyJob: js.UndefOr[typingsSlinky.awsSdk.backupMod.CopyJob] = js.native
}

object DescribeCopyJobOutput {
  @scala.inline
  def apply(): DescribeCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyJobOutput]
  }
  @scala.inline
  implicit class DescribeCopyJobOutputOps[Self <: DescribeCopyJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyJob(value: CopyJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyJob")(js.undefined)
        ret
    }
  }
  
}

