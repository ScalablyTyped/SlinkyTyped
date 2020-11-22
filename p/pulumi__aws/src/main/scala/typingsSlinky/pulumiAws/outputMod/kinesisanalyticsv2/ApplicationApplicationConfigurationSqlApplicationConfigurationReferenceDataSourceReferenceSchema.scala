package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema extends js.Object {
  
  /**
    * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
    */
  var recordColumns: js.Array[
    ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn
  ] = js.native
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
    */
  var recordEncoding: js.UndefOr[String] = js.native
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var recordFormat: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema {
  
  @scala.inline
  def apply(
    recordColumns: js.Array[
      ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn
    ],
    recordFormat: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema] (val x: Self) extends AnyVal {
    
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
    def setRecordColumnsVarargs(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn*
    ): Self = this.set("recordColumns", js.Array(value :_*))
    
    @scala.inline
    def setRecordColumns(
      value: js.Array[
          ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn
        ]
    ): Self = this.set("recordColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormat(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat
    ): Self = this.set("recordFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordEncoding(value: String): Self = this.set("recordEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordEncoding: Self = this.set("recordEncoding", js.undefined)
  }
}
