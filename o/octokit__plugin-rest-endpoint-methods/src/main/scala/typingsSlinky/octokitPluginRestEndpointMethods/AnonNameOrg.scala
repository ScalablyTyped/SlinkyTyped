package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameOrg extends js.Object {
  var body: AnonType
  var name: AnonRequired
  var org: AnonRequired
}

object AnonNameOrg {
  @scala.inline
  def apply(body: AnonType, name: AnonRequired, org: AnonRequired): AnonNameOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameOrg]
  }
}

