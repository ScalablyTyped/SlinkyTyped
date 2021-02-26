package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTableRequest extends StObject {
  
  /**
    * The optional list of row keys that will be used to initially split the table into several tablets (tablets are similar to HBase regions). Given two split keys, `s1` and `s2`, three
    * tablets will be created, spanning the key ranges: `[, s1), [s1, s2), [s2, )`. Example: * Row keys := `["a", "apple", "custom", "customer_1", "customer_2",` `"other", "zz"]` *
    * initial_split_keys := `["apple", "customer_1", "customer_2", "other"]` * Key assignment: - Tablet 1 `[, apple) => {"a"}.` - Tablet 2 `[apple, customer_1) => {"apple", "custom"}.` -
    * Tablet 3 `[customer_1, customer_2) => {"customer_1"}.` - Tablet 4 `[customer_2, other) => {"customer_2"}.` - Tablet 5 `[other, ) => {"other", "zz"}.`
    */
  var initialSplits: js.UndefOr[js.Array[Split]] = js.native
  
  /** Required. The Table to create. */
  var table: js.UndefOr[Table] = js.native
  
  /** Required. The name by which the new table should be referred to within the parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`. Maximum 50 characters. */
  var tableId: js.UndefOr[String] = js.native
}
object CreateTableRequest {
  
  @scala.inline
  def apply(): CreateTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  @scala.inline
  implicit class CreateTableRequestMutableBuilder[Self <: CreateTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialSplits(value: js.Array[Split]): Self = StObject.set(x, "initialSplits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSplitsUndefined: Self = StObject.set(x, "initialSplits", js.undefined)
    
    @scala.inline
    def setInitialSplitsVarargs(value: Split*): Self = StObject.set(x, "initialSplits", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
