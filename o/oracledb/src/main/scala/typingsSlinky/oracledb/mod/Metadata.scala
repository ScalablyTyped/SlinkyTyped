package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Included in the result of a query execution to describe details of the columns involved.
  */
@js.native
trait Metadata extends js.Object {
  /**
    * Database byte size. This is only set for DB_TYPE_VARCHAR, DB_TYPE_CHAR and DB_TYPE_RAW column types.
    */
  var byteSize: js.UndefOr[Double] = js.native
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: js.UndefOr[Double] = js.native
  /**
    * The class associated with the database type. This is only set if the database type is an object type.
    */
  var dbTypeClass: js.UndefOr[DBObjectClass] = js.native
  /**
    * Name of the database type, such as “NUMBER” or “VARCHAR2”. For object types, this will be the object name.
    */
  var dbTypeName: js.UndefOr[String] = js.native
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: js.UndefOr[Double] = js.native
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: String = js.native
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: js.UndefOr[Boolean] = js.native
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: js.UndefOr[Double] = js.native
}

object Metadata {
  @scala.inline
  def apply(name: String): Metadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def withByteSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDbType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbType")(js.undefined)
        ret
    }
    @scala.inline
    def withDbTypeClass(value: DBObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbTypeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbTypeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbTypeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDbTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchType")(js.undefined)
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
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
    def withPrecision(value: Double): Self = {
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
    def withScale(value: Double): Self = {
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
  }
  
}

