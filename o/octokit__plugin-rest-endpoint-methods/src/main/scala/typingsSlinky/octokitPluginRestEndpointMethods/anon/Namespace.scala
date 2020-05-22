package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  var namespace: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object Namespace {
  @scala.inline
  def apply(namespace: Type, owner: Required, page: Type, per_page: Type, repo: Required): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

