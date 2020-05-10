package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A field or a column.
  */
@js.native
trait SchemaStandardSqlField extends js.Object {
  /**
    * Optional. The name of this field. Can be absent for struct fields.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The type of this parameter. Absent if not explicitly specified
    * (e.g., CREATE FUNCTION statement can omit the return type; in this case
    * the output parameter does not have this &quot;type&quot; field).
    */
  var `type`: js.UndefOr[SchemaStandardSqlDataType] = js.native
}

object SchemaStandardSqlField {
  @scala.inline
  def apply(): SchemaStandardSqlField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlField]
  }
  @scala.inline
  implicit class SchemaStandardSqlFieldOps[Self <: SchemaStandardSqlField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SchemaStandardSqlDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

