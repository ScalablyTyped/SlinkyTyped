package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: Required
  var encoding: Type
  var owner: Required
  var repo: Required
}

object Content {
  @scala.inline
  def apply(content: Required, encoding: Type, owner: Required, repo: Required): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

