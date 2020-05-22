package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  var anon: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object Anon {
  @scala.inline
  def apply(anon: Type, owner: Required, page: Type, per_page: Type, repo: Required): Anon = {
    val __obj = js.Dynamic.literal(anon = anon.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

