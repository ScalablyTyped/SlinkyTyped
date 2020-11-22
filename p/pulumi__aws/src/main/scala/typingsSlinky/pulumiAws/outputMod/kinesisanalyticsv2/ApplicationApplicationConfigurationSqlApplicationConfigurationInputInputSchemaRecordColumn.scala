package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn extends js.Object {
  
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
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: String): Self = this.set("sqlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
}
