package typingsSlinky.awsLambda.cloudfrontRequestMod

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
  - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest
*/
trait CloudFrontRequestResult extends js.Object

object CloudFrontRequestResult {
  @scala.inline
  implicit def apply(value: CloudFrontRequest): CloudFrontRequestResult = value.asInstanceOf[CloudFrontRequestResult]
  @scala.inline
  implicit def apply(value: CloudFrontResultResponse): CloudFrontRequestResult = value.asInstanceOf[CloudFrontRequestResult]
  @scala.inline
  implicit def apply(value: Null): CloudFrontRequestResult = value.asInstanceOf[CloudFrontRequestResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CloudFrontRequestResult): CloudFrontRequestResult = value.asInstanceOf[CloudFrontRequestResult]
}

