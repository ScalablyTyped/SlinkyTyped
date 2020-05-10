package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDRTAccessResponse extends js.Object {
  /**
    * The list of Amazon S3 buckets accessed by the DRT.
    */
  var LogBucketList: js.UndefOr[typingsSlinky.awsSdk.shieldMod.LogBucketList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.shieldMod.RoleArn] = js.native
}

object DescribeDRTAccessResponse {
  @scala.inline
  def apply(): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
  @scala.inline
  implicit class DescribeDRTAccessResponseOps[Self <: DescribeDRTAccessResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogBucketList(value: LogBucketList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogBucketList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBucketList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogBucketList")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

