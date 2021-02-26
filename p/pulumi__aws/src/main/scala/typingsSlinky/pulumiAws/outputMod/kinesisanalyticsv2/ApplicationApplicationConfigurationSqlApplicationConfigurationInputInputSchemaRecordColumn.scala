package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn extends StObject {
  
  /**
    * A reference to the data element in the streaming input or the reference data source.
    */
  var mapping: js.UndefOr[String] = js.native
  
  /**
    * The name of the column that is created in the in-application input stream or reference table.
    */
  var name: String = js.native
  
  /**
    * The type of column created in the in-application input stream or reference table.
    */
  var sqlType: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn {
  
  @scala.inline
  def apply(name: String, sqlType: String): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: String): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
  }
}
