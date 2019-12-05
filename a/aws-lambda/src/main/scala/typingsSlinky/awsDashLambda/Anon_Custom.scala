package typingsSlinky.awsDashLambda

import typingsSlinky.awsDashLambda.awsDashLambdaMod.CloudFrontCustomOrigin
import typingsSlinky.awsDashLambda.awsDashLambdaMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends CloudFrontOrigin {
  var custom: CloudFrontCustomOrigin
}

object Anon_Custom {
  @scala.inline
  def apply(custom: CloudFrontCustomOrigin): Anon_Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Custom]
  }
}

