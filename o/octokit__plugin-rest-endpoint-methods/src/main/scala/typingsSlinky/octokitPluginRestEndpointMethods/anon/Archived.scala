package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archived extends js.Object {
  var archived: Type = js.native
  var card_id: Required = js.native
  var note: Type = js.native
}

object Archived {
  @scala.inline
  def apply(archived: Type, card_id: Required, note: Type): Archived = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], card_id = card_id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archived]
  }
  @scala.inline
  implicit class ArchivedOps[Self <: Archived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

