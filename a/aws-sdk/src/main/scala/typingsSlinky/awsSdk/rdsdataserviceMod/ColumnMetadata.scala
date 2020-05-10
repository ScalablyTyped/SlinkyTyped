package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  /**
    * The type of the column.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.native
  /**
    * A value that indicates whether the column increments automatically.
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column is case-sensitive.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[Boolean] = js.native
  /**
    * The label for the column.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the column is nullable.
    */
  var nullable: js.UndefOr[Integer] = js.native
  /**
    * The precision value of a decimal number column.
    */
  var precision: js.UndefOr[Integer] = js.native
  /**
    * The scale value of a decimal number column.
    */
  var scale: js.UndefOr[Integer] = js.native
  /**
    * The name of the schema that owns the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.native
  /**
    * The name of the table that includes the column.
    */
  var tableName: js.UndefOr[String] = js.native
  /**
    * The type of the column.
    */
  var `type`: js.UndefOr[Integer] = js.native
  /**
    * The database-specific data type of the column.
    */
  var typeName: js.UndefOr[String] = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata]
  }
  @scala.inline
  implicit class ColumnMetadataOps[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBaseColumnType(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBaseColumnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayBaseColumnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBaseColumnType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutoIncrement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAutoIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCurrency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSigned")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def withNullable(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaName")(js.undefined)
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
    @scala.inline
    def withType(value: Integer): Self = {
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
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(js.undefined)
        ret
    }
  }
  
}

