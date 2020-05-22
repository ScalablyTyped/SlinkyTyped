package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ignored extends js.Object {
  var ignored: Type
  var owner: Required
  var repo: Required
  var subscribed: Type
}

object Ignored {
  @scala.inline
  def apply(ignored: Type, owner: Required, repo: Required, subscribed: Type): Ignored = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignored]
  }
}

