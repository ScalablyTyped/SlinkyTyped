package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var organization: Type
  var owner: Required
  var repo: Required
}

object Organization {
  @scala.inline
  def apply(organization: Type, owner: Required, repo: Required): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

