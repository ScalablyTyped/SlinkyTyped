package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDbColumn extends js.Object {
  var allowDBNull: js.UndefOr[Boolean] = js.native
  var baseCatalogName: String = js.native
  var baseColumnName: String = js.native
  var baseSchemaName: String = js.native
  var baseServerName: String = js.native
  var baseTableName: String = js.native
  var columnName: String = js.native
  var columnOrdinal: js.UndefOr[Double] = js.native
  var columnSize: js.UndefOr[Double] = js.native
  var dataType: String = js.native
  var dataTypeName: String = js.native
  var isAliased: js.UndefOr[Boolean] = js.native
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  var isBytes: js.UndefOr[Boolean] = js.native
  var isChars: js.UndefOr[Boolean] = js.native
  var isExpression: js.UndefOr[Boolean] = js.native
  var isHidden: js.UndefOr[Boolean] = js.native
  var isIdentity: js.UndefOr[Boolean] = js.native
  var isJson: js.UndefOr[Boolean] = js.native
  var isKey: js.UndefOr[Boolean] = js.native
  var isLong: js.UndefOr[Boolean] = js.native
  var isReadOnly: js.UndefOr[Boolean] = js.native
  var isSqlVariant: js.UndefOr[Boolean] = js.native
  var isUdt: js.UndefOr[Boolean] = js.native
  var isUnique: js.UndefOr[Boolean] = js.native
  var isXml: js.UndefOr[Boolean] = js.native
  var numericPrecision: js.UndefOr[Double] = js.native
  var numericScale: js.UndefOr[Double] = js.native
  var udtAssemblyQualifiedName: String = js.native
}

object IDbColumn {
  @scala.inline
  def apply(
    baseCatalogName: String,
    baseColumnName: String,
    baseSchemaName: String,
    baseServerName: String,
    baseTableName: String,
    columnName: String,
    dataType: String,
    dataTypeName: String,
    udtAssemblyQualifiedName: String
  ): IDbColumn = {
    val __obj = js.Dynamic.literal(baseCatalogName = baseCatalogName.asInstanceOf[js.Any], baseColumnName = baseColumnName.asInstanceOf[js.Any], baseSchemaName = baseSchemaName.asInstanceOf[js.Any], baseServerName = baseServerName.asInstanceOf[js.Any], baseTableName = baseTableName.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], dataTypeName = dataTypeName.asInstanceOf[js.Any], udtAssemblyQualifiedName = udtAssemblyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDbColumn]
  }
  @scala.inline
  implicit class IDbColumnOps[Self <: IDbColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseCatalogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCatalogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseSchemaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseSchemaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUdtAssemblyQualifiedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udtAssemblyQualifiedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowDBNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDBNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDBNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDBNull")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnOrdinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOrdinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOrdinal")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAliased(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAliased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAliased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAliased")(js.undefined)
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
    def withIsBytes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChars")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJson")(js.undefined)
        ret
    }
    @scala.inline
    def withIsKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLong")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSqlVariant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSqlVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSqlVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSqlVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUdt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUdt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUdt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUdt")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnique")(js.undefined)
        ret
    }
    @scala.inline
    def withIsXml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXml")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericScale")(js.undefined)
        ret
    }
  }
  
}

