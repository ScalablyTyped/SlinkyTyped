package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOwner extends js.Object {
  var body: Type
  var name: Required
  var owner: Required
  var repo: Required
}

object NameOwner {
  @scala.inline
  def apply(body: Type, name: Required, owner: Required, repo: Required): NameOwner = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOwner]
  }
}

