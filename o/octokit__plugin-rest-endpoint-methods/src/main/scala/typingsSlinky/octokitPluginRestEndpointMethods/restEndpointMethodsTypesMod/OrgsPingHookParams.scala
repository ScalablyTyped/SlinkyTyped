package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsPingHookParams extends js.Object {
  var hook_id: Double
  @JSName("org")
  var org_ : String
}

object OrgsPingHookParams {
  @scala.inline
  def apply(hook_id: Double, org_ : String): OrgsPingHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsPingHookParams]
  }
}

