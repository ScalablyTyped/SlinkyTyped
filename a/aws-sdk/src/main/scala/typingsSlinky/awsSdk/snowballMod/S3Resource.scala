package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
    */
  var BucketArn: js.UndefOr[ResourceARN] = js.native
  /**
    * For export jobs, you can provide an optional KeyRange within a specific Amazon S3 bucket. The length of the range is defined at job creation, and has either an inclusive BeginMarker, an inclusive EndMarker, or both. Ranges are UTF-8 binary sorted.
    */
  var KeyRange: js.UndefOr[typingsSlinky.awsSdk.snowballMod.KeyRange] = js.native
}

object S3Resource {
  @scala.inline
  def apply(): S3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Resource]
  }
  @scala.inline
  implicit class S3ResourceOps[Self <: S3Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketArn(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketArn")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyRange(value: KeyRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRange")(js.undefined)
        ret
    }
  }
  
}

