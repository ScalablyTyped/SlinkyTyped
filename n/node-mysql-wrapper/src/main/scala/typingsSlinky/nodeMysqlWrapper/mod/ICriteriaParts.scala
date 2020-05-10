package typingsSlinky.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICriteriaParts extends js.Object {
  var noDatabaseProperties: js.Array[String] = js.native
  var rawCriteriaObject: js.Any = js.native
  var tables: js.Array[TableToSearchPart] = js.native
  var whereClause: String = js.native
  def selectFromClause[T](_table: Table[T]): String = js.native
}

object ICriteriaParts {
  @scala.inline
  def apply(
    noDatabaseProperties: js.Array[String],
    rawCriteriaObject: js.Any,
    selectFromClause: Table[js.Any] => String,
    tables: js.Array[TableToSearchPart],
    whereClause: String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal(noDatabaseProperties = noDatabaseProperties.asInstanceOf[js.Any], rawCriteriaObject = rawCriteriaObject.asInstanceOf[js.Any], selectFromClause = js.Any.fromFunction1(selectFromClause), tables = tables.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICriteriaParts]
  }
  @scala.inline
  implicit class ICriteriaPartsOps[Self <: ICriteriaParts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoDatabaseProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDatabaseProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawCriteriaObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawCriteriaObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectFromClause(value: Table[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFromClause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTables(value: js.Array[TableToSearchPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhereClause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whereClause")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

