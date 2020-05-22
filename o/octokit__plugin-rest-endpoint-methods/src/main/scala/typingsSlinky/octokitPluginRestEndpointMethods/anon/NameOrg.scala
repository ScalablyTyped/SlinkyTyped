package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOrg extends js.Object {
  var body: Type
  var name: Required
  @JSName("org")
  var org_ : Required
}

object NameOrg {
  @scala.inline
  def apply(body: Type, name: Required, org_ : Required): NameOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOrg]
  }
}

