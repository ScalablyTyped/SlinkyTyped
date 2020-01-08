package typingsSlinky.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCognitoEventsRequest extends js.Object {
  /**
    * The Cognito Identity Pool ID for the request
    */
  var IdentityPoolId: typingsSlinky.awsDashSdk.clientsCognitosyncMod.IdentityPoolId = js.native
}

object GetCognitoEventsRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCognitoEventsRequest]
  }
}

