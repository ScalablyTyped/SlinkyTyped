package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordColumn extends StObject {
  
  /**
    * A reference to the data element in the streaming input or the reference data source.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.native
  
  /**
    * The name of the column that is created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName = js.native
  
  /**
    * The type of column created in the in-application input stream or reference table.
    */
  var SqlType: RecordColumnSqlType = js.native
}
object RecordColumn {
  
  @scala.inline
  def apply(Name: RecordColumnName, SqlType: RecordColumnSqlType): RecordColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlType = SqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordColumn]
  }
  
  @scala.inline
  implicit class RecordColumnMutableBuilder[Self <: RecordColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: RecordColumnMapping): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "Mapping", js.undefined)
    
    @scala.inline
    def setName(value: RecordColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: RecordColumnSqlType): Self = StObject.set(x, "SqlType", value.asInstanceOf[js.Any])
  }
}
