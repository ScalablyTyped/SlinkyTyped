package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Excludeattachments extends js.Object {
  var exclude_attachments: Type
  var lock_repositories: Type
  var repositories: Required
}

object Excludeattachments {
  @scala.inline
  def apply(exclude_attachments: Type, lock_repositories: Type, repositories: Required): Excludeattachments = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludeattachments]
  }
}

