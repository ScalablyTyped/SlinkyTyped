package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddOrderNotesRequest extends js.Object {
  /**
    * The list of notes to add.
    */
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}

object SchemaAddOrderNotesRequest {
  @scala.inline
  def apply(): SchemaAddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderNotesRequest]
  }
  @scala.inline
  implicit class SchemaAddOrderNotesRequestOps[Self <: SchemaAddOrderNotesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotes(value: js.Array[SchemaMarketplaceNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
  }
  
}

