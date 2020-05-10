package typingsSlinky.conventionalChangelogWriter.mod.GeneratedContext

import typingsSlinky.conventionalChangelogWriter.mod.CommitGroup
import typingsSlinky.conventionalChangelogWriter.mod.NoteGroup
import typingsSlinky.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraContext[T /* <: Commit[String | Double | js.Symbol] */] extends js.Object {
  /**
    * @default
    * []
    */
  var commitGroups: js.Array[CommitGroup[T]] = js.native
  /**
    * @default
    * []
    */
  var noteGroups: js.Array[NoteGroup] = js.native
}

object ExtraContext {
  @scala.inline
  def apply[T](commitGroups: js.Array[CommitGroup[T]], noteGroups: js.Array[NoteGroup]): ExtraContext[T] = {
    val __obj = js.Dynamic.literal(commitGroups = commitGroups.asInstanceOf[js.Any], noteGroups = noteGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraContext[T]]
  }
  @scala.inline
  implicit class ExtraContextOps[Self[t] <: ExtraContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCommitGroups(value: js.Array[CommitGroup[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoteGroups(value: js.Array[NoteGroup]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

