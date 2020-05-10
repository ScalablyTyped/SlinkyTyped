package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableSchema extends js.Object {
  /**
    * Describes the fields in a table.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
}

object SchemaTableSchema {
  @scala.inline
  def apply(): SchemaTableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableSchema]
  }
  @scala.inline
  implicit class SchemaTableSchemaOps[Self <: SchemaTableSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[SchemaTableFieldSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

