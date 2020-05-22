package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protected extends js.Object {
  var owner: Required
  var page: Type
  var per_page: Type
  var `protected`: Type
  var repo: Required
}

object Protected {
  @scala.inline
  def apply(owner: Required, page: Type, per_page: Type, `protected`: Type, repo: Required): Protected = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
}

