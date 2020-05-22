package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Readonly extends js.Object {
  var key: Required
  var owner: Required
  var read_only: Type
  var repo: Required
  var title: Type
}

object Readonly {
  @scala.inline
  def apply(key: Required, owner: Required, read_only: Type, repo: Required, title: Type): Readonly = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonly]
  }
}

