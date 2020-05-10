package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRetentionConfigurationsRequest extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.native
}

object DescribeRetentionConfigurationsRequest {
  @scala.inline
  def apply(): DescribeRetentionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
  }
  @scala.inline
  implicit class DescribeRetentionConfigurationsRequestOps[Self <: DescribeRetentionConfigurationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withRetentionConfigurationNames(value: RetentionConfigurationNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionConfigurationNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionConfigurationNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionConfigurationNames")(js.undefined)
        ret
    }
  }
  
}

