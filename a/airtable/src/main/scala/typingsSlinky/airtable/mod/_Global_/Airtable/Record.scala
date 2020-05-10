package typingsSlinky.airtable.mod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record[TFields] extends js.Object {
  var fields: TFields = js.native
  var id: String = js.native
}

object Record {
  @scala.inline
  def apply[TFields](fields: TFields, id: String): Record[TFields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record[TFields]]
  }
  @scala.inline
  implicit class RecordOps[Self[tfields] <: Record[tfields], TFields] (val x: Self[TFields]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFields] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFields]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TFields] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TFields] with Other]
    @scala.inline
    def withFields(value: TFields): Self[TFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[TFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

