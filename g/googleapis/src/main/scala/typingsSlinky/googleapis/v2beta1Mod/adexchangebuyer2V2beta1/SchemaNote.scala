package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A proposal may be associated to several notes.
  */
@js.native
trait SchemaNote extends js.Object {
  /**
    * The timestamp for when this note was created. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The role of the person (buyer/seller) creating the note. @OutputOnly
    */
  var creatorRole: js.UndefOr[String] = js.native
  /**
    * The actual note to attach. (max-length: 1024 unicode code units)  Note:
    * This field may be set only when creating the resource. Modifying this
    * field while updating the resource will result in an error.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The unique ID for the note. @OutputOnly
    */
  var noteId: js.UndefOr[String] = js.native
  /**
    * The revision number of the proposal when the note is created. @OutputOnly
    */
  var proposalRevision: js.UndefOr[String] = js.native
}

object SchemaNote {
  @scala.inline
  def apply(): SchemaNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNote]
  }
  @scala.inline
  implicit class SchemaNoteOps[Self <: SchemaNote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorRole")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevision")(js.undefined)
        ret
    }
  }
  
}

