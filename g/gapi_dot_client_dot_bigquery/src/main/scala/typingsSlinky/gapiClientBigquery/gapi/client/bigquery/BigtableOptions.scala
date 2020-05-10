package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigtableOptions extends js.Object {
  /**
    * [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced
    * in queries and specifies their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this
    * list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced
    * in that query are read from Bigtable.
    */
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.native
  /**
    * [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise,
    * they are read with BYTES type values. The default value is false.
    */
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and
    * users need to manually cast them with CAST if necessary. The default value is false.
    */
  var readRowkeyAsString: js.UndefOr[Boolean] = js.native
}

object BigtableOptions {
  @scala.inline
  def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  @scala.inline
  implicit class BigtableOptionsOps[Self <: BigtableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnspecifiedColumnFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnspecifiedColumnFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnspecifiedColumnFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRowkeyAsString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRowkeyAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRowkeyAsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRowkeyAsString")(js.undefined)
        ret
    }
  }
  
}

