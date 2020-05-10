package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.AnonDistributionDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontEvent extends js.Object {
  var config: AnonDistributionDomainName = js.native
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: AnonDistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEvent]
  }
  @scala.inline
  implicit class CloudFrontEventOps[Self <: CloudFrontEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: AnonDistributionDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

