package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketVersioningOutput extends js.Object {
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
    */
  var MFADelete: js.UndefOr[MFADeleteStatus] = js.native
  /**
    * The versioning state of the bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.native
}

object GetBucketVersioningOutput {
  @scala.inline
  def apply(): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
  @scala.inline
  implicit class GetBucketVersioningOutputOps[Self <: GetBucketVersioningOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFADelete(value: MFADeleteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFADelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFADelete")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: BucketVersioningStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

