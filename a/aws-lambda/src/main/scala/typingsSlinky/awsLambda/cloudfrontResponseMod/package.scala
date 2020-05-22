package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontResponseMod {
  type CloudFrontResponseCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult]
  type CloudFrontResponseHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.cloudfrontResponseMod.CloudFrontResponseEvent, 
    typingsSlinky.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult
  ]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse]
}
