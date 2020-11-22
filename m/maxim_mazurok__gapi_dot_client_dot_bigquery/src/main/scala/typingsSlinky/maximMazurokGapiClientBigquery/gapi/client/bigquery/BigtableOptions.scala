package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigtableOptions extends js.Object {
  
  /**
    * [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies
    * their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table
    * schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
    */
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.native
  
  /**
    * [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type
    * values. The default value is false.
    */
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast
    * them with CAST if necessary. The default value is false.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = this.set("columnFamilies", js.Array(value :_*))
    
    @scala.inline
    def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = this.set("columnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFamilies: Self = this.set("columnFamilies", js.undefined)
    
    @scala.inline
    def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = this.set("ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnspecifiedColumnFamilies: Self = this.set("ignoreUnspecifiedColumnFamilies", js.undefined)
    
    @scala.inline
    def setReadRowkeyAsString(value: Boolean): Self = this.set("readRowkeyAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRowkeyAsString: Self = this.set("readRowkeyAsString", js.undefined)
  }
}
