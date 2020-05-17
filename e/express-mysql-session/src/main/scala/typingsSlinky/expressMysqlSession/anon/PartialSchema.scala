package typingsSlinky.expressMysqlSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-mysql-session.express-mysql-session.Schema> */
@js.native
trait PartialSchema extends js.Object {
  var columnNames: js.UndefOr[PartialColumnNames] = js.native
  var tableName: js.UndefOr[String] = js.native
}

object PartialSchema {
  @scala.inline
  def apply(): PartialSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchema]
  }
  @scala.inline
  implicit class PartialSchemaOps[Self <: PartialSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnNames(value: PartialColumnNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

