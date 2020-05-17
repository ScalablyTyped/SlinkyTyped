package typingsSlinky.nano.anon

import typingsSlinky.nano.mod.MangoSelector
import typingsSlinky.nano.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  // Array of field names following the sort syntax.
  var fields: js.Array[SortOrder] = js.native
  // A selector to apply to documents at indexing time, creating a partial index.
  var partial_filter_selector: js.UndefOr[MangoSelector] = js.native
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[SortOrder]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[SortOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartial_filter_selector(value: MangoSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial_filter_selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartial_filter_selector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial_filter_selector")(js.undefined)
        ret
    }
  }
  
}

