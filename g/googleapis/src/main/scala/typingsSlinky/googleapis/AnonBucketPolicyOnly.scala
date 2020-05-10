package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucketPolicyOnly extends js.Object {
  var bucketPolicyOnly: js.UndefOr[AnonEnabled] = js.native
}

object AnonBucketPolicyOnly {
  @scala.inline
  def apply(): AnonBucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBucketPolicyOnly]
  }
  @scala.inline
  implicit class AnonBucketPolicyOnlyOps[Self <: AnonBucketPolicyOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketPolicyOnly(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPolicyOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketPolicyOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPolicyOnly")(js.undefined)
        ret
    }
  }
  
}

