package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLocationOutput extends js.Object {
  /**
    * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by Region, see Regions and Endpoints.
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}

object GetBucketLocationOutput {
  @scala.inline
  def apply(): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
  @scala.inline
  implicit class GetBucketLocationOutputOps[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationConstraint(value: BucketLocationConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(js.undefined)
        ret
    }
  }
  
}

