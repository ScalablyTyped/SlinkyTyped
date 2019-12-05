package typingsSlinky.awsDashLambda

import typingsSlinky.awsDashLambda.awsDashLambdaMod.CloudFrontRequest
import typingsSlinky.awsDashLambda.awsDashLambdaMod.CloudFrontResponse
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.body
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.clientIp
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.headers
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.method
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.origin
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.querystring
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.uri
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  val request: Pick[
    CloudFrontRequest, 
    Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
  ]
  var response: CloudFrontResponse
}

object Anon_Body {
  @scala.inline
  def apply(
    request: Pick[
      CloudFrontRequest, 
      Exclude[body | clientIp | method | uri | querystring | headers | origin, body]
    ],
    response: CloudFrontResponse
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

