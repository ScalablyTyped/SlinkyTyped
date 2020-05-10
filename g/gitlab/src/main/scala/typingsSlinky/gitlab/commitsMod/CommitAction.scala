package typingsSlinky.gitlab.commitsMod

import typingsSlinky.gitlab.gitlabStrings.create
import typingsSlinky.gitlab.gitlabStrings.delete
import typingsSlinky.gitlab.gitlabStrings.move
import typingsSlinky.gitlab.gitlabStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitAction extends js.Object {
  /** The action to perform */
  var action: create | delete | move | update = js.native
  /** File content, required for all except delete. Optional for move */
  var content: js.UndefOr[String] = js.native
  /** text or base64. text is default. */
  var encoding: js.UndefOr[String] = js.native
  /** Full path to the file. Ex. lib/class.rb */
  var filePath: String = js.native
  /** Last known file commit id. Will be only considered in update, move and delete actions. */
  var lastCommitId: js.UndefOr[String] = js.native
  /** Original full path to the file being moved.Ex.lib / class1.rb */
  var previousPath: js.UndefOr[String] = js.native
}

object CommitAction {
  @scala.inline
  def apply(action: create | delete | move | update, filePath: String): CommitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitAction]
  }
  @scala.inline
  implicit class CommitActionOps[Self <: CommitAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: create | delete | move | update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withLastCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPath")(js.undefined)
        ret
    }
  }
  
}

