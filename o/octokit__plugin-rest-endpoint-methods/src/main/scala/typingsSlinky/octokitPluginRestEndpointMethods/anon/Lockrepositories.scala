package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lockrepositories extends js.Object {
  var exclude_attachments: Type
  var lock_repositories: Type
  @JSName("org")
  var org_ : Required
  var repositories: Required
}

object Lockrepositories {
  @scala.inline
  def apply(exclude_attachments: Type, lock_repositories: Type, org_ : Required, repositories: Required): Lockrepositories = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockrepositories]
  }
}

