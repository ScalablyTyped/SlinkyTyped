package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoAuthoring extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Authors: CoAuthors = js.native
  val CanMerge: Boolean = js.native
  val CanShare: Boolean = js.native
  val Conflicts: typingsSlinky.activexWord.Word.Conflicts = js.native
  val Creator: Double = js.native
  val Locks: CoAuthLocks = js.native
  val Me: CoAuthor = js.native
  val Parent: js.Any = js.native
  val PendingUpdates: Boolean = js.native
  val Updates: CoAuthUpdates = js.native
  @JSName("Word.CoAuthoring_typekey")
  var WordDotCoAuthoring_typekey: CoAuthoring = js.native
}

object CoAuthoring {
  @scala.inline
  def apply(
    Application: Application,
    Authors: CoAuthors,
    CanMerge: Boolean,
    CanShare: Boolean,
    Conflicts: Conflicts,
    Creator: Double,
    Locks: CoAuthLocks,
    Me: CoAuthor,
    Parent: js.Any,
    PendingUpdates: Boolean,
    Updates: CoAuthUpdates,
    WordDotCoAuthoring_typekey: CoAuthoring
  ): CoAuthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Authors = Authors.asInstanceOf[js.Any], CanMerge = CanMerge.asInstanceOf[js.Any], CanShare = CanShare.asInstanceOf[js.Any], Conflicts = Conflicts.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Me = Me.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthoring_typekey")(WordDotCoAuthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthoring]
  }
  @scala.inline
  implicit class CoAuthoringOps[Self <: CoAuthoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthors(value: CoAuthors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflicts(value: Conflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocks(value: CoAuthLocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMe(value: CoAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdates(value: CoAuthUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotCoAuthoring_typekey(value: CoAuthoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CoAuthoring_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

