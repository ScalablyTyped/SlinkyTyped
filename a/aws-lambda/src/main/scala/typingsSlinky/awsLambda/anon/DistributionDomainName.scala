package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.`origin-request`
import typingsSlinky.awsLambda.awsLambdaStrings.`origin-response`
import typingsSlinky.awsLambda.awsLambdaStrings.`viewer-request`
import typingsSlinky.awsLambda.awsLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionDomainName extends js.Object {
  val distributionDomainName: String = js.native
  val distributionId: String = js.native
  val eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response` = js.native
  val requestId: String = js.native
}

object DistributionDomainName {
  @scala.inline
  def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`,
    requestId: String
  ): DistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDomainName]
  }
  @scala.inline
  implicit class DistributionDomainNameOps[Self <: DistributionDomainName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributionDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistributionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

