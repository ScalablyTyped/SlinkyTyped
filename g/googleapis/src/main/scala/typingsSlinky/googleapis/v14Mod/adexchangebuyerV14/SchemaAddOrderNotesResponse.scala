package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddOrderNotesResponse extends js.Object {
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}

object SchemaAddOrderNotesResponse {
  @scala.inline
  def apply(): SchemaAddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddOrderNotesResponse]
  }
  @scala.inline
  implicit class SchemaAddOrderNotesResponseOps[Self <: SchemaAddOrderNotesResponse] (val x: Self) extends AnyVal {
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

