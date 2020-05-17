package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lockrepositories extends js.Object {
  var exclude_attachments: Type = js.native
  var lock_repositories: Type = js.native
  @JSName("org")
  var org_ : Required = js.native
  var repositories: Required = js.native
}

object Lockrepositories {
  @scala.inline
  def apply(exclude_attachments: Type, lock_repositories: Type, org_ : Required, repositories: Required): Lockrepositories = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockrepositories]
  }
  @scala.inline
  implicit class LockrepositoriesOps[Self <: Lockrepositories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude_attachments(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock_repositories(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

