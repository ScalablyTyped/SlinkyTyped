package typingsSlinky.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetMetadata extends StObject {
  
  /**
    * The number of columns in the result set.
    */
  var columnCount: js.UndefOr[Long] = js.native
  
  /**
    * The metadata of the columns in the result set.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.native
}
object ResultSetMetadata {
  
  @scala.inline
  def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  
  @scala.inline
  implicit class ResultSetMetadataMutableBuilder[Self <: ResultSetMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnCount(value: Long): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setColumnMetadata(value: Metadata): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    @scala.inline
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columnMetadata", js.Array(value :_*))
  }
}
