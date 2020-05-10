package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to a SQL statement.
  */
@js.native
trait SchemaSqlresponse extends js.Object {
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * The kind of item this is. For responses to SQL queries, this is always
    * fusiontables#sqlresponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The rows in the table. For each cell we print out whatever cell value
    * (e.g., numeric, string) exists. Thus it is important that each cell
    * contains only one value.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object SchemaSqlresponse {
  @scala.inline
  def apply(): SchemaSqlresponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlresponse]
  }
  @scala.inline
  implicit class SchemaSqlresponseOps[Self <: SchemaSqlresponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

