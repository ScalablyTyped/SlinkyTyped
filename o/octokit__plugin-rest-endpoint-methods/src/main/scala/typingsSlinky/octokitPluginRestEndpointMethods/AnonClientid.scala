package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientid extends js.Object {
  var access_token: AnonType
  var client_id: AnonRequired
}

object AnonClientid {
  @scala.inline
  def apply(access_token: AnonType, client_id: AnonRequired): AnonClientid = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientid]
  }
}

