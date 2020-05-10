package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteUpdate extends js.Object {
  /**
    * The updated note text.
    */
  var Text: NonEmptyString = js.native
  /**
    * The principal that updated the note.
    */
  var UpdatedBy: NonEmptyString = js.native
}

object NoteUpdate {
  @scala.inline
  def apply(Text: NonEmptyString, UpdatedBy: NonEmptyString): NoteUpdate = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], UpdatedBy = UpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteUpdate]
  }
  @scala.inline
  implicit class NoteUpdateOps[Self <: NoteUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedBy(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

