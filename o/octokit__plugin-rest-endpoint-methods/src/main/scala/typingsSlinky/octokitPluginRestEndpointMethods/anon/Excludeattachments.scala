package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excludeattachments extends js.Object {
  var exclude_attachments: Type = js.native
  var lock_repositories: Type = js.native
  var repositories: Required = js.native
}

object Excludeattachments {
  @scala.inline
  def apply(exclude_attachments: Type, lock_repositories: Type, repositories: Required): Excludeattachments = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludeattachments]
  }
  @scala.inline
  implicit class ExcludeattachmentsOps[Self <: Excludeattachments] (val x: Self) extends AnyVal {
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
    def withRepositories(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

