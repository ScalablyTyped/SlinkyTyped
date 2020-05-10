package typingsSlinky.conventionalChangelogWriter.mod

import typingsSlinky.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typingsSlinky.conventionalCommitsParser.mod.Commit.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteGroup extends js.Object {
  var commits: js.Array[Note] = js.native
  var title: String | `false` = js.native
}

object NoteGroup {
  @scala.inline
  def apply(commits: js.Array[Note], title: String | `false`): NoteGroup = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteGroup]
  }
  @scala.inline
  implicit class NoteGroupOps[Self <: NoteGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommits(value: js.Array[Note]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

