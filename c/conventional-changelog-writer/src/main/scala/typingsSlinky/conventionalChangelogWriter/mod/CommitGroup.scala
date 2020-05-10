package typingsSlinky.conventionalChangelogWriter.mod

import typingsSlinky.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typingsSlinky.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitGroup[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  var commits: js.Array[TransformedCommit[T]] = js.native
  var title: String | `false` = js.native
}

object CommitGroup {
  @scala.inline
  def apply[T](commits: js.Array[TransformedCommit[T]], title: String | `false`): CommitGroup[T] = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitGroup[T]]
  }
  @scala.inline
  implicit class CommitGroupOps[Self[t] <: CommitGroup[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCommits(value: js.Array[TransformedCommit[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

