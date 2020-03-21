package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLockrepositories extends js.Object {
  var exclude_attachments: AnonType
  var lock_repositories: AnonType
  var org: AnonRequired
  var repositories: AnonRequired
}

object AnonLockrepositories {
  @scala.inline
  def apply(
    exclude_attachments: AnonType,
    lock_repositories: AnonType,
    org: AnonRequired,
    repositories: AnonRequired
  ): AnonLockrepositories = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLockrepositories]
  }
}

