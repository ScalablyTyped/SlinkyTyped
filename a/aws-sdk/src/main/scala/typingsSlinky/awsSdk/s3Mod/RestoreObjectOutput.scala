package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreObjectOutput extends js.Object {
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * Indicates the path in the provided S3 output location where Select results will be restored to.
    */
  var RestoreOutputPath: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RestoreOutputPath] = js.native
}

object RestoreObjectOutput {
  @scala.inline
  def apply(): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreObjectOutput]
  }
  @scala.inline
  implicit class RestoreObjectOutputOps[Self <: RestoreObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestCharged(value: RequestCharged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCharged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCharged")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreOutputPath(value: RestoreOutputPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreOutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreOutputPath")(js.undefined)
        ret
    }
  }
  
}

