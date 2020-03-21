package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustom extends CloudFrontOrigin {
  var custom: CloudFrontCustomOrigin
}

object AnonCustom {
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCustom]
  }
}

