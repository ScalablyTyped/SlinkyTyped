package typingsSlinky.conventionalChangelogWriter.mod

import typingsSlinky.conventionalChangelogWriter.conventionalChangelogWriterBooleans.`false`
import typingsSlinky.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitGroup[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  
  var commits: js.Array[TransformedCommit[T]] = js.native
  
  var title: String | `false` = js.native
}
object CommitGroup {
  
  @scala.inline
  def apply[T /* <: Commit[String | Double | js.Symbol] */](commits: js.Array[TransformedCommit[T]], title: String | `false`): CommitGroup[T] = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitGroup[T]]
  }
  
  @scala.inline
  implicit class CommitGroupOps[Self <: CommitGroup[_], T /* <: Commit[String | Double | js.Symbol] */] (val x: Self with CommitGroup[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitsVarargs(value: TransformedCommit[T]*): Self = this.set("commits", js.Array(value :_*))
    
    @scala.inline
    def setCommits(value: js.Array[TransformedCommit[T]]): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
