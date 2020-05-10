package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRedshift extends js.Object {
  // name of the database in Redshift Cluster
  var database: String = js.native
  // field in Redshift source table to monitor for updates
  var incremental_field: js.UndefOr[String] = js.native
  // schema which contains the Redshift table
  var schema: String = js.native
  // name of Redshift table containing data
  var table_name: String = js.native
}

object SourceRedshift {
  @scala.inline
  def apply(database: String, schema: String, table_name: String): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRedshift]
  }
  @scala.inline
  implicit class SourceRedshiftOps[Self <: SourceRedshift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncremental_field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncremental_field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental_field")(js.undefined)
        ret
    }
  }
  
}

