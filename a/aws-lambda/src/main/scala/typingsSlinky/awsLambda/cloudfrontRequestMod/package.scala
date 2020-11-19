package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudfrontRequestMod {
  
  type CloudFrontRequestCallback = typingsSlinky.awsLambda.handlerMod.Callback[typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult]
  
  type CloudFrontRequestHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestEvent, 
    typingsSlinky.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult
  ]
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontResultResponse
    - typingsSlinky.awsLambda.cloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[
    typingsSlinky.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult | scala.Null
  ]
}
