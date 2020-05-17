package typingsSlinky.awsLambda.cloudfrontMod

import typingsSlinky.awsLambda.anon.Custom
import typingsSlinky.awsLambda.anon.S3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.anon.S3
  - typingsSlinky.awsLambda.anon.Custom
*/
trait CloudFrontOrigin extends js.Object

object CloudFrontOrigin {
  @scala.inline
  implicit def apply(value: Custom): CloudFrontOrigin = value.asInstanceOf[CloudFrontOrigin]
  @scala.inline
  implicit def apply(value: S3): CloudFrontOrigin = value.asInstanceOf[CloudFrontOrigin]
}

