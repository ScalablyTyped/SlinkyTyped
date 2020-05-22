package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgRequired extends js.Object {
  @JSName("org")
  var org_ : Required
}

object OrgRequired {
  @scala.inline
  def apply(org_ : Required): OrgRequired = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRequired]
  }
}

