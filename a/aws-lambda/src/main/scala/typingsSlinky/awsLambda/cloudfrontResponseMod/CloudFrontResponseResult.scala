package typingsSlinky.awsLambda.cloudfrontResponseMod

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
*/
trait CloudFrontResponseResult extends js.Object

object CloudFrontResponseResult {
  @scala.inline
  implicit def apply(value: CloudFrontResultResponse): CloudFrontResponseResult = value.asInstanceOf[CloudFrontResponseResult]
  @scala.inline
  implicit def apply(value: Null): CloudFrontResponseResult = value.asInstanceOf[CloudFrontResponseResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CloudFrontResponseResult): CloudFrontResponseResult = value.asInstanceOf[CloudFrontResponseResult]
}

