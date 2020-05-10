package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceCreditSpecificationsResult extends js.Object {
  /**
    * Information about the credit option for CPU usage of an instance.
    */
  var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeInstanceCreditSpecificationsResult {
  @scala.inline
  def apply(): DescribeInstanceCreditSpecificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceCreditSpecificationsResult]
  }
  @scala.inline
  implicit class DescribeInstanceCreditSpecificationsResultOps[Self <: DescribeInstanceCreditSpecificationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceCreditSpecifications(value: InstanceCreditSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreditSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCreditSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCreditSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

