package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var name: Required
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object Page {
  @scala.inline
  def apply(name: Required, owner: Required, page: Type, per_page: Type, repo: Required): Page = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

