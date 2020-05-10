package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for adding a note to a given proposal.
  */
@js.native
trait SchemaAddNoteRequest extends js.Object {
  /**
    * Details of the note to add.
    */
  var note: js.UndefOr[SchemaNote] = js.native
}

object SchemaAddNoteRequest {
  @scala.inline
  def apply(): SchemaAddNoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNoteRequest]
  }
  @scala.inline
  implicit class SchemaAddNoteRequestOps[Self <: SchemaAddNoteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNote(value: SchemaNote): Self = {
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
  }
  
}

