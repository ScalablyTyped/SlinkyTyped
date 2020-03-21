package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.AnonDistributionDomainName
import typingsSlinky.awsLambda.AnonEventType
import typingsSlinky.awsLambda.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: AnonDistributionDomainName with (AnonEventType | AnonRequestId)
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: AnonDistributionDomainName with (AnonEventType | AnonRequestId)): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

