package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionConfigurationRequest extends js.Object {
  /**
    *  The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that you want to update. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
  /**
    *  The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
}

object UpdateDistributionConfigurationRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    distributionConfigurationArn: DistributionConfigurationArn,
    distributions: DistributionList
  ): UpdateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateDistributionConfigurationRequestOps[Self <: UpdateDistributionConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistributionConfigurationArn(value: DistributionConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistributions(value: DistributionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

