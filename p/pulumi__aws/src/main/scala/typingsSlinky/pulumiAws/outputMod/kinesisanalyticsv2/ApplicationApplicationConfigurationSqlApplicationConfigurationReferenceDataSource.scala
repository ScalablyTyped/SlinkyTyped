package typingsSlinky.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource extends StObject {
  
  var referenceId: String = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var referenceSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema = js.native
  
  /**
    * Identifies the S3 bucket and object that contains the reference data.
    */
  var s3ReferenceDataSource: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource = js.native
  
  /**
    * The name of the in-application table to create.
    */
  var tableName: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource {
  
  @scala.inline
  def apply(
    referenceId: String,
    referenceSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema,
    s3ReferenceDataSource: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource,
    tableName: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource = {
    val __obj = js.Dynamic.literal(referenceId = referenceId.asInstanceOf[js.Any], referenceSchema = referenceSchema.asInstanceOf[js.Any], s3ReferenceDataSource = s3ReferenceDataSource.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceSchema(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema
    ): Self = StObject.set(x, "referenceSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSource(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource
    ): Self = StObject.set(x, "s3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
