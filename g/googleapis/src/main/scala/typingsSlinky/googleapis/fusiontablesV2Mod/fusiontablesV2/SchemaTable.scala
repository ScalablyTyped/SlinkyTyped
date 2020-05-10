package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a table.
  */
@js.native
trait SchemaTable extends js.Object {
  /**
    * Attribution assigned to the table.
    */
  var attribution: js.UndefOr[String] = js.native
  /**
    * Optional link for attribution.
    */
  var attributionLink: js.UndefOr[String] = js.native
  /**
    * Base table identifier if this table is a view or merged table.
    */
  var baseTableIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Default JSON schema for validating all JSON column properties.
    */
  var columnPropertiesJsonSchema: js.UndefOr[String] = js.native
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[SchemaColumn]] = js.native
  /**
    * Description assigned to the table.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Variable for whether table is exportable.
    */
  var isExportable: js.UndefOr[Boolean] = js.native
  /**
    * The kind of item this is. For a table, this is always fusiontables#table.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name assigned to a table.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * SQL that encodes the table definition for derived tables.
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * Encrypted unique alphanumeric identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
  /**
    * JSON object containing custom table properties.
    */
  var tablePropertiesJson: js.UndefOr[String] = js.native
  /**
    * JSON schema for validating the JSON table properties.
    */
  var tablePropertiesJsonSchema: js.UndefOr[String] = js.native
}

object SchemaTable {
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  @scala.inline
  implicit class SchemaTableOps[Self <: SchemaTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionLink")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseTableIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTableIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTableIds")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnPropertiesJsonSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPropertiesJsonSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnPropertiesJsonSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPropertiesJsonSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[SchemaColumn]): Self = {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExportable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExportable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExportable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExportable")(js.undefined)
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
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
    @scala.inline
    def withTablePropertiesJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePropertiesJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablePropertiesJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePropertiesJson")(js.undefined)
        ret
    }
    @scala.inline
    def withTablePropertiesJsonSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePropertiesJsonSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablePropertiesJsonSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablePropertiesJsonSchema")(js.undefined)
        ret
    }
  }
  
}

