package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoipAddressUsage extends js.Object {
  /**
    * The allocation ID of the address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  /**
    * The customer-owned IP address.
    */
  var CoIp: js.UndefOr[String] = js.native
}

object CoipAddressUsage {
  @scala.inline
  def apply(): CoipAddressUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipAddressUsage]
  }
  @scala.inline
  implicit class CoipAddressUsageOps[Self <: CoipAddressUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsService")(js.undefined)
        ret
    }
    @scala.inline
    def withCoIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoIp")(js.undefined)
        ret
    }
  }
  
}

