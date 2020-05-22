package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontCustomOrigin
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends CloudFrontOrigin {
  var custom: CloudFrontCustomOrigin
}

object Custom {
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

