package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontRequestMod {
  type CloudFrontRequestCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult]
  type CloudFrontRequestHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestEvent, 
    typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult
  ]
}
