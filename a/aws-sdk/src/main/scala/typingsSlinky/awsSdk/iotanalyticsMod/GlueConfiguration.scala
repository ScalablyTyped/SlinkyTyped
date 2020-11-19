package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlueConfiguration extends js.Object {
  
  /**
    * The name of the database in your AWS Glue Data Catalog in which the table is located. (An AWS Glue Data Catalog database contains Glue Data tables.)
    */
  var databaseName: GlueDatabaseName = js.native
  
  /**
    * The name of the table in your AWS Glue Data Catalog which is used to perform the ETL (extract, transform and load) operations. (An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and targets.)
    */
  var tableName: GlueTableName = js.native
}
object GlueConfiguration {
  
  @scala.inline
  def apply(databaseName: GlueDatabaseName, tableName: GlueTableName): GlueConfiguration = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueConfiguration]
  }
  
  @scala.inline
  implicit class GlueConfigurationOps[Self <: GlueConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: GlueDatabaseName): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: GlueTableName): Self = this.set("tableName", value.asInstanceOf[js.Any])
  }
}
