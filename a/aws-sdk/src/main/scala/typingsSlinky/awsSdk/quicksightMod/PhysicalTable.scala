package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicalTable extends StObject {
  
  /**
    * A physical table type built from the results of the custom SQL query.
    */
  var CustomSql: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CustomSql] = js.native
  
  /**
    * A physical table type for relational data sources.
    */
  var RelationalTable: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RelationalTable] = js.native
  
  /**
    * A physical table type for as S3 data source.
    */
  var S3Source: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.S3Source] = js.native
}
object PhysicalTable {
  
  @scala.inline
  def apply(): PhysicalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalTable]
  }
  
  @scala.inline
  implicit class PhysicalTableMutableBuilder[Self <: PhysicalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSql(value: CustomSql): Self = StObject.set(x, "CustomSql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSqlUndefined: Self = StObject.set(x, "CustomSql", js.undefined)
    
    @scala.inline
    def setRelationalTable(value: RelationalTable): Self = StObject.set(x, "RelationalTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalTableUndefined: Self = StObject.set(x, "RelationalTable", js.undefined)
    
    @scala.inline
    def setS3Source(value: S3Source): Self = StObject.set(x, "S3Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SourceUndefined: Self = StObject.set(x, "S3Source", js.undefined)
  }
}
