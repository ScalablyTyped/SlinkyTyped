package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hookid extends js.Object {
  var hook_id: Required
  @JSName("org")
  var org_ : Required
}

object Hookid {
  @scala.inline
  def apply(hook_id: Required, org_ : Required): Hookid = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hookid]
  }
}

