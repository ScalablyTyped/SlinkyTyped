package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffiliationOwner extends js.Object {
  var affiliation: Enum
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object AffiliationOwner {
  @scala.inline
  def apply(affiliation: Enum, owner: Required, page: Type, per_page: Type, repo: Required): AffiliationOwner = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffiliationOwner]
  }
}

