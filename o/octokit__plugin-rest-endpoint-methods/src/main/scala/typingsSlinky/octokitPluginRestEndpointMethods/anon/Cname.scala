package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cname extends js.Object {
  var cname: Type
  var owner: Required
  var repo: Required
  var source: Enum
}

object Cname {
  @scala.inline
  def apply(cname: Type, owner: Required, repo: Required, source: Enum): Cname = {
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cname]
  }
}

