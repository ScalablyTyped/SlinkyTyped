package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLockrepositories extends js.Object {
  var exclude_attachments: AnonType = js.native
  var lock_repositories: AnonType = js.native
  var org: AnonRequired = js.native
  var repositories: AnonRequired = js.native
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
  @scala.inline
  implicit class AnonLockrepositoriesOps[Self <: AnonLockrepositories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude_attachments(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock_repositories(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

