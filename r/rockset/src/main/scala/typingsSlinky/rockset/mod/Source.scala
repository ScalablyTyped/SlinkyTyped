package typingsSlinky.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  // configuration for ingestion from  a dynamodb table
  var dynamodb: js.UndefOr[SourceDynamoDb] = js.native
  
  // file upload details
  var file_upload: js.UndefOr[SourceFileUpload] = js.native
  
  // format parameters for data from this source
  var format_params: js.UndefOr[FormatParams] = js.native
  
  // configuration for ingestion from GCS
  var gcs: js.UndefOr[SourceGcs] = js.native
  
  // name of integration to use
  var integration_name: String = js.native
  
  // configuration for ingestion from kinesis stream
  var kinesis: js.UndefOr[SourceKinesis] = js.native
  
  // configuration for ingestion from Redshift
  var redshift: js.UndefOr[SourceRedshift] = js.native
  
  // configuration for ingestion from S3
  var s3: js.UndefOr[SourceS3] = js.native
  
  // the ingest status of this source
  var status: js.UndefOr[Status] = js.native
}
object Source {
  
  @scala.inline
  def apply(integration_name: String): Source = {
    val __obj = js.Dynamic.literal(integration_name = integration_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamodb(value: SourceDynamoDb): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setFile_upload(value: SourceFileUpload): Self = StObject.set(x, "file_upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_uploadUndefined: Self = StObject.set(x, "file_upload", js.undefined)
    
    @scala.inline
    def setFormat_params(value: FormatParams): Self = StObject.set(x, "format_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_paramsUndefined: Self = StObject.set(x, "format_params", js.undefined)
    
    @scala.inline
    def setGcs(value: SourceGcs): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    @scala.inline
    def setIntegration_name(value: String): Self = StObject.set(x, "integration_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesis(value: SourceKinesis): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setRedshift(value: SourceRedshift): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    @scala.inline
    def setS3(value: SourceS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
