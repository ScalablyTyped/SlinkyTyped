package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBigtableColumnFamily extends js.Object {
  /**
    * [Optional] Lists of columns that should be exposed as individual fields
    * as opposed to a list of (column name, value) pairs. All columns whose
    * qualifier matches a qualifier in this list can be accessed as .. Other
    * columns can be accessed as a list through .Column field.
    */
  var columns: js.UndefOr[js.Array[SchemaBigtableColumn]] = js.native
  /**
    * [Optional] The encoding of the values when the type is not STRING.
    * Acceptable encoding values are: TEXT - indicates values are alphanumeric
    * text strings. BINARY - indicates values are encoded using HBase
    * Bytes.toBytes family of functions. This can be overridden for a specific
    * column by listing that column in &#39;columns&#39; and specifying an
    * encoding for it.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Identifier of the column family.
    */
  var familyId: js.UndefOr[String] = js.native
  /**
    * [Optional] If this is set only the latest version of value are exposed
    * for all columns in this column family. This can be overridden for a
    * specific column by listing that column in &#39;columns&#39; and
    * specifying a different setting for that column.
    */
  var onlyReadLatest: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The type to convert the value in cells of this column family.
    * The values are expected to be encoded using HBase Bytes.toBytes function
    * when using the BINARY encoding value. Following BigQuery types are
    * allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default
    * type is BYTES. This can be overridden for a specific column by listing
    * that column in &#39;columns&#39; and specifying a type for it.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaBigtableColumnFamily {
  @scala.inline
  def apply(): SchemaBigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigtableColumnFamily]
  }
  @scala.inline
  implicit class SchemaBigtableColumnFamilyOps[Self <: SchemaBigtableColumnFamily] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[SchemaBigtableColumn]): Self = {
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
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyReadLatest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReadLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyReadLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReadLatest")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

